package test1Sol;

public interface Animalable {
	public void charming();
	// default ���� �ش� �޼ҵ带 �������̵�(����)���� �ʾƵ� �����߻����� ����
	public default void sleep() {
		System.out.println("���� ��ϴ�.");
	}
}
