package HD.LLD.DesignPatterns.Structural.Decorator;

public abstract class PizzaDecorator implements Pizza {

    Pizza pizza;

    PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }
}
