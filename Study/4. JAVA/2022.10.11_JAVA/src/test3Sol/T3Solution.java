package test3Sol;

import java.util.Scanner;

public class T3Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ù��°?");
		String num1 = s.nextLine();
		System.out.println("�ι�°?");
		String num2 = s.nextLine();
		
		int n1 = 0;
		int n2 = 0;
		try { // �Էµ� ������ Int������ �ٲٱ�
			n1 = Integer.parseInt(num1);
			n2 = Integer.parseInt(num2);
		} catch (Exception e) {
			System.out.println("�߸��� �� ��");
			n1 = 0;
		}
		if(n1 != 0)
		{
			System.out.println(n1*(n2%10));
			System.out.println(n1*((n2/10)%10));
			System.out.println(n1*(n2/100));
			System.out.println(n1*n2);
		}
		System.out.println("���α׷� ����");
		System.out.println("=================");
		System.out.println("ù��° ����?");
		String num3 = s.nextLine();
		System.out.println("�ι�° ����?");
		String num4 = s.nextLine();
		
		
		// toCharArray || charAt , �ƽ�Ű�ڵ� '0'�� ����
		// Character.getNumericValue('1')
		
		int n3 = 0;
		int n4 = 0;
		try {
			n3 = Integer.parseInt(num3);
			n4 = Integer.parseInt(num4);
			System.out.println(n3 * (num4.charAt(2)-'0'));
			System.out.println(n3 * (num4.charAt(1)-'0'));
			System.out.println(n3 * (num4.charAt(0)-'0'));
			System.out.println(n3 * n4);
		} catch (Exception e) {
			n3 = 0;
			System.out.println("���� ����!");
			e.printStackTrace();
		}
		System.out.println("���α׷� ��");
		
		s.close();
	}
}
