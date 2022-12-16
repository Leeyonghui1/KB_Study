package my.hello.javastudy02;
import java.util.*;

class Tourist{
	// �̸�, ����, ��ȣ, �Ҽȳѹ�(������ 0�ϼ��� �־ String)
	private String name;
	private int age;
	private int beonho;
	private String sNum;
	
	// alt shift s + o
	// ���콺 ������ -> Source -> Generate Constructor using Fields
	public Tourist() {
		super(); // �θ�ü ������ ȣ��
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
		
		System.out.println("�� �� �����ұ��?");
		int count = s.nextInt();
		/*
		Student[] students_arr = new Student[count];
		for(int i = 0 ; i < count ; i++)
		{
			s.nextLine(); // ���������
			System.out.println("�̸�?");
			String name = s.nextLine();
			System.out.println("����?");
			int age = s.nextInt();
			System.out.println("����?");
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
			s.nextLine(); // ���������
			System.out.println("�̸�?");
			String name = s.nextLine();
			System.out.println("����?");
			int age = s.nextInt();
			System.out.println("����?");
			double score = s.nextDouble();
			
			stu_list.add(new Student(name,age,score));
		}
		for (Student ss : stu_list) {
			System.out.println(ss.getName());
			System.out.println(ss.getAge());
			System.out.println(ss.getScore());
		}
		*/
		System.out.println("���ఴ ��½���");
		s.nextLine(); // ���������
		Tourist t_arr[] = new Tourist[count];
		for(int i = 0 ; i < count ; i++)
		{
			System.out.println("�̸�?");
			String name = s.nextLine();
			System.out.println("����?");
			int age = s.nextInt();
			System.out.println("��ȣ?");
			int beonho = s.nextInt();
			s.nextLine(); // ���������
			System.out.println("�Ҽȹ�ȣ?");
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
			System.out.println("�̸�?");
			String name = s.nextLine();
			System.out.println("����?");
			int age = s.nextInt();
			System.out.println("��ȣ?");
			int beonho = s.nextInt();
			s.nextLine(); // ���������
			System.out.println("�Ҽȹ�ȣ?");
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
