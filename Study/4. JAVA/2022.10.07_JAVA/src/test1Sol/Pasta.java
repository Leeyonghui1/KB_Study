package test1Sol;

public class Pasta extends Food{

	public Pasta(String name, int price) {
		super(name, price);
	}
	
	public void eat()
	{
		System.out.println(getName()+"�� ��ũ�� �������Ƽ� �Ծ��...");
		System.out.println("������ ������ "+getPrice()+"�� �̶� ����");
	}
}
