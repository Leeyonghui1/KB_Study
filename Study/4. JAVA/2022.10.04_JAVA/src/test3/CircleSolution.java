package test3;

public class CircleSolution {
	private int r;
	private final double pi = 3.14;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		if(r<=0)
			this.r = 0;
		else
			this.r = r;
	}
	
	public double getArea() 
	{
		if(r<=0)
		{
			System.out.println("������ �� Ȯ���ʿ�");
			return 0;
		}
		return r*r*pi;
	}		
	public double getRound() 
	{
		if(r<=0)
		{
			System.out.println("������ �� Ȯ���ʿ�");
			return 0;
		}
		return 2*r*pi;
	}

	// ������
	// �⺻ ���� :: �Ʒ��� ���� �ƹ��͵� �������� �ʴ� �ڵ�
	// public CircleSolution(){}
	// ������ :: ���ϰ� ���� �Լ�
	// �����ڴ� ���ڱ״�� ������ �� ȣ���ϹǷ�
	// ������ �����԰� ���ÿ� �Ӽ����� �ٷ� ������ �� ����
	public CircleSolution(int r) {
		setR(r);
	}
	// ������ :: �����ڸ� ��������� ���ԵǸ� ������ �ִ� ���� �����ڴ� ������
	//		      �׷��� �����ڸ� �������ϸ� ������ ��ü�� �����ؾ� ��
	
	// ������ �������� �⺻ �����ڸ� �ٽ� �����ָ� �ٽ� ��������
	public CircleSolution() {
		
	}
	
	// �����ε�
	// �����ڳ� �Լ�(=�޼ҵ�) ���� ��
	// �̸��� �Ȱ����� �Ű������� ������ Ÿ���� �ٸ� ��� ���� �ٸ� �Լ��� �ν�
}
