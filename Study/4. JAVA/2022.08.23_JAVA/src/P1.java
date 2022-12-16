import java.util.*;

// 상속
// Person(부모 클래스), Student(자식 클래스)

class Person{   // :: 부모 클래스(상위 클래스)
	private String name; // 이름
	private String gender;  // 성별
	// 멤버 : 이름, 성별
	
	public Person(String n, String g) {
		this.name = n;
		this.gender = g;
	}
	
	public void setName(String n) {this.name=n;}
	public String getName() {return this.name;}
	public void setGen(String g) {this.gender=g;}
	public String getGen() {return this.gender;}
	
	public void print_P()
	{
		System.out.println("사람 정보");
		System.out.println("이름: " + this.name);
		System.out.println("성별: " + this.gender);
	}

}


class Student extends Person{ // :: 자식 클래스(하위 클래스)
	// 상속 : 부모 클래스(상위 클래스)의 멤버를 똑같이 사용할 수 있음
	private int num; // 학번
	// 멤버 : 학번, 이름, 성별
	
	public Student(String n, String g, int num) {
		// super() : 부모 클래스의 생성자를 호출함
		// 부모 클래스의 생성자가 기본 생성자가 아닌 재정의된 생성자라면
		// 자식 클래스의 생성자의 매개변수 :
		// (부모 클래스 생성자 매개변수)+(자식 클래스 생성자 매개변수)
		// super()의 매개변수 = 부모 클래스 생성자의 매개변수
		super(n,g); 
		this.num = num;
	}
	
	public void setNum(int n) {this.num=n;}
	public int getNum() {return this.num;}
	public void print_Stu()
	{
		System.out.println("학생 정보");
		System.out.println("학번: " + this.num);
	}

}

public class P1 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		// 객체 생성
		Person P = new Person("이용희","남자");
		Student Stu = new Student("이용희","남자",123123);
		
		P.setName("이용희");
		/* P.setNum(123456789);   :: 오류발생  */
		// why? 부모 클래스(Person)는 자식 클래스(Student) 멤버 포함 X
		Stu.setName("이용희2");
		Stu.setNum(123456789);
		// 자식 클래스(Student)는 부모 클래스(Person)로 부터 상속 받았기 때문에
		// 자식 클래스는 부모 클래스의 멤버 사용 가능
		
		P.print_P();
		Stu.print_Stu();
		
		
		s.close();
	}
}
