package HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory;

public class Main {
    public static void main(String[] args) {
        SimpleBurgerFactory factory = new SimpleBurgerFactory();

        String burgerType = "burger";
        Burger burger = factory.getBurger(burgerType);

        if(burger != null) {
            burger.prepare();
        } else {
            System.out.println("invalid burger type");
        }
    }
}
