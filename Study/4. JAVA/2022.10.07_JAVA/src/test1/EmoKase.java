package test1;

public class EmoKase extends Food {
	
	public void sayEmo()
	{
		System.out.println("EmoKase 클래스의 sayEmo함수");
		System.out.println("이모~~~");
	}
	public String choiceMenu()
	{
		return getName()+"를 선택했습니다.";
	}
}
