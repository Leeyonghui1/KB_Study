package test5Solution_10_05;

public class T5Solution {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(25);
		s1.setName("김성환");
		s1.study();
		
		KBStudent kb1 = new KBStudent();
		kb1.setName("김혜민");
		kb1.setAge(40);
		kb1.setEducation("대졸");
		kb1.setGender("여성");
		kb1.attend("입실");
		kb1.attend("퇴실");
		
		System.out.println("===========");
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1 = new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		// 클래스변수는 부모클래스랑 자식클래스가 공유함
		// 즉 static이 붙으면 어느곳에서 바꾸던지 전부 영향을 받음
		// ex1) 부모클래스(Circle)의 클래스변수(PI)의 값을 변경
		Circle.setPI(1.0);
		// ex1 결과) 자식클래스(Sphere)의 결과값이 바뀜
		System.out.println(sp1.getVolume());
		// ex2) 자식클래스(Sphere)의 클래스변수(PI)의 값을 변경
		Sphere.setPI(0);
		// ex2 결과) 부모클래스(Circle)의 결과값이 바뀜
		System.out.println(c1.getArea());
		System.out.println("===========");
		
		Cuboid cb1 = new Cuboid();
		cb1.setH(3);
		cb1.setW(4);
		cb1.setZ(5);
		System.out.println(cb1.getCuboidVolume());
	}
}
