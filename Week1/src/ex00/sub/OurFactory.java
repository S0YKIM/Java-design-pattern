package ex00.sub;

public class OurFactory extends CarFactory {

    private static Car car;

    @Override
    public Car produceCar(String name) {

        if (name.equalsIgnoreCase("Sonata")) {
            car.carType = "Sonata";
        } else if (name.equalsIgnoreCase("Grandeur")) {
            car.carType = "Grandeur";
        } else if (name.equalsIgnoreCase("Genesis")) {
            car.carType = "Genesis";;
        } else {
            car.carType = "noname";
        }
        return car;
    }
}
