public class Main {
    // Main에서 객체(인스턴스) 생성하는 것보다 함수를 통해서 객체 생성
    public static Food order(String type)
    {
        switch (type)
        {
            case "우리집":
                return new MyHomeFood();
            case "자취집":
                return new SelfFood();
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        // Main에서 바로 객체 생성
        Food f1 = new MyHomeFood();
        Food f2 = new SelfFood();
        f1.prepared();
        f1.tryEat();
        f2.prepared();
        f2.tryEat();

        // 함수 이용한 객체 생성
        Food f3 = order("우리집");
        Food f4 = order("자취집");
        f3.prepared();
        f3.tryEat();
        f4.prepared();
        f4.tryEat();

    }
}