package ex02;

public class ObserverTest {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer observer1 = new CurrentDisplay();
        Observer observer2 = new ForecastDisplay();
        generator.addObserver(observer1);
        generator.addObserver(observer2);
        for (int i = 0; i < 5; i++) {
            generator.notifyObservers();
            generator.execute();
        }
    }
}
