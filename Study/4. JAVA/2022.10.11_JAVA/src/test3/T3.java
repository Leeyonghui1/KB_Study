package test3;

import java.util.Scanner;

public class T3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = 0;
		int n2 = 0;
		String str = "";
		int r1 = 0;
		int r2 = 0;
		int r3 = 0;
		try {
			System.out.println("����1 �Է�");
			n1 = Integer.parseInt(s.nextLine());
			System.out.println("����2 �Է�");
			str = s.nextLine();
			n2 = Integer.parseInt(str);
			r1 = Character.getNumericValue(str.charAt(2));
			r2 = Character.getNumericValue(str.charAt(1));
			r3 = Character.getNumericValue(str.charAt(0));
		} catch (Exception e) {
			n1 = 0;
			n2 = 0;
		}
		int mul = n1 * n2;
		int q1 = n1 * r1;
		int q2 = n1 * r2;
		int q3 = n1 * r3;
		
		System.out.println("����1 : "+n1);
		System.out.println("����2 : "+n2);
		System.out.println("����2�� 1�� �ڸ� ���� : "+r1);
		System.out.println("����2�� 10�� �ڸ� ���� : "+r2);
		System.out.println("����2�� 100�� �ڸ�  ���� : "+r3);
		System.out.println("Q1)1�� �ڸ� �� : "+q1);
		System.out.println("Q2)10�� �ڸ� �� : "+q2);
		System.out.println("Q3)100�� �ڸ� ��: "+q3);
		System.out.println("Q4)�� ���� �� : "+mul);
		
		System.out.println("=============");
		System.out.println("������ ����");
		System.out.println("Q1 : "+n1*((n2%100)%10));
		System.out.println("Q2 : "+n1*((n2%100)/10));
		System.out.println("Q3 : "+n1*(n2/100));
		System.out.println("Q4 : "+n1*n2);
		
		
		s.close();
	}
}
