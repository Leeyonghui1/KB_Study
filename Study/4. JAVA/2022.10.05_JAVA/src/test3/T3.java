package test3;

public class T3 {

	public static void main(String[] args) {
		GameCharacter c1 = new GameCharacter();
		GameCharacter c2 = new GameCharacter();
		GameCharacter c3 = new GameCharacter("이용희","궁수");
		
		System.out.println(GameCharacter.getCount());
		
		c1.setId("장태연");
		c1.setJob("전사");
		c2.setId("차승화");
		c2.setJob("마법사");
		
		c1.sayAttack();
		c2.sayAttack();
		c3.sayAttack();
		GameCharacter.sayHello(c1.getId(),c2.getId(),c3.getId());
	}
}
