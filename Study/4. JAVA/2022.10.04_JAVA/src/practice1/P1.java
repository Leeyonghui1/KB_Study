package practice1;

public class P1 {

	public static void main(String[] args) {
		// class�� �̿��ؼ� ������ ������ ��
		// �ݵ�� new Ű���尡 �ʿ�
		// why? ����� ���� �ڷ����� �Ϲ����� �ڷ����� �ƴ�
		// �׷��� �޸𸮸� ���� �Ҵ��������
		// new Ű���� :: �޸� �Ҵ� Ű���� (=C��� malloc)
		// new �� Ŭ������()�� �ǹ�
		// �޸𸮸� �Ҵ��ϱ�� �ϴµ� �����ŭ, � ���·� �Ҵ����� �����ִ°�
		
		// ���
		// ����� ���� class, ��� �ڹٿ��� ���� class��
		// new Ű����� Ŭ�������� �̿��ؼ� �����ؾ� ��
		// Ŭ������ ������ = new Ŭ������();
		// Ŭ���� �̿��ؼ� ������ ������ Ŭ���� ��ü��
		// ��ü(Object)��� �θ�
		Customer c1 = new Customer();
		c1.name = "�̿���";
		c1.age = 30;
		c1.cNum = "00001";
		/*
		Customer c2;
		c2.name = "�̵���";
		c2.age = 33;
		c2.cNum = "00000";
		*/
		
		/*
		KBCustomer kb1 = new KBCustomer();
		kb1.age = 100;
		*/
		
		KBCustomer k1 = new KBCustomer();
		k1.setAge(34);
		k1.setName("�̵���");
		k1.setcNum("00000");
		
		System.out.println(k1.getAge());
		System.out.println(k1.getName());
		System.out.println(k1.getcNum());
	}

}
