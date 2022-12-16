package test1Sol;

public class Sushi extends Food{

	private String wasabiBrand;
	
	// �θ�Ŭ������ �����ڰ� �����ǵ� ���¶��(����Ʈ�����ڰ� ���»���)
	// �ڽ�Ŭ���������� �ݵ�� �����ڸ� �θ�Ŭ���� ������ �������� �������ؾ��Ѵ�
	// ����, �θ�Ŭ������ �����ڰ� ������ �������ߴٸ�
	// ����, �ϳ��� ����ص� �ȴ�
	public Sushi(String name) {
		super(name);
	}

	public Sushi(String name, int price) {
		super(name, price);
	}

	public Sushi(String name, int price, String wasabiBrand) {
		super(name, price);
		this.wasabiBrand = wasabiBrand;
	}

	public String getWasabiBrand() {return wasabiBrand;}
	public void setWasabiBrand(String wasabiBrand) {this.wasabiBrand = wasabiBrand;}
	
}
