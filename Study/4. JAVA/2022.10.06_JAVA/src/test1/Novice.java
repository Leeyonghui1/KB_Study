package test1;

import test1_1.GameCharacter;

public class Novice extends GameCharacter {
	private int hp;

	public Novice() {
		set_Class("초심자");
	}
	public int getHp() {return hp;}
	public void setHp(int hp) {this.hp = hp;}
	
	public void sleep()
	{
		System.out.println("수면공격");
	}
	public void attack()
	{
		System.out.println("하찮은 공격");
	}

}
