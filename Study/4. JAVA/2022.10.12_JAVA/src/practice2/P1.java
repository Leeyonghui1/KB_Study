package practice2;

public class P1 {

	public static void main(String[] args) {
		Student s = new Student("�̵���",34);
		
		System.out.println(s.getAge());
		System.out.println(s.getName());
		System.out.println(s); // �����Ϸ����� �ڵ����� toString���� ó��
		System.out.println(s.toString());
		// toString()���� ����� ���
		// --> practice2.Student@15db9742
		// :: Object Ŭ������ ���� ���ǵǾ��ִ� �޼ҵ�
		// :: ��Ű����.Ŭ������@�����ڵ�(������ ���� �޸� ���� �����ڵ�)
		
		
	}
}
