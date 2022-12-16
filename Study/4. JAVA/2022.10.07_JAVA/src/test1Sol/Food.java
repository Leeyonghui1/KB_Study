package test1Sol;

public class Food {
	private String name;
	private int price;
	
	public void eat()
	{
		System.out.println(name+"을/를"+price+"원으로 먹음");
	}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}

	
	public Food(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public Food(String name) {
		this.name = name;
	}
	
}
