import java.util.*;
// 부모(상위) 클래스
class Points{
	// 위치 정보 포함(x좌표, y좌표)
	// 멤버
	private int x;
	private int y;
	
	// 생성자
	public Points(int x1, int y1)
	{
		this.x = x1;
		this.y = y1;
	}
	
	// 메소드
	public void print()
	{
		// Points 클래스의 객체에 의해 호출될 때 실행
		System.out.println("Points 클래스의 print()가 실행");
		System.out.println("x좌표: " + this.x);
		System.out.println("y좌표: " + this.y);
	}
	public int getX() {return this.x;}
	public int getY() {return this.y;}
}

// 자식(하위) 클래스
class ColorPoints extends Points{
	// 위치 정보, 색상 정보 포함(x좌표, y좌표, 색상)
	// 멤버
	private String color;

	// 생성자
	public ColorPoints(int x2, int y2, String color)
	{
		super(x2,y2);
		this.color = color;
	}
	
	// 메소드
	public void print()
	{
		// ColorPoints 클래스의 객체에 의해 호출될 때 실행
		// 부모 클래스의 메소드명 중 자식 클래스의 메소드명이 같은것이 있다면
		// ---> 오버라이딩 발생
		// 자식 클래스의 객체는 자식 클래스 메소드를 우선 실행
		System.out.println("ColorPoints 클래스의 print()가 실행");
		System.out.println("x좌표: " + this.getX());
		System.out.println("y좌표: " + this.getY());
		System.out.println("색상: " + this.color);
	}
}

public class T1Solution {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 각 클래스에 대한 객체 생성
		System.out.print("점1에 대한 정보(x,y): ");
		int x1 = s.nextInt();
		int y1 = s.nextInt();
		Points p1 = new Points(x1,y1);
		
		System.out.print("점2에 대한 정보(x,y,color): ");
		int x2 = s.nextInt();
		int y2 = s.nextInt();
		String color = s.next();
		ColorPoints p2 = new ColorPoints(x2,y2,color);
		
		p1.print();  
		System.out.println();
		p2.print();
		
		s.close();
	}
}