package test1;

import test1_1.GameCharacter;

public class MagicianSol extends GameCharacter {
	private int mp;
	
	public MagicianSol() {
		
	}
	public MagicianSol(String id, String _Class, int mp) {
		super(id, _Class);
		this.mp = mp;
	}
	
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	public void magicArrow() 
	{	
		System.out.println(mp+"�� ���� ȥ���� ���� �ַο� ��;�");
		System.out.println(getId()+"���� " + get_Class()+"���� �ְ� ��� �ߵ�");
		System.out.println(getLevel()+"���� ġ�� ������ ����!");	
	}

}
