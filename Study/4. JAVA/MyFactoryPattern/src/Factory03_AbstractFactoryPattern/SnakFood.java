package Factory03_AbstractFactoryPattern;

public class SnakFood extends Food{
    @Override
    public void prepared() {
        System.out.println("질소를 넣어요");
    }

    @Override
    public void tryEat() {
        System.out.println("그리운 푸짐한 새우깡");
    }
}
