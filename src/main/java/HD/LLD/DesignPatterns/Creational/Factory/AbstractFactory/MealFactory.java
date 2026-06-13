package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public interface MealFactory {
    public Burger createBurger(String burgerType);
    public GarlicBread createGarlicBread(String garlicBreadType);
}
