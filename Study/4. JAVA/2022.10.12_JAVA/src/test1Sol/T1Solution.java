package test1Sol;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class T1Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("몇 명 입력?");
		int count = 0;
		try {
			count = Integer.parseInt(s.nextLine());
			if(count < 0)
			{
				s.close();
				throw new Exception("길이가 0이하일 수 없다");				
			}
		} catch (Exception e) {
			System.out.println("숫자 잘못 입력 "+e.getMessage());
			s.close();
			return;
		} finally {
			// 프로그램이 종료되어도 무조건 실행함
			if(count <=0)
				System.out.println("프로그램을 재시작해주세요");
		}
		
		List<KBStudent> students = new ArrayList<KBStudent>();
		for(int i = 0 ; i < count ; i++)
		{
			String name="";
			String gender="";
			int age=0;
			int number=0;
			System.out.println("이름은?");
			name = s.nextLine();
			System.out.println("성별은?");
			gender = s.nextLine();
			try {
				System.out.println("나이는?");
				age = Integer.parseInt(s.nextLine());
				System.out.println("번호는?");
				number = Integer.parseInt(s.nextLine());
				if(age <= 0)
				{
					System.out.println("나이 값 잘못되었습니다");
					age = 0;
				}
			} catch (Exception e) {
				 e.printStackTrace();
			}
			
			KBStudent k = new KBStudent(name, gender, age, number);
			if(students.contains(k)) {
				System.out.println("중복!");
				i--;
				continue;
			}
			students.add(k);
		}
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		System.out.println("----나이순 출력(오름차순)----");
		Collections.sort(students);
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		
		// 번호순 정렬
		Collections.sort(students, new Comparator<KBStudent>() {

			@Override
			public int compare(KBStudent o1, KBStudent o2) {
				return o1.getNumber() - o2.getNumber();
			}
		});
		System.out.println("----번호순 출력(오름차순)----");
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent);
		}
		s.close();
	}
}
