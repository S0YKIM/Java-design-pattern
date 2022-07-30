package ex00;

public class BeginnerLevel extends PlayerLevel{
    public void jump() {
            System.out.println("Jump 할 줄 모르지롱.");
    }

    public void run() {
            System.out.println("천천히 달립니다.");
    }

    public void turn() {
            System.out.println("Turn 할 줄 모르지롱.");
    }

    public void showLevelMessage() {
        System.out.println("현재 플레이어의 레벨은 초보자입니다.");
    }
}
