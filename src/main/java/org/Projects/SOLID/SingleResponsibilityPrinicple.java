package org.Projects.SOLID;

import java.util.List;

class Product{
    private String name;
    private double price;

    Product(){};

    Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    Product(String name){
        this.name = name;
        this.price = 1.0; // setting default price
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

class ShoppingCart{
    List<Product> products;

    ShoppingCart(){};

    ShoppingCart(List<Product> products){
        this.products = products;
    }

    /* violates SRP, as the class is responsible for 3 functionalities.
    public void printInvoice(){
        System.out.println("Invoice:");
        for(Product p : products){
            System.out.println(p.getName() + " : " +  p.getPrice());
        }
    }

    public void saveToDB(){
        System.out.println("Saving the products to database...");
        for(Product p : products){
            System.out.println("Saving " + p.getName() + " with price " + p.getPrice());
        }
    }
     */
}

class InvoivePrinter{
    ShoppingCart shoppingCart;

    InvoivePrinter(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void printInvoice(){
        System.out.println("===========================================");
        System.out.println("Invoice:");
        for(Product p : shoppingCart.products){
            System.out.println(p.getName() + " : " +  p.getPrice());
        }
    }
}

class SaveToDB{
    ShoppingCart shoppingCart;

    SaveToDB(ShoppingCart shoppingCart){
        this.shoppingCart = shoppingCart;
    }

    public void save(){
        System.out.println("===========================================");
        for(Product p : shoppingCart.products){
            System.out.println("saving " + p.getName() + " : " +  p.getPrice());
        }
    }
}

public class SingleResponsibilityPrinicple {
    public static void main(String[] args) {
        // creating products
        Product p1 = new Product("Laptop", 1000.0);
        Product p2 = new Product("Phone", 500.0);

        // adding products to shopping cart
        ShoppingCart cart = new ShoppingCart(List.of(p1, p2));

        // printing invoice
//        cart.printInvoice();

        // saving to database
//        cart.saveToDB();

        InvoivePrinter printer = new InvoivePrinter(cart);
        printer.printInvoice();

        SaveToDB saveToDB = new SaveToDB(cart);
        saveToDB.save();
    }
}
