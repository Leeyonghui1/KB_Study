package practice1;

import test5Solution_10_05.Sphere;

public class P1 {

	public static void main(String[] args) {
		Person p = new Person();
		// ����Ʈ ���������� ���
		p.name = "�躸��";
		p.age = 5;
		p.sNum = "2012";
		
		Globe g1 = new Globe(10);
		g1.rollTheGlobe("�Ķ���");
		g1.setColor("���");
		System.out.println(g1.getColor());
		// g1.Color = "���";  :: �����߻�
		// g1.spin(); :: �����߻�
		
		Sphere s1 = new Sphere(5);
		s1.getArea();
		// s1.spin();   :: �����߻�
		// s1.Color="red"; :: �����߻�
		
		// Color, spin�� protected
		// Sphere�� ����� Ŭ�����̰ų�
		// Sphere�� ���� ����(��Ű��)�� �ִ� Ŭ���������� ���� ����
		
	}

}
