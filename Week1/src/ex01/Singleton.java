package ex01;

public class Singleton {

    private static Singleton instance = new Singleton();

    // private 접근 제한자로 외부에서 생성자로 직접 생성하는 것을 방지
    private Singleton() {};

    public static Singleton getInstance() {
//        if(instance == null) {
//            instance = new Singleton();
//        } // 이런 상황이 언제 생기는지? 힙 메모리 공간 부족으로 인한 할당 실패?
        return instance;
    }

}
