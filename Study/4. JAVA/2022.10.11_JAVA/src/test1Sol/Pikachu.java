package test1Sol;

public class Pikachu implements Animalable, Cloneable {

	// clone �޼ҵ�� default�� �����Ǿ� �ִµ� �������̵��ؾ� ��������
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	private String Name;
	
	// ������	
	public Pikachu(String name) {
		super();
		Name = name;
	}
	
	// �޼ҵ�
	public String getName() {return Name;}
	public void setName(String name) {Name = name;}

	@Override
	public void charming() {
		System.out.println("��ī��ī");
	}

}
