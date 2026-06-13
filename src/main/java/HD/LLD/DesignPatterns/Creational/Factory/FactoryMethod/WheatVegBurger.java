package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class WheatVegBurger implements Burger {
    public void prepare() {
        System.out.println("wheat veg burger");
    }
}
