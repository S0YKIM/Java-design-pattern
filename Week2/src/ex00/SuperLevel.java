package ex00;

public class SuperLevel extends PlayerLevel{
    public void jump() {
        System.out.println("아주 높이 jump 합니다.");
    }

    public void run() {
        System.out.println("엄청 빨리 달립니다.");
    }

    public void turn() {
        System.out.println("한 바퀴 돕니다.");
    }

    public void showLevelMessage() {
        System.out.println("현재 플레이어의 레벨은 고급자입니다.");
    }
}
