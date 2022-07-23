package ex00;

public class HwCarTest {
    public static void main(String[] args) {
        HwCarTest test = new HwCarTest();
        HwCar car = test.produceCar("SONATA");

        System.out.println(car);
    }
    public HwCar produceCar(String name) {
        HwCar car = null;
        if (name.equalsIgnoreCase(HwCar.SONATA)) {
            car = new HwCar(HwCar.SONATA);
        }
        else if (name.equalsIgnoreCase(HwCar.GRANDEUR)) {
            car = new HwCar(HwCar.GRANDEUR);
        }
        else if (name.equalsIgnoreCase(HwCar.GENESIS)) {
            car = new HwCar(HwCar.GENESIS);
        }
        else {
            car = new HwCar("noname");
        }
        return car;
    }
}