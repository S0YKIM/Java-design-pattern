package ex00;

public class Player {
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
    public void play(int time) {
        level.go(time);
    }
}
