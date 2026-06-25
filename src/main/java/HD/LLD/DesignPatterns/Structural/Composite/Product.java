package HD.LLD.DesignPatterns.Structural.Composite;

public class Product implements CartItem {
    String name;
    int price;

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public int  getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return name;
    }
}
