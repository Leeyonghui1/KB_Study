package practice1;

// 추상클래스
public abstract class Food {
	private int price;
	public String name;
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// 추상클래스 내에서 메소드를 정의(선언+명령문(구체화))를 하지않고
	// 선언만한다.
	// 추상클래스를 상속받은 자식클래스에서 구체화를 반드시 해야한다
	public abstract void eat();
	
	
}
