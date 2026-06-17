package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class WheatPremiumGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing wheat premium garlic bread with gourmet toppings...");
    }
}

