package test1;

import test1_1.GameCharacter;

public class Magician extends GameCharacter {
	private int mp;

	public Magician() {
		set_Class("������");
	}
	// �޼ҵ�
	public int getMp() {return mp;}
	public void setMp(int mp) {this.mp = mp;}
	
	
	public void magicArrow()
	{
		System.out.println("�����ַο� �߻�");
	}
	public void attack()
	{
		System.out.println("�������� �������ݰ���");
	}
	

}
