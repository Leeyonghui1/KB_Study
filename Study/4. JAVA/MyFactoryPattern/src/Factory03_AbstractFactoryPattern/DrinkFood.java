package Factory03_AbstractFactoryPattern;

public class DrinkFood extends Food{
    @Override
    public void prepared() {
        System.out.println("음료수를 공장에서 만들어요");
    }

    @Override
    public void tryEat() {
        System.out.println("편의점에서 마시기");
    }
}
