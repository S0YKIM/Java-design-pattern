package ex00;

public class AdvancedLevel extends PlayerLevel{
    public void jump() {
        System.out.println("높이 jump 합니다.");
    }

    public void run() {
        System.out.println("빨리 달립니다.");
    }

    public void turn() {
        System.out.println("Turn 할 줄 모르지롱.");
    }

    public void showLevelMessage() {
        System.out.println("현재 플레이어의 레벨은 중급자입니다.");
    }
}
