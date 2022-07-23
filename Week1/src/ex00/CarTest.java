package ex00;

public class CarTest {
    public static void main(String[] args) {
        HwCarTest test = new HwCarTest();
        HwCar car = test.produceCar("Sonata");
        System.out.println(car);
    }
}


// noname이라는 부분이 과제에 들어간 특별한 의미가 있을까?
//>> 지금 내가 짠 코드상에서 OurFactory가 noname이라는 상황에 의존하지는 않는지
// >> sokim : 에러로 처리

// 이렇게 짰을 때의 장점은?
//>> 공장이 여러개 있고 공장마다 다른 차를 생산한다면?


// OurFactory에서 else if를 쓰지 않을 수 있는지