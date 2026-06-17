package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class WheatCheeseGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing wheat cheese garlic bread with melted cheese on wheat base...");
    }
}

