package test5Solution_10_05;

public class Sphere extends Circle {
	
	// super :: �θ�Ŭ������ ������ ȣ��
	public Sphere(int r) {
		super(r);
	}
	
	public double getVolume()
	{
		return (4.0/3)*getPI()*getR()*getR()*getR();
	}

	// Sphere Ŭ������ ���ο� �Ӽ��� �߰����� �ʰ� ���ο� ���(�޼ҵ�)�� �߰�
	
	// protected
	// ���� ��Ű�������� publicó�� ���(����Ʈ ���������� ������)
	// �ٸ� ��Ű�������� protected �Ӽ��� ���� Ŭ������ ��ӹ��� �ڽ�Ŭ���������� ��밡��
	
	protected String Color;
	protected void spin()
	{
		System.out.println("���ۺ���");
	}
}
