package practice1;

public class Bibimbab extends Food{

	// 부모클래스(Food)에서는 메소드[함수(eat)]를 선언만하고 정의(구체화)하지 않았다
	// 부모클래스(Food)를 상속받은 자식클래스(Bibimbab)클래스 내부에서
	// 메소드(eat)을 정의(구체화)한다
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("비벼먹는다");
	}
	
}
