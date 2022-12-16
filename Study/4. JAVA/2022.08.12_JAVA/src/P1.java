// 클래스 내용 복습
// 클래스 구성 : 필드(멤버 변수), 메소드(멤버 함수), 생성자
// 접근 제어자 : public(외부로 공개), private(외부로 공개X)
// 객체 생성 : new 키워드 사용
// (클래스명은 int, double과 같은 타입명과 비슷한 취급)
// 멤버 참조 및 호출과 같은 사용은 구조체와 비슷( . 사용)
// 오버로딩 : 메소드 오버로딩, 생성자 오버로딩
// 		  : 매개변수의 구성을 다르게 하여 동일한 함수명을 함께 사용하는 것
// this 문법 : 객체 자신을 가르키는 포인터 개념

import java.util.*;

// ex) 도형 넓이를 계산하는 클래스 만들고 사용
//	   도형 : 원, 직각삼각형, 사각형
class Shape{
	// 멤버 변수
	public String name;
	public int a;
	public int b;
	public Boolean t; // 삼각형에서만 쓸 예정, 직각삼각형 판단용
	
	// 생성자
	// 원 도형 생성시 사용
	public Shape(String n, int a) {   
		this.name = n;
		this.a = a;
	}
	// 사각형 생성시 사용
	public Shape(String n, int a, int b) {  
		this.name = n;
		this.a = a;
		this.b = b;
	}
	// 삼각형 생성시 사용
	public Shape(String n, int a, int b,Boolean t) {  
		this.name = n;
		this.a = a;
		this.b = b;
		this.t = t;
	}
	
	
	// 멤버 함수
	// 원 넓이 반환
	public double getSize(int r) {return r*r*3.14;}
	// 사각형 넓이 반환
	public int getSize(int n1, int n2) {return n1*n2;}
	// 직각삼각형 넓이 반환
	public double getSize(int n1, int n2, Boolean t) {
		if(t == true) {System.out.println("직각삼각형입니다.");}
		else {System.out.println("직각삼각형이 아닙니다.");}
		return n1*n2/2;
		}
}

public class P1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 객체 배열 선언
		Shape sh[] = new Shape[3];  // 객체 생성은 아니고 배열만 만든 상태
		for(int i = 0 ; i < 3 ; i++)
		{
			String name = s.next();
			if(name.equals("원"))
			{
				int a = s.nextInt();
				sh[i] = new Shape(name,a);
			}
			else if(name.equals("사각형"))
			{
				int a = s.nextInt();
				int b = s.nextInt();
				sh[i] = new Shape(name,a,b);
			}
			else
			{
				int a = s.nextInt();
				int b = s.nextInt();
				Boolean t = s.nextBoolean();
				sh[i] = new Shape(name,a,b,t);
			}
		}
		for(int i = 0 ; i < 3 ; i++)
		{
			double size;
			if(sh[i].name.equals("원"))
			{
				size = sh[i].getSize(sh[i].a);
				System.out.println("원의 넓이는 : " + size);
			}
			else if(sh[i].name.equals("사각형"))
			{
				size = sh[i].getSize(sh[i].a, sh[i].b);
				System.out.println("사각형의 넓이는 : " + size);
			}
			else
			{
				size = sh[i].getSize(sh[i].a, sh[i].b, sh[i].t);
				System.out.println("삼각형의 넓이는 : " + size);
			}
		}
		
		
		/*
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("원,사각형,삼각형 중 하나를 입력하세요");
			String name = s.next();
			
			if(name.equals("원"))
			{
				int a = 1;
				sh[i] = new Shape(name,a);
			}
			else if(name.equals("사각형"))
			{
				int a = 1;
				int b = 1;
				sh[i] = new Shape(name,a,b);
			}
			else
			{

				int a = 1;
				int b = 1;
				Boolean t = false;
				sh[i] = new Shape(name,a,b,t);
			}
		}
		System.out.println();
		for(int i = 0 ; i < 3 ; i++)
		{
			if(sh[i].name.equals("원"))
			{
				System.out.println("반지름 값을 입력하세요.");
				int a = s.nextInt();
				System.out.println("원의 넓이는 :" + sh[i].getSize(a) );
			}
			else if(sh[i].name.equals("사각형"))
			{
				System.out.println("가로의 값을 입력하세요.");
				int a = s.nextInt();
				System.out.println("세로의 값을 입력하세요.");
				int b = s.nextInt();
				System.out.println("사각형의 넓이는 : " + sh[i].getSize(a,b));
			}
			else
			{
				System.out.println("밑변의 값을 입력하세요.");
				int a = s.nextInt();
				System.out.println("높이의 값을 입력하세요.");
				int b = s.nextInt();
				System.out.println("직각삼각형인지 판단하세요.");
				Boolean t = s.nextBoolean();
				System.out.println("삼각형의 넓이는 : " + sh[i].getSize(a,b,t));
			}
			
		}
		*/
		s.close();	
	}
}
