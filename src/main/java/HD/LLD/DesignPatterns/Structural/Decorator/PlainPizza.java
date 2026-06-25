package HD.LLD.DesignPatterns.Structural.Decorator;

public class PlainPizza implements Pizza {
    @Override
    public int getCost() {
        return 100;
    }

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }
}
