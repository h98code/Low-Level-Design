package HD.LLD.DesignPatterns.Creational.Factory.FactoryMethod;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class Main {
    public static void main(String[] args) {
        try {
            BurgerFactory burgerFactory = new WheatBurgerShop();

            Burger burger = burgerFactory.createBurger("wheat veg burger");
            burger.prepare();
        } catch (Exception e) {
            System.out.println("Invalid burger shop");
        }
    }
}
