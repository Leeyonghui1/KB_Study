package test2;

import test1_1.GameCharacter;

public class Novice extends GameCharacter {
	private int hp;

	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void sleep() 
	{
		System.out.println(hp+"�� ��� ȸ��");
		System.out.println("����� " + getId()+"�� hp ȸ��");
		System.out.println(getLevel()+"�����̴� ���� �����ؾ���~?");
	}

}