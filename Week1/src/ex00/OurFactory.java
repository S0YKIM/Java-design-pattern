package ex00;

public class OurFactory extends CarFactory {
    @Override
    public Car produceCar(String name) throws CarTypeNotFoundException {
        Car car = null;
        if (name.equalsIgnoreCase("Sonata")) {
            car = new Sonata();
        } else if (name.equalsIgnoreCase("Grandeur")) {
            car = new Grandeur();
        } else if (name.equalsIgnoreCase("Genesis")) {
            car = new Genesis();
        } else {
            throw new CarTypeNotFoundException();
        }
        return car;
    }
}

//원래 클러스터에서 리팩토링한 버전
//public class OurFactory extends CarFactory {
//    @Override
//    public Car produceCar(String name) {
//        Car car = null;
//        if (name.equalsIgnoreCase("Sonata")) {
//            car = new Sonata();
//        } else if (name.equalsIgnoreCase("Grandeur")) {
//            car = new Grandeur();
//        } else if (name.equalsIgnoreCase("Genesis")) {
//            car = new Genesis();
//        } else {
//            car = new OtherCar();
//        }
//        return car;
//    }
//}
