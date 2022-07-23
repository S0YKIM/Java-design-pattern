package ex00;

import org.w3c.dom.ls.LSOutput;

class   CarTypeNotFoundException extends Exception {
    public CarTypeNotFoundException() {
        super("Car type not found.");
    };
}

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new OurFactory();
        try {
            Car car = factory.produceCar("Sona");
            System.out.println(car);
        }
        catch(CarTypeNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}