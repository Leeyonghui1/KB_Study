package practice1;

public class P1 {
	//����ó��(�����߻��� ó��) ��� :: try catch
	public static void main(String[] args) {
		int a=0,b=0,c=0;
		try {
			a = 10;
			b = 0;
			System.out.println("c ���� ���غ���");
			c = a/b;  // ���� �߻�����
			// ���� try catch ������ �ƴ� ��
			// ������ �߻��ϸ� ���α׷��� �ٷ� ����
			// try catch ������ ����ؼ� ������ �߻��ص� ���α׷� ������ ���� �� ����
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("�� �κп� ���� ����");
		}
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println(c);
	}

}
