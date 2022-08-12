package ex02;

public class ForecastDisplay implements Observer {
    private int num;
    @Override
    public void update(NumberGenerator generator) {
        num = generator.getNumber();
        if (num < 30) {
            System.out.println("날씨가 건조합니다.");
        }
        else if (num < 70) {
            System.out.println("날씨가 쾌적합니다.");
        }
        else if (num <= 100) {
            System.out.println("날씨가 축축합니다.");
        }
        else {
            System.out.println("올바른 습도가 아닙니다.");
        }
    }
}
