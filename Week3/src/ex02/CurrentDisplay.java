package ex02;

public class CurrentDisplay implements Observer {
    private int num;
    @Override
    public void update(NumberGenerator generator) {
        num = generator.getNumber();
        System.out.println(num);
    }
}
