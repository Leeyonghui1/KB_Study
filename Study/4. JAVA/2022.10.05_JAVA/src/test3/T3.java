package test3;

public class T3 {

	public static void main(String[] args) {
		GameCharacter c1 = new GameCharacter();
		GameCharacter c2 = new GameCharacter();
		GameCharacter c3 = new GameCharacter("�̿���","�ü�");
		
		System.out.println(GameCharacter.getCount());
		
		c1.setId("���¿�");
		c1.setJob("����");
		c2.setId("����ȭ");
		c2.setJob("������");
		
		c1.sayAttack();
		c2.sayAttack();
		c3.sayAttack();
		GameCharacter.sayHello(c1.getId(),c2.getId(),c3.getId());
	}
}
