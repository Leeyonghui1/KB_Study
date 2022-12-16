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
			System.out.println("1)이름입력");
			stu1.setName(s.nextLine());
			System.out.println("1)나이입력");
			stu1.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("2)이름입력");
			stu2.setName(s.nextLine());
			System.out.println("2)나이입력");
			stu2.setAge(Integer.parseInt(s.nextLine()));
			System.out.println("3)이름입력");
			stu3.setName(s.nextLine());
			System.out.println("3)나이입력");
			stu3.setAge(Integer.parseInt(s.nextLine()));			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ArrayList<Student> stu_arr = new ArrayList<Student>();
		stu_arr.add(stu1);
		stu_arr.add(stu2);
		stu_arr.add(stu3);
		
		System.out.println("학생정보 출력");
		for (Student student : stu_arr) {
			System.out.println((stu_arr.indexOf(student)+1)+"번 학생 이름 : "+student.getName());
			System.out.println((stu_arr.indexOf(student)+1)+"번 학생 나이 : "+student.getAge());
		}
		s.close();
	}

}
