package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class PremiumGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing premium garlic bread with herbs and special butter...");
    }
}

