package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇 명 추가?");
		int p = Integer.parseInt(s.nextLine());
		ArrayList<KBStudent> students = new ArrayList<KBStudent>();
		String name = "";
		String gender = "";
		int age = 0;
		int number = 0;
		
		System.out.println("이름입력");
		name = s.nextLine();
		System.out.println("성별입력");
		gender = s.nextLine();
		System.out.println("나이입력");
		age = Integer.parseInt(s.nextLine());
		System.out.println("학생번호입력");
		number = Integer.parseInt(s.nextLine());
		KBStudent stu = new KBStudent(name,gender,age,number);
		students.add(stu);
		
		for(int i = 0 ; i < p-1 ; i++)
		{
			System.out.println("이름입력");
			name = s.nextLine();
			System.out.println("성별입력");
			gender = s.nextLine();
			System.out.println("나이입력");
			age = Integer.parseInt(s.nextLine());
			System.out.println("학생번호입력");
			try {
				number = Integer.parseInt(s.nextLine());
				KBStudent stu2 = new KBStudent(name,gender,age,number);
				if(stu2.equals(students.get(i)))
					throw new Exception("숫자중복");
				else
					students.add(stu2);
			} catch (Exception e) {
				System.out.println("숫자 중복 오류 발생");
				i--;
				continue;
			}
		}
		
		System.out.println("학생 정보 출력");
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.toString());
		}
		
		
		s.close();
	}
}
