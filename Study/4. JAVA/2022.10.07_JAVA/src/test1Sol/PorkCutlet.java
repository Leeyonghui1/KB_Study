package test1Sol;

public class PorkCutlet extends Food{

	public PorkCutlet(String name, int price) {
		super(name, price);
	}
	
	@Override
	// �������̵� :: �����
	// �θ�Ŭ����(Food)�� �޼ҵ�(eat)�� �ƴ� ���� �ٸ� �޼ҵ�(eat)�� ����
	public void eat() {
		// TODO Auto-generated method stub
		// super.eat(); :: �θ�Ŭ������ eat() ȣ��
		System.out.println(getName()+"�� �ְ��� ���");
		System.out.println(getPrice()+"���� ������ �Ʊ��� �ʳ�");
	}
	
	// �����ε��� �޼ҵ�� ���� �Ű����� Ÿ���̳� ������ �ٸ���
	public void eat(int count)
	{
		System.out.println(count+"�� ��� ����");
	}
	public void eat(String source)
	{
		System.out.println(source+"�� ������");
	}
}
