class Person_Sol{
	private String name;
	private int age;
	// Person 멤버 : 이름, 나이
	
	// 생성자
	public Person_Sol(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	
	// 오버라이딩
	// 부모 클래스 메소드명과 자식 클래스 메소드명이 똑같다면
	// 자식 클래스 메소드가 부모 클래스 메소드를 덮어씌우기를 하여
	// 부모 클래스 메소드는 실행이 안된다.
	// 부모 클래스에 대한 객체를 따로 생성하여 실행해야함
	public void print()
	{
		System.out.println("ㅇㅇㅇ");
	}
}

class Student_Sol extends Person_Sol{
	private String school;
	// Student 멤버 : 학교명, 이름, 나이
	
	// 생성자
	public Student_Sol(String n, int a, String s)
	{
		// super() : 부모 클래스의 생성자 호출
		super(n,a);    // 이름,나이 초기화
		this.school = s; //학교명 초기화
	}
	
	public void print()
	{
		System.out.println("학생 정보");
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("학교명: " + this.school);
	}
}

class Teacher_Sol extends Person_Sol{
	private String company;
	// Teacher 멤버 : 소속, 이름, 나이
	
	// 생성자
	public Teacher_Sol(String n, int a, String c)
	{
		super(n,a);    //이름, 나이 초기화
		this.company = c; // 소속 초기화
	}
	
	public void print()
	{
		System.out.println("교사 정보");
		System.out.println("이름: " + this.getName());
		System.out.println("나이: " + this.getAge());
		System.out.println("소속: " + this.company);
	}
}

public class T2Solution {
	public static void main(String args[]) {
		// 객체 생성
		Student_Sol Stu = new Student_Sol("이용희",28,"KB");
		Teacher_Sol T = new Teacher_Sol("장태연",29,"AI");
		
		Stu.print();
		System.out.println();
		T.print();
	}
}
