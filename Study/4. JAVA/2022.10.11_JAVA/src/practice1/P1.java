package practice1;

import java.util.Scanner;

public class P1 {

	// ����ó��
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// �Է��� ���ڿ��� ���ڷ� �ٲٴ� �� ���� ���
		// 1) nextInt
		System.out.println("���� �Է�");
		int num = s.nextInt();
		// nextInt ���� nextLine �Է��� �ȵ�(���� ����Ű ����)
		//[s.nextLine(); // ���� ����Ű �����]
		String name = s.nextLine();
		System.out.println("num="+num+", name="+name);
		// 2) Integer.parseInt
		
		try {
			System.out.println("�ٽ� ���� �Է�");
			int age = Integer.parseInt(s.nextLine());
			System.out.println("���ڿ� �Է�");
			String alias = s.nextLine();
			System.out.println("age="+age+", alias="+alias);
			
			System.out.println("���ڿ��� ���ڷ� ��ȯ");
			age = Integer.parseInt("�̵���"); // ���� �߻�			
		} catch (Exception e) {
			System.out.println("age�� ����");
			e.printStackTrace(); // �������
			// ���������� ����ϰ� ���α׷��� ��� ����
		}
		
		System.out.println("��");
		s.close();
	}

}
