package HD.LLD.DesignPatterns.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());

        pizza = new CheesePizza(pizza);
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());

        pizza = new OlivePizza(pizza);
        System.out.println("Cost: " + pizza.getCost());
        System.out.println("Description: " + pizza.getDescription());
    }
}
