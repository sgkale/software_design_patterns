package creational.builder;

//make constructor private
//add static class inside class and redeclare valriables
public class Car {

    private int wheels;
    private String colour;

    Car() {
    }

    Car(int wheels, String colour) {
        this.wheels = wheels;
        this.colour = colour;
    }

    public int getWheels() {
        return wheels;
    }

    public String getColour() {
        return colour;
    }

    public static class Builder {
        private int wheels;
        private String colour;

        public Builder() {

        }

        public Builder withWheels(int wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder withColour(String colour) {
            this.colour = colour;
            return this;
        }

        public Car build() {
            Car car = new Car(wheels, colour);
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                ", colour='" + colour + '\'' +
                '}';
    }
}
