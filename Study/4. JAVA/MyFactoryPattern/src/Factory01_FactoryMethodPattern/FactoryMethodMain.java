package Factory01_FactoryMethodPattern;

public class FactoryMethodMain {
    public static void main(String[] args) {
        FoodStore store1 = new BaekBoy();
        Food f1 = store1.orderFood();
        f1.tryEat();

        FoodStore store2 = new BaekDabang();
        Food f2 = store2.orderFood();
        f2.tryEat();

        // 팩토리 메소드 패턴
        // 심플팩토리패턴이랑 다르게 type값을 입력받지 않고
        // Food랑 FoodStore를 상속한 클래스들만 만들면 코드 수정없이 새로운 음식점과 음식 생성 가능

        // 객체지향의 가장 중요한 특징을 반영
        // OCP(객체 폐쇄의 특징 :: 확장은 가능, 수정은 불필요)

    }
}
