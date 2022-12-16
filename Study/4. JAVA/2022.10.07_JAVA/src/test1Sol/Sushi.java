package test1Sol;

public class Sushi extends Food{

	private String wasabiBrand;
	
	// 부모클래스의 생성자가 재정의된 상태라면(디폴트생성자가 없는상태)
	// 자식클래스에서는 반드시 생성자를 부모클래스 생성자 형식으로 재정의해야한다
	// 만약, 부모클래스의 생성자가 여러개 재정의했다면
	// 그중, 하나만 사용해도 된다
	public Sushi(String name) {
		super(name);
	}

	public Sushi(String name, int price) {
		super(name, price);
	}

	public Sushi(String name, int price, String wasabiBrand) {
		super(name, price);
		this.wasabiBrand = wasabiBrand;
	}

	public String getWasabiBrand() {return wasabiBrand;}
	public void setWasabiBrand(String wasabiBrand) {this.wasabiBrand = wasabiBrand;}
	
}
