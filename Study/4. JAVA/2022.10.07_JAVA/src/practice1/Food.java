package practice1;

// �߻�Ŭ����
public abstract class Food {
	private int price;
	public String name;
	
	public int getPrice() {return price;}
	public void setPrice(int price) {this.price = price;}
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// �߻�Ŭ���� ������ �޼ҵ带 ����(����+��ɹ�(��üȭ))�� �����ʰ�
	// �����Ѵ�.
	// �߻�Ŭ������ ��ӹ��� �ڽ�Ŭ�������� ��üȭ�� �ݵ�� �ؾ��Ѵ�
	public abstract void eat();
	
	
}
