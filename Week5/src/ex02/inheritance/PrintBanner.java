package ex02.inheritance;

public class PrintBanner extends Banner implements Print {
    public PrintBanner(String banner) {
        super(banner);
    }
    public void printWeak() { showWithParen(); }
    public void printStrong() {
        showWithAster();
    }
}
