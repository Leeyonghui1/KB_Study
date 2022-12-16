package practice1;

public class T2Solution {
	// 클래스 메소드
	public static void sayHello() {
		System.out.println("Hello World");
	}
	
	// 인스턴스 메소드
	public void toSay(String name) {
		System.out.println(name+"님, 안녕");
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		// PI값을 바꾸면 모든 Circle 객체에게 영향을 끼침
		Circle.setPI(3.0);

		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		// 클래스 메소드 특징
		// 클래스 메소드 안에는 인스턴스 변수나 인스턴스 메소드가 못들어감
		// 이유 : static이 붙은 것들이 메모리에 먼저 올라가기 때문
		// 클래스 변수,메소드 :: 프로그램이 시작하자마자 올라감
		// 인스턴스 변수,메소드 :: new 키워드 만날때 메모리에 올라감
		// static이 붙은 메소드 안에는 static이 붙어있는 메소드나 변수만 옴
		// static이 없는 메소드 안에는 static이 없거나 있어도 가능
		
		sayHello();
		
		//toSay("박지호");  :: 오류발생
		// static이 없는 메소드(인스턴스 메소드)를 
		// static이 붙은 메소드(클래스 메소드)안에서 호출할려면 
		// 객체화(인스턴스화)해서 호출
		
		new T2Solution().toSay("이동준");
		T2Solution temp = new T2Solution();
		temp.toSay("이용희");	
	}
}
