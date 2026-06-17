package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

import HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod.NormalBurgerShop;
import HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod.WheatBurgerShop;
import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class WheatMealShop implements MealFactory{
    public Burger createBurger(String burgerType){
        WheatBurgerShop wheatBurgerShop = new WheatBurgerShop();
        return wheatBurgerShop.createBurger(burgerType);
    }

    public  GarlicBread createGarlicBread(String garlicBreadType) {
        if(garlicBreadType.equals("simple garlic bread")) {
            return new WheatSimpleGarlicBread();
        } else if(garlicBreadType.equals("cheese garlic bread")) {
            return new WheatSimpleGarlicBread();
        } else  if(garlicBreadType.equals("premium garlic bread")) {
            return new WheatSimpleGarlicBread();
        } else {
            System.out.println("Invalid garlic bread type");
            return null;
        }
    }
}
