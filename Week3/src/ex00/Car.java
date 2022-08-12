package ex00;

public abstract class Car {
    private void    startCar() {
        System.out.println("시동을 켭니다.");
    }
    protected abstract void    drive();
    protected abstract void    stop();
    private void    turnOff() {
        System.out.println("시동을 끕니다.");
    }
    final public void run() {
        System.out.println("*********************");
        startCar();
        drive();
        stop();
        turnOff();
        System.out.println("*********************");
    }
}
