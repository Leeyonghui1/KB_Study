package test4;

import java.util.ArrayList;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) throws NumberFormatException, Exception {
		Scanner s = new Scanner(System.in);
		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		try {
			System.out.println("1)�̸��Է�");
			stu1.setName(s.nextLine());
			System.out.println("1)�����Է�");
			stu1.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("2)�̸��Է�");
			stu2.setName(s.nextLine());
			System.out.println("2)�����Է�");
			stu2.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("3)�̸��Է�");
			stu3.setName(s.nextLine());
			System.out.println("3)�����Է�");
			stu3.setAge(Integer.parseInt(s.nextLine()));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ArrayList<Student> stu_arr = new ArrayList<Student>();
		stu_arr.add(stu1);
		stu_arr.add(stu2);
		stu_arr.add(stu3);
		
		System.out.println("�л����� ���");
		for (Student student : stu_arr) {
			System.out.println((stu_arr.indexOf(student)+1)+"�� �л� �̸� : "+student.getName());
			System.out.println((stu_arr.indexOf(student)+1)+"�� �л� ���� : "+student.getAge());
		}
		s.close();
	}

}
