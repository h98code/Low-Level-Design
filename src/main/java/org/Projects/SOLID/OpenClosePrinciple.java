package org.Projects.SOLID;

import java.util.List;

class Products{
    String name;
    double price;

    Products(String name, double price){
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart{
    List<Products> products;

    ShoppingCart(List<Products> products){
        this.products = products;
    }
}

class InvoicePrinter{
    ShoppingCart shoppingCart;

    InvoicePrinter(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void printInvoice(){
        System.out.println("Invoice:");
        for(Products p : shoppingCart.products){
            System.out.println(p.name + " : " +  p.price);
        }
    }
}

interface SaveToDB{
    public void save();
}

class saveToSQLDB implements SaveToDB{
    @Override
    public void save() {
        System.out.println("Save to SQLDB");
    }
}

class saveToFile implements SaveToDB{
    @Override
    public void save() {
        System.out.println("Save to File");
    }
}

class saveToCSV implements SaveToDB{
    @Override
    public void save() {
        System.out.println("Save to CSV");
    }
}

public class OpenClosePrinciple {
    public static void main(String[] args) {
        Products p1 = new Products("desktop", 100.0);
        Products p2 = new Products("monitor", 200.0);

        ShoppingCart cart = new ShoppingCart(List.of(p1, p2));
        SaveToDB saveObj = new saveToCSV();
        saveObj.save();
        SaveToDB saveObj2 = new saveToFile();
        saveObj2.save();
        InvoicePrinter invoicePrinter = new InvoicePrinter(cart);
        invoicePrinter.printInvoice();
        SaveToDB saveObj3 = new saveToFile();
        saveObj3.save();
    }
}
