package test1Sol;

public class Pasta extends Food{

	public Pasta(String name, int price) {
		super(name, price);
	}
	
	public void eat()
	{
		System.out.println(getName()+"는 포크로 돌돌말아서 먹어야...");
		System.out.println("하지만 가격이 "+getPrice()+"원 이라서 절망");
	}
}
