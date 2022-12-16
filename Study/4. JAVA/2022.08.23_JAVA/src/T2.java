class Persons{
	private String name;
	private int age;
	
	public Persons(String n, int a)
	{
		this.name = n;
		this.age = a;
	}
	
	public void print_P()
	{
		System.out.println("사람정보");
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
	}
}

class Students extends Persons{
	private String school;
	
	public Students(String n, int a, String sc)
	{
		super(n,a);
		this.school = sc;
	}
	
	public void print_Stu()
	{
		System.out.println("학교이름: " + this.school);
	}
}

class Teacher extends Persons{
	private String belong;
	
	public Teacher(String n, int a, String bl)
	{
		super(n,a);
		this.belong = bl;
	}
	
	public void print_T()
	{
		System.out.println("소속: " + this.belong);
	}
}


public class T2 {
	public static void main(String args[]) {
	Persons P = new Persons("이용희",28);
	Students Stu = new Students("차승화",30,"경북산업");
	Teacher T = new Teacher("장태연",28,"빅데이터");
	
	P.print_P();
	System.out.println();
	Stu.print_P();
	Stu.print_Stu();
	System.out.println();
	T.print_P();
	T.print_T();
	}
}
