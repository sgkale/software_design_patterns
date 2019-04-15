package creational.abstractfactory;

/*
 * Provide an interface for creating families of related or dependent objects without specifying their concrete classes.
 * Encapsulate object creation in a separate (factory) object. That is, define an interface (AbstractFactory) for creating objects, and implement the interface.
 * A class delegates object creation to a factory object instead of creating objects directly
 * This makes a class independent of how its objects are created (which concrete classes are instantiated).
 * A class can be configured with a factory object, which it uses to create objects, and even more, the factory object can be exchanged at run-time.
 * */
@FunctionalInterface
public interface CarFactory {
    Car createCar();
}
