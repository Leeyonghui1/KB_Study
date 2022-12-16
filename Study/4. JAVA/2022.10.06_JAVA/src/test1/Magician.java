package test1;

import test1_1.GameCharacter;

public class Magician extends GameCharacter {
	private int mp;

	public Magician() {
		set_Class("마법사");
	}
	// 메소드
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	
	public void magicArrow()
	{
		System.out.println("매직애로우 발사");
	}
	public void attack()
	{
		System.out.println("마법사의 마법공격개시");
	}
	

}
