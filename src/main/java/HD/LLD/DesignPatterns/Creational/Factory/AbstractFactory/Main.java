package HD.LLD.DesignPatterns.Creational.Factory.AbstractFactory;

import HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory.Burger;

public class Main {
    public static void main(String[] args) {
        MealFactory mealFactory = new WheatMealShop();
        Burger burger = mealFactory.createBurger("wheat premium burger");
        GarlicBread garlicBread = mealFactory.createGarlicBread("cheese garlic bread");
        burger.prepare();
        garlicBread.prepare();
    }
}