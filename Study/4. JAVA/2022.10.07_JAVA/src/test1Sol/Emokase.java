package test1Sol;

public class Emokase extends Food{

	public Emokase(String name, int price) {
		super(name, price);
	}
	
	public void sayEmo()
	{
		System.out.println("�̸��~" + getName() + "�ּ���");
	}
	public String choiceMenu(String menu)
	{
		return "�̸��� Ư�� �޴� : "+ menu;
	}
}
