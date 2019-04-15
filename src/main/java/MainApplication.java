import creational.abstractfactory.Bmw;
import creational.abstractfactory.CarFactory;
import creational.abstractfactory.Kia;
import creational.builder.Car;

public class MainApplication {

    public static void main(String[] args) {
        Car car = new Car.Builder().withColour("Red").withWheels(4).build();
        System.out.println(car.getColour());
        System.out.println(car.getWheels());

        CarFactory factory=factory(Cars.KIA);
        creational.abstractfactory.Car bmwCar=factory.createCar();
        bmwCar.drive();
    }

    private static CarFactory factory(Cars cars) {
        switch (cars) {
            case BMW:
                return Bmw::new;
            case KIA:
                return Kia::new;
            default:
                break;
        }
        return null;
    }

    private enum Cars {
        BMW,
        KIA;

        Cars() {
        }
    }
}
