package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.PremiumBurger;

public class WheatPremiumBurger implements Burger {
    public void prepare() {
        System.out.println("wheat Premium Burger");
    }
}
