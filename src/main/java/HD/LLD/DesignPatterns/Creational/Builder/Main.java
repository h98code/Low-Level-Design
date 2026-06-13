package HD.LLD.DesignPatterns.Creational.Builder;

public class Main {
    public static void main(String[] args) {

        Car.CarBuilder builder = new Car.CarBuilder();
        builder.setColor("Red")
                .setEngine("V8")
                .setWheels(8)
                .setSeats(2)
                .setHasSunroof(true)
                .setLuxury(true);

        Car car = builder.build();

        System.out.println("Car Details:");
        System.out.println("Engine: " + car.engine);
        System.out.println("Seats: " + car.seats);
        System.out.println("Color: " + car.color);
        System.out.println("Wheels: " + car.wheels);
        System.out.println("Has Sunroof: " + car.hasSunroof);
        System.out.println("Is Luxury: " + car.isLuxury);
    }
}
