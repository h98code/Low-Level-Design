package HD.LLD.DesignPatterns.Creational.Factory.SimpleFactory;

class SimpleBurgerFactory {
    public Burger getBurger(String burgerType) {
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
