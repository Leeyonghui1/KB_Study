package practice1;

public class T2Solution {
	// Ŭ���� �޼ҵ�
	public static void sayHello() {
		System.out.println("Hello World");
	}
	
	// �ν��Ͻ� �޼ҵ�
	public void toSay(String name) {
		System.out.println(name+"��, �ȳ�");
	}

	public static void main(String[] args) {
		Circle c1 = new Circle(2);
		Circle c2 = new Circle(3);
		
		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		// PI���� �ٲٸ� ��� Circle ��ü���� ������ ��ħ
		Circle.setPI(3.0);

		System.out.println(c1.getArea());
		System.out.println(c2.getArea());
		
		// Ŭ���� �޼ҵ� Ư¡
		// Ŭ���� �޼ҵ� �ȿ��� �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ尡 ����
		// ���� : static�� ���� �͵��� �޸𸮿� ���� �ö󰡱� ����
		// Ŭ���� ����,�޼ҵ� :: ���α׷��� �������ڸ��� �ö�
		// �ν��Ͻ� ����,�޼ҵ� :: new Ű���� ������ �޸𸮿� �ö�
		// static�� ���� �޼ҵ� �ȿ��� static�� �پ��ִ� �޼ҵ峪 ������ ��
		// static�� ���� �޼ҵ� �ȿ��� static�� ���ų� �־ ����
		
		sayHello();
		
		//toSay("����ȣ");  :: �����߻�
		// static�� ���� �޼ҵ�(�ν��Ͻ� �޼ҵ�)�� 
		// static�� ���� �޼ҵ�(Ŭ���� �޼ҵ�)�ȿ��� ȣ���ҷ��� 
		// ��üȭ(�ν��Ͻ�ȭ)�ؼ� ȣ��
		
		new T2Solution().toSay("�̵���");
		T2Solution temp = new T2Solution();
		temp.toSay("�̿���");	
	}
}
