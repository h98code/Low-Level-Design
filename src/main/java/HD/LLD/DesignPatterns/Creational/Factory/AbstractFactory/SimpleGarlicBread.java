package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class SimpleGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing simple garlic bread...");
    }
}

