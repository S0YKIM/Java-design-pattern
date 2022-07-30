package ex00;

public class HwMainBoard {
    public static void main(String[] args) {
        HwPlayer player = new HwPlayer();
        player.play(1);
        player.upgradeLevel(HwPlayer.ADVANCED_LEVEL);
        player.play(2);
        player.upgradeLevel(HwPlayer.SUPER_LEVEL);
        player.play(3);
    }
}
