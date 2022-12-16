import java.util.*;

class Person2{
	private String name;
	private int age;
	
	public void setName(String n) {this.name=n;}
	public void setAge(int a) {this.age=a;}
	public String getName() {return this.name;}
	public int getAge() {return this.age;}
	
	public void print_P()
	{
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		
	}
}

class Student2 extends Person2{
	private String school;
	
	public void setSchool(String sc) {this.school=sc;}
	public String getSchool() {return this.school;}
	
	public void print_S()
	{
		System.out.println("학교: " + this.school);
	}
}

class Teacher2 extends Person2{
	private String belong;
	
	public void setBelong(String bl) {this.belong=bl;}
	public String getBelong() {return this.belong;}
	
	public void print_T()
	{
		System.out.println("소속: " + this.belong);
	}
}


public class T2Second {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		
		Person2 P = new Person2();
		Student2 Stu = new Student2();
		Teacher2 T = new Teacher2();
		
		String n = s.nextLine();
		int a = s.nextInt();
		String sc = s.nextLine();
		Stu.setName(n);
		Stu.setAge(a);
		Stu.setSchool(sc);
		
		String n2 = s.nextLine();
		int a2 = s.nextInt();
		String bl = s.nextLine();
		T.setName(n2);
		T.setAge(a2);
		T.setBelong(bl);
		
		P.print_P();
		System.out.println();
		Stu.print_P();
		Stu.print_S();
		System.out.println();
		T.print_P();
		T.print_T();
		s.close();

	}
}
