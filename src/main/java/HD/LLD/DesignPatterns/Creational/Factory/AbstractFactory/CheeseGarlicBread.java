package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class CheeseGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing cheese garlic bread with melted cheese...");
    }
}

