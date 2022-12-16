package test5Solution_10_05;

public class T5Solution {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setAge(25);
		s1.setName("�輺ȯ");
		s1.study();
		
		KBStudent kb1 = new KBStudent();
		kb1.setName("������");
		kb1.setAge(40);
		kb1.setEducation("����");
		kb1.setGender("����");
		kb1.attend("�Խ�");
		kb1.attend("���");
		
		System.out.println("===========");
		Circle c1 = new Circle(3);
		System.out.println(c1.getArea());
		
		Sphere sp1 = new Sphere(2);
		System.out.println(sp1.getArea());
		System.out.println(sp1.getVolume());
		
		// Ŭ���������� �θ�Ŭ������ �ڽ�Ŭ������ ������
		// �� static�� ������ ��������� �ٲٴ��� ���� ������ ����
		// ex1) �θ�Ŭ����(Circle)�� Ŭ��������(PI)�� ���� ����
		Circle.setPI(1.0);
		// ex1 ���) �ڽ�Ŭ����(Sphere)�� ������� �ٲ�
		System.out.println(sp1.getVolume());
		// ex2) �ڽ�Ŭ����(Sphere)�� Ŭ��������(PI)�� ���� ����
		Sphere.setPI(0);
		// ex2 ���) �θ�Ŭ����(Circle)�� ������� �ٲ�
		System.out.println(c1.getArea());
		System.out.println("===========");
		
		Cuboid cb1 = new Cuboid();
		cb1.setH(3);
		cb1.setW(4);
		cb1.setZ(5);
		System.out.println(cb1.getCuboidVolume());
	}
}
