package test1;

public class SquareSol {
	private int wh;
	
	
	// ������
	// ����Ʈ������ :: �ƹ��͵� ���� ������
	public SquareSol() {
		
	}
	public SquareSol(int wh) {
		//this.wh = wh;
		// ���� ���� �ٷ� ���� �ʱ�ȭ�ϴ� ���
		// �������� �״�� �ʱ�ȭ
		// �׷��� �Ʒ��� ���� 
		// ��������ó���� �� set�Լ��� �̿��ؼ�
		// wh�� �ʱ�ȭ
		setWh(wh);
	}


	// �޼ҵ�
	public int getWh() {return wh;}
	public void setWh(int wh)
	{
		if(wh<=0)
		{
			System.out.println("�߸��� wh ��");
			this.wh = 0;
			return;
		}
		this.wh = wh;
	}
}
