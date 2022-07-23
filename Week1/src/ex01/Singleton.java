package ex01;

public class Singleton {

    private static Singleton instance;

    // private 접근 제한자로 외부에서 생성자로 직접 생성하는 것을 방지
    private Singleton() {};

    public static Singleton getInstance() {
        if(instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
