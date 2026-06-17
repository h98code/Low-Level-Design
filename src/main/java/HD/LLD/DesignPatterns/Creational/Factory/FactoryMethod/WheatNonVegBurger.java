package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class WheatNonVegBurger implements Burger {
    public void prepare() {
        System.out.println("wheat non-veg burger");
    }
}
