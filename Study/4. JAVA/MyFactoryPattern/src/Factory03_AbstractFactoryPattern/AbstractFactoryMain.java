package Factory03_AbstractFactoryPattern;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        comprehensiveFactory fac = new megaFactory();
        FoodFactory sf = fac.requestFood("과자");
        FoodFactory df = fac.requestFood("음료수");

        Food f1 = sf.orderFood();
        f1.tryEat();

        Food f2 = df.orderFood();
        f2.tryEat();
    }
}
