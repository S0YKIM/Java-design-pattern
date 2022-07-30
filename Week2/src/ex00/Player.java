package ex00;

// Player: context
public class Player {
    // state 를 PlayerLevel 클래스로 객체화
    private PlayerLevel level;
    public Player() {
        level = new BeginnerLevel();
        level.showLevelMessage();
    }
    // setter
    public void upgradeLevel(PlayerLevel level) {
        this.level = level;
        level.showLevelMessage();
    }
    // getter
    public PlayerLevel  getLevel() { return level; }
    // 메서드는 상태 객체에게 위임
    public void play(int time) {
        level.go(time);
    }
}
