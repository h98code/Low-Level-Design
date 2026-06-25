package HD.LLD.DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CartItem book = new Product("Atomic habits", 499);
        CartItem phone = new  Product("samsung", 23000);
        CartItem erabuds = new  Product("one plus buds", 4550);
        CartItem charger = new Product("charger", 1220);

        ProductBundle phoneBundle = new ProductBundle("phone bundle");
        phoneBundle.addItem(phone);
        phoneBundle.addItem(erabuds);
        phoneBundle.addItem(charger);

        List<CartItem> cart = new ArrayList<>();
        cart.add(book);
        cart.add(phoneBundle);

        for(CartItem c : cart) {
            System.out.println(c.getDescription());
            System.out.println(c.getPrice());
            System.out.println("-------------------");
        }
    }
}
