package practice1;

public class Circle {
	// �ν��Ͻ� ����
	private int r;
	// Ŭ��������
	// PI�� ���� ��� Ŭ������ ���������� �����ϰ�
	// ���������� �� �� �ִ� ����
	private static double PI;
	
	// Ŭ���� �޼ҵ�
	// ���������� �� �� �ִ� �޼ҵ�
	public static double getPI() {return PI;}
	public static void setPI(double pI) {PI = pI;}
	// �ν��Ͻ� �޼ҵ� ���� ����ƽ�̶� �����ִµ�??�ƴԸ���
	public int getR() {return r;}
	public void setR(int r) {this.r = r;}
	
	// ������
	public Circle(int r) {
		this.r = r;
		PI = 3.14;
	}
	
	public double getArea() {return r*r*PI;}
}
