package my.hello.javastudy02;
import java.util.*;

class Tourist{
	// 이름, 나이, 번호, 소셜넘버(시작이 0일수도 있어서 String)
	private String name;
	private int age;
	private int beonho;
	private String sNum;
	
	// alt shift s + o
	// 마우스 오른쪽 -> Source -> Generate Constructor using Fields
	public Tourist() {
		super(); // 부모객체 생성자 호출
	}
	
	public Tourist(String name, int age, int beonho, String sNum) 
	{ 
		this.name = name;
		this.age = age;
		this.beonho = beonho;
		this.sNum = sNum;
	}

	public Tourist(String name) {
		this.name = name;
	}

	// alt shift s + r
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
	public int getBeonho() {return beonho;}
	public void setBeonho(int beonho) {this.beonho = beonho;}
	public String getsNum() {return sNum;}
	public void setsNum(String sNum) {this.sNum = sNum;}
}



public class T1Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("몇 명 관리할까요?");
		int count = s.nextInt();
		/*
		Student[] students_arr = new Student[count];
		for(int i = 0 ; i < count ; i++)
		{
			s.nextLine(); // 버퍼지우기
			System.out.println("이름?");
			String name = s.nextLine();
			System.out.println("나이?");
			int age = s.nextInt();
			System.out.println("점수?");
			double score = s.nextDouble();
			
			students_arr[i] = new Student(name, age, score);
		}
		
		for (Student ss : students_arr) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getScore());
		}
		
		ArrayList<Student> stu_list = new ArrayList<Student>();
		for(int i = 0 ; i < count ; i++)
		{
			s.nextLine(); // 버퍼지우기
			System.out.println("이름?");
			String name = s.nextLine();
			System.out.println("나이?");
			int age = s.nextInt();
			System.out.println("점수?");
			double score = s.nextDouble();
			
			stu_list.add(new Student(name,age,score));
		}
		for (Student ss : stu_list) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getScore());
		}
		*/
		System.out.println("여행객 출력시작");
		s.nextLine(); // 버퍼지우기
		Tourist t_arr[] = new Tourist[count];
		for(int i = 0 ; i < count ; i++)
		{
			System.out.println("이름?");
			String name = s.nextLine();
			System.out.println("나이?");
			int age = s.nextInt();
			System.out.println("번호?");
			int beonho = s.nextInt();
			s.nextLine(); // 버퍼지우기
			System.out.println("소셜번호?");
			String sNum = s.nextLine();
			
			t_arr[i] = new Tourist(name,age,beonho,sNum);
		}
		for (Tourist tt : t_arr) {
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getBeonho());
			System.out.println(tt.getsNum());
		}
		
		ArrayList<Tourist> t_list = new ArrayList<Tourist>();
		for(int i = 0 ; i < count ; i++)
		{
			System.out.println("이름?");
			String name = s.nextLine();
			System.out.println("나이?");
			int age = s.nextInt();
			System.out.println("번호?");
			int beonho = s.nextInt();
			s.nextLine(); // 버퍼지우기
			System.out.println("소셜번호?");
			String sNum = s.nextLine();
			
			t_list.add(new Tourist(name,age,beonho,sNum));
		}
		for (Tourist tt : t_list) {
			System.out.println(tt.getName());
			System.out.println(tt.getAge());
			System.out.println(tt.getBeonho());
			System.out.println(tt.getsNum());
		}
		
		s.close();
	}
}
