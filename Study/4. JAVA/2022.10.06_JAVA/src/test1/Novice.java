package test1;

import test1_1.GameCharacter;

public class Novice extends GameCharacter {
	private int hp;

	public Novice() {
		set_Class("�ʽ���");
	}
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void sleep()
	{
		System.out.println("�������");
	}
	public void attack()
	{
		System.out.println("������ ����");
	}

}
