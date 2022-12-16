// 복습
import java.util.*;

class Teacher{
	// 클래스 구성요소 : 필드(멤버 변수), 메소드(멤버 함수), 생성자
	// 멤버 변수 선언
	private String name;
	private int year;
	private String gender;
	
	// 멤버 함수 선언
	public void setName(String n) {this.name=n;}
	public void setYear(int y) {this.year=y;}
	public void setGen(String g) {this.gender=g;}
	public String getName() {return this.name;}
	public int getYear() {return this.year;}
	public String getGen() {return this.gender;}
	
	// 생성자 선언
	// 생성자는 객체 생성할 시 자동으로 멤버 변수를 초기화하는데에 사용
	// 생성자 특징 1) 클래스 이름과 동일해야 한다. 2) 멤버 함수처럼 따로 호출할 수 없는 메소드이다.
	// 오버로딩 : 매개변수의 수와 타입형이 다르다면 , 동일한 이름의 함수 사용가능
	// 오버로딩은 메소드와 생성자 선언부에서 많이 사용
	public Teacher(String n, int y, String g) {
		// 생성자를 통해 만들어진 객체의 멤버 변수 초기화
		this.name = n;
		this.year = y;
		this.gender = g;
	}
	public Teacher(String n, String g) {
		this.name = n;
		this.year = 0;
		this.gender = g;
	}
}
public class P1 {
	public static void main(String args[]){
		// 객체 배열 선언
		Teacher t[] = new Teacher[3]; // 객체 생성 x , 객체 생성할 배열 공간만 생성
		// 객체 배열에 대한 객체 생성
		t[0] = new Teacher("이용희", "남자");  // 매개변수 2개인 생성자 호출
		t[1] = new Teacher("장태연", 3, "남자"); // 매개변수 3개인 생성자 호출
		t[2] = new Teacher("박지호", 4, "여자");
		
		System.out.println("교사 목록");
		for(int i = 0 ; i < 3 ; i++)
		{
			System.out.println("이름: " + t[i].getName());
			System.out.println("경력: " + t[i].getYear());
			System.out.println("성별: " + t[i].getGen());
			System.out.println();
		}
		
		// 입력문 사용하여 객체 생성 및 출력
		Scanner s = new Scanner(System.in);
		System.out.println("내 정보");
		// 생성자 매개변수에 입력문 사용가능
		Teacher t1 = new Teacher(s.nextLine(),s.nextLine());
		System.out.println("이름: " + t1.getName());
		System.out.println("경력: " + t1.getYear());
		System.out.println("성별: " + t1.getGen());
		s.close();
	}
}
