package ex02;

public class PrintBanner implements Print {
    private Banner banner;
    public PrintBanner(String banner) {
        this.banner = new Banner(banner);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
