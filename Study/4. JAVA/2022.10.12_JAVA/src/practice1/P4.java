package practice1;

public class P4 {
	
	public static void main(String[] args) {
		// finally
		// try/catch �������� 
		// catch �ڿ� finally������ ���� ������ �����ϴ� ��ɹ�
		// DB �����ϴ� ���������� ������ ���� �� ���ܻ����
		// finally �κп� DB���� ���� �ڵ带 �Է�
		
		int a=0,b=0,c=0,d=0;
		try {
			a = 10;
			c = a/b;
		} catch (Exception e) {
			System.out.println("�߸���");
			return; // ���α׷� ����
		} finally {
			System.out.println("finally������ ������ ����");			
		}
		System.out.println("����� �ȵ�");
		System.out.println(c+d);
	}
}
