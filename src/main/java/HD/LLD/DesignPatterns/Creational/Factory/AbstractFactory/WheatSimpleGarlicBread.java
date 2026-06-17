package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

public class WheatSimpleGarlicBread implements GarlicBread {
    @Override
    public void prepare() {
        System.out.println("Preparing wheat simple garlic bread (healthier option)...");
    }
}

