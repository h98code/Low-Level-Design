package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

import HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod.NormalBurgerShop;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class NormalMealShop implements MealFactory {
    public Burger createBurger(String burgerType){
        NormalBurgerShop normalBurgerShop = new NormalBurgerShop();
        return normalBurgerShop.createBurger(burgerType);
    }

    public  GarlicBread createGarlicBread(String garlicBreadType) {
        if(garlicBreadType.equals("simple garlic bread")) {
            return new SimpleGarlicBread();
        } else if(garlicBreadType.equals("Cheese garlic bread")) {
            return new CheeseGarlicBread();
        } else  if(garlicBreadType.equals("Premium garlic bread")) {
            return new PremiumGarlicBread();
        } else {
            System.out.println("Invalid garlic bread type");
            return null;
        }
    }
}
