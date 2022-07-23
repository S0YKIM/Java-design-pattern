package ex00;

public abstract class CarFactory {
    public abstract Car produceCar(String name) throws CarTypeNotFoundException;
}
