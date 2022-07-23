package ex00;

public class OurFactory extends CarFactory {
    @Override
    public Car produceCar(String name) {
        Car car = null;
        if (name.equalsIgnoreCase("Sonata")) {
            car = new Sonata();
        } else if (name.equalsIgnoreCase("Grandeur")) {
            car = new Grandeur();
        } else if (name.equalsIgnoreCase("Genesis")) {
            car = new Genesis();
        } else {
            car = new OtherCar();
        }
        return car;
    }
}
