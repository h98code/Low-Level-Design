package HD.LLD.DesignPatterns.Structural.Composite;

import HD.LLD.DesignPatterns.Creational.Builder.Car;

import java.util.ArrayList;
import java.util.List;

public class ProductBundle implements CartItem{

    String bundleName;
    private List<CartItem> products;

    public void addItem(CartItem item) {
        products.add(item);
    }

    public ProductBundle(String name) {
        this.bundleName = name;
        this.products = new ArrayList<>();
    }

    @Override
    public int getPrice() {
        int total = 0;
        for (CartItem product : products) {
            total += product.getPrice();
        }

        System.out.println("total price: " + total);
        System.out.print("discounted price: ");
        return total - 1000;
    }

    @Override
    public String getDescription() {
        return bundleName;
    }
}
