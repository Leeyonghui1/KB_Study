package test1;

public class Food {
	private String name;
	private int price;
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	
	public void eat()
	{
		System.out.println("<Food Ŭ������ eat �Լ�>");
		System.out.println("����"+getPrice()+"���� �����ϰ�");
		System.out.println(getName()+"�� �Խ��ϴ�.");
	}
	
	
}
