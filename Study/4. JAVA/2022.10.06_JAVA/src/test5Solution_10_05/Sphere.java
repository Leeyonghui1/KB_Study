package test5Solution_10_05;

public class Sphere extends Circle {
	
	// super :: 부모클래스의 생성자 호출
	public Sphere(int r) {
		super(r);
	}
	
	public double getVolume()
	{
		return (4.0/3)*getPI()*getR()*getR()*getR();
	}

	// Sphere 클래스는 새로운 속성을 추가하진 않고 새로운 기능(메소드)를 추가
	
	// protected
	// 같은 패키지에서는 public처럼 사용(디폴트 접근제한자 공통점)
	// 다른 패키지에서는 protected 속성을 가진 클래스를 상속받은 자식클래스에서만 사용가능
	
	protected String Color;
	protected void spin()
	{
		System.out.println("빙글빙글");
	}
}
