package practice2;

public class P2 {

	public static void main(String[] args) {
		String a = "�̵���";
		String b = "�̵���";
		// c�� d�� �����ʹ� ������ ��ġ�� �ٸ�
		String c = new String("�躸��");
		String d = new String("�躸��");
		
		Student s1 = new Student("�̵���",340);
		Student s2 = new Student("�̵���",340);
		
		System.out.println(a==b); // t
		System.out.println(c==d); // f :: c�� d�� �ٸ� ��ġ�� �����ϱ� ����
		System.out.println(s1==s2); // f
		
		System.out.println(a.equals(b)); // t
		// equals�� �̸�(������)�� ������
		System.out.println(c.equals(d)); // t
		
		// s1�� s2�� ���� �ٸ� ��ġ�� �����ϱ� ������ f
		// Object equals�� hash�ڵ带 ���ϴ� �޼ҵ�
		System.out.println(s1.equals(s2)); // f
		
		// �̸��� ����� ������ ���� ��ü��� ǥ���ϴ� equals�� �������� Ŭ������ ����
		Worker w1 = new Worker("����ȣ","001");
		Worker w2 = new Worker("����ȣ","001");
		Worker w3 = new Worker("����ȣ","002");
		
		System.out.println(w1.equals(w2)); // t
		System.out.println(w1.equals(w3)); // f
		
	}
}
