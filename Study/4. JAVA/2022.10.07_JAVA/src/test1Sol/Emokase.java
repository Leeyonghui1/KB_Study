package test1Sol;

public class Emokase extends Food{

	public Emokase(String name, int price) {
		super(name, price);
	}
	
	public void sayEmo()
	{
		System.out.println("이모님~" + getName() + "주세요");
	}
	public String choiceMenu(String menu)
	{
		return "이모의 특선 메뉴 : "+ menu;
	}
}
