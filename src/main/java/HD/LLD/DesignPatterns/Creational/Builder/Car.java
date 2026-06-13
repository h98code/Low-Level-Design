package HD.LLD.DesignPatterns.Creational.Builder;

public class Car {

    public String engine;
    public int seats;
    public String color;
    public int wheels;
    public boolean hasSunroof;
    public boolean isLuxury;

    // ensuring that the object is created using the builder class.
    private Car(CarBuilder builder) {
        this.engine = builder.engine;
        this.seats = builder.seats;
        this.color = builder.color;
        this.hasSunroof = builder.hasSunroof;
        this.isLuxury = builder.isLuxury;
        this.wheels = builder.wheels;
    }

    // getter methods
    public static class CarBuilder{

        //setting the default values for the car
        public String engine = "V6";
        public int seats = 4;
        public String color = "Black";
        public boolean hasSunroof = false;
        public boolean isLuxury = false;
        public int wheels = 4;



        public CarBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setHasSunroof(boolean hasSunroof) {
            this.hasSunroof = hasSunroof;
            return this;
        }

        public CarBuilder setLuxury(boolean isLuxury) {
            this.isLuxury = isLuxury;
            return this;
        }

        public CarBuilder setWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
