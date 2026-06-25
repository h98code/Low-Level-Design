package HD.LLD.DesignPatterns.Structural.Decorator;

public class OlivePizza extends PizzaDecorator {

    public OlivePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " added olives";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 60;
    }
}
