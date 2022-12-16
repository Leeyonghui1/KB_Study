package test1Sol;

public class PorkCutlet extends Food{

	public PorkCutlet(String name, int price) {
		super(name, price);
	}
	
	@Override
	// 오버라이드 :: 덮어쓰기
	// 부모클래스(Food)의 메소드(eat)이 아닌 전혀 다른 메소드(eat)을 만듦
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat(); :: 부모클래스의 eat() 호출
		System.out.println(getName()+"은 최고의 돈까쓰");
		System.out.println(getPrice()+"원의 가격이 아깝지 않네");
	}
	
	// 오버로딩은 메소드명만 같고 매개변수 타입이나 개수가 다른것
	public void eat(int count)
	{
		System.out.println(count+"번 돈까스 먹음");
	}
	public void eat(String source)
	{
		System.out.println(source+"에 찍어먹음");
	}
}
