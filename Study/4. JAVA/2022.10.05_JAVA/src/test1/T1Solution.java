package test1;

public class T1Solution {

	public static void main(String[] args) {
		SquareSol s1 = new SquareSol();
		s1.setWh(-1);
		System.out.println(s1.getWh());
		s1.setWh(10);
		System.out.println(s1.getWh());
		
		// '-50'�� �־����� ���� '-50'�״�� ����
		// ������ ������� ������� ����
		// �׷��� Ŭ���� ������ �κ��� ����
		SquareSol s2 = new SquareSol(-50);
		System.out.println(s2.getWh());
		System.out.println("===========");
		
		RectangleSol r1 = new RectangleSol();
		RectangleSol r2 = new RectangleSol(2);
		RectangleSol r3 = new RectangleSol(3,2);
		
		System.out.println(r1.getArea());
		System.out.println(r2.getArea());
		System.out.println(r3.getArea());
		
		r1.setH(10);
		r1.setW(5);
		System.out.println(r1.getArea());
		
		// ������ :: Ŭ������(), Ŭ������(�Ű�������)
		// �ν��Ͻ� :: new + ������
		
		// Math Ŭ�������� '����������' ���Ǵ� �޼ҵ�
		Math.random();
		// Math Ŭ�������� '����������' ���Ǵ� ����
		System.out.println(Math.PI);
	}
}
