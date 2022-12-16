package test1;

public class T1Solution {

	public static void main(String[] args) {
		SquareSol s1 = new SquareSol();
		s1.setWh(-1);
		System.out.println(s1.getWh());
		s1.setWh(10);
		System.out.println(s1.getWh());
		
		// '-50'을 넣었을때 값이 '-50'그대로 나옴
		// 하지만 결과값은 양수만을 원함
		// 그래서 클래스 생성자 부분을 수정
		SquareSol s2 = new SquareSol(-50);
		System.out.println(s2.getWh());
		System.out.println("===========");
		
		RectangleSol r1 = new RectangleSol();
		RectangleSol r2 = new RectangleSol(2);
		RectangleSol r3 = new RectangleSol(3,2);
		
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println(r3.getArea());
		
		r1.setH(10);
		r1.setW(5);
		System.out.println(r1.getArea());
		
		// 생성자 :: 클래스명(), 클래스명(매개변수들)
		// 인스턴스 :: new + 생성자
		
		// Math 클래스에서 '공통적으로' 사용되는 메소드
		Math.random();
		// Math 클래스에서 '공통적으로' 사용되는 변수
		System.out.println(Math.PI);
	}
}
