import creationalPatterns.builderPattern.Car;

public class MainApplication {

    public static void main(String[] args){
        Car car=new Car.Builder().withColour("Red").withWheels(4).build();
        System.out.println(car.getColour());
        System.out.println(car.getWheels());
    }
}
