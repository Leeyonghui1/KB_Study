package test4Sol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class T4Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Student s1 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s1.setAge(age);
			System.out.println("학생 이름은?");
			s1.setName(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값");
			s1.setName("수정요망학생1");
		}
		
		Student s2 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s2.setAge(age);
			System.out.println("학생 이름은?");
			s2.setName(s.nextLine());
		} catch (Exception e) {
			System.out.println("잘못된 값");
			s2.setName("수정요망학생2");
		}
		
		// 각자 다른 오류에 따른 각각의 오류 메시지 출력
		Student s3 = new Student();
		try {
			System.out.println("학생 나이는?");
			int age = Integer.parseInt(s.nextLine());
			s3.setAge(age);
			System.out.println("학생 이름은?");
			s3.setName(s.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("숫자 포맷 형식 에러");
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("수학적 에러");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("에러");
			e.printStackTrace();
		} catch (Throwable e) {
			System.out.println("가장 큰 범주의 에러");
			e.printStackTrace();
		}
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		
		for (Student student : students) {
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student); // Student 클래스 값이 String으로 변환이 안됨
			// ==> Object클래스의 toString 메소드 사용해야함
		}
		
		
		
		
		
		
		
		s.close();
	}
}
