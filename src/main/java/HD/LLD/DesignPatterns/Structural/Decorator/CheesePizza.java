package HD.LLD.DesignPatterns.Structural.Decorator;

public class CheesePizza extends PizzaDecorator {
    public CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " added cheese";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 40;
    }
}
