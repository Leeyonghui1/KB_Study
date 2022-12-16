package practice1;

public class Circle {
	// 인스턴스 변수
	private int r;
	// 클래스변수
	// PI와 같이 모든 클래스가 공통적으로 접근하고
	// 공통적으로 쓸 수 있는 변수
	private static double PI;
	
	// 클래스 메소드
	// 공통적으로 쓸 수 있는 메소드
	public static double getPI() {return PI;}
	public static void setPI(double pI) {PI = pI;}
	// 인스턴스 메소드 여기 스태틱이랑 관련있는듯??아님말고
	public int getR() {return r;}
	public void setR(int r) {this.r = r;}
	
	// 생성자
	public Circle(int r) {
		this.r = r;
		PI = 3.14;
	}
	
	public double getArea() {return r*r*PI;}
}
