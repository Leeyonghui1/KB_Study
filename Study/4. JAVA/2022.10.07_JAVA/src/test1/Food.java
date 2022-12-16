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
		System.out.println("<Food 클래스의 eat 함수>");
		System.out.println("나는"+getPrice()+"원을 지불하고");
		System.out.println(getName()+"을 먹습니다.");
	}
	
	
}
