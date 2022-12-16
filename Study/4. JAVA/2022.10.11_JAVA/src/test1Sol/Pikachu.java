package test1Sol;

public class Pikachu implements Animalable, Cloneable {

	// clone 메소드는 default로 구현되어 있는데 오버라이드해야 쓸수있음
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	private String Name;
	
	// 생성자	
	public Pikachu(String name) {
		super();
		Name = name;
	}
	
	// 메소드
	public String getName() {return Name;}
	public void setName(String name) {Name = name;}

	@Override
	public void charming() {
		System.out.println("피카피카");
	}

}
