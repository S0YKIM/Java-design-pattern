package ex01;

public class Singleton {

    private static Singleton instance = new Singleton();

    // 생성자 private으로 막아주기
    private Singleton() {
    };

    public static Singleton getInstance() {

//        if(instance == null) {
//            instance = new Singleton();
//        }// 이런 상황이 언제 생길 수 있는지 ????
        return instance;
    }

}
