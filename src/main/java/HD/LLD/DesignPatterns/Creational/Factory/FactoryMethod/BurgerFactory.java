package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public interface BurgerFactory {
    public Burger createBurger(String type);
}
