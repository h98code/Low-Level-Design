package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.NonVegBurger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.PremiumBurger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.VegBurger;

import java.io.BufferedReader;

public class WheatBurgerShop implements BurgerFactory {
    public Burger createBurger(String burgerType){
        if(burgerType.equals("wheat non-veg burger")) {
            return new WheatNonVegBurger();
        } else if(burgerType.equals("wheat veg burger")) {
            return new WheatVegBurger();
        } else if(burgerType.equals("wheat premium burger")) {
            return new WheatPremiumBurger();
        } else  {
            return null;
        }
    }
}
