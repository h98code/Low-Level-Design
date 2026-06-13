package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.NonVegBurger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.PremiumBurger;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.VegBurger;

public class NormalBurgerShop implements BurgerFactory {
    public Burger  createBurger(String burgerType) {
        if(burgerType.equals("non-veg burger")) {
            return new NonVegBurger();
        } else if(burgerType.equals("veg burger")) {
            return new VegBurger();
        } else if(burgerType.equals("premium burger")) {
            return new PremiumBurger();
        } else  {
            return null;
        }
    }
}
