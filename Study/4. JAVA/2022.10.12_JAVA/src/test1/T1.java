package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� �߰�?");
		int p = Integer.parseInt(s.nextLine());
		ArrayList<KBStudent> students = new ArrayList<KBStudent>();
		String name = "";
		String gender = "";
		int age = 0;
		int number = 0;
		
		System.out.println("�̸��Է�");
		name = s.nextLine();
		System.out.println("�����Է�");
		gender = s.nextLine();
		System.out.println("�����Է�");
		age = Integer.parseInt(s.nextLine());
		System.out.println("�л���ȣ�Է�");
		number = Integer.parseInt(s.nextLine());
		KBStudent stu = new KBStudent(name,gender,age,number);
		students.add(stu);
		
		for(int i = 0 ; i < p-1 ; i++)
		{
			System.out.println("�̸��Է�");
			name = s.nextLine();
			System.out.println("�����Է�");
			gender = s.nextLine();
			System.out.println("�����Է�");
			age = Integer.parseInt(s.nextLine());
			System.out.println("�л���ȣ�Է�");
			try {
				number = Integer.parseInt(s.nextLine());
				KBStudent stu2 = new KBStudent(name,gender,age,number);
				if(stu2.equals(students.get(i)))
					throw new Exception("�����ߺ�");
				else
					students.add(stu2);
			} catch (Exception e) {
				System.out.println("���� �ߺ� ���� �߻�");
				i--;
				continue;
			}
		}
		
		System.out.println("�л� ���� ���");
		for (KBStudent kbStudent : students) {
			System.out.println(kbStudent.toString());
		}
		
		
		s.close();
	}
}
