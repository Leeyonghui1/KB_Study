package practice1;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		// 
		int a=0, b=0, c=0;
		
		// 1) ���ڸ� �߸� �Է��� ���
		// 2) �߸��� ������ �� ���
		// catch�� ������ ��� ����
		// ��, �������� Exception Ȥ�� Exception �ؿ� Throwable �߰�
		Scanner s = new Scanner(System.in);
		try {
			a = 10;
			System.out.println("b �Է�");
			b = Integer.parseInt(s.nextLine());
			c = a/b;
		} catch (NumberFormatException e) {
			System.out.println("���� ���� (����)" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("���� ���� (����)" + e.getMessage());
		} catch (Exception e) {
			System.out.println("���� �߸���");
			e.printStackTrace();	
		}
		System.out.println("���� c ����? " + c);
		s.close();
	}

}
