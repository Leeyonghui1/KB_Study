package test2;

import java.util.ArrayList;

import test1_1.GameCharacter;

public class T2Solution {

	public static void main(String[] args) {
		ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
		
		GameCharacter g = new GameCharacter();
		g.set_Class("���α׷���");
		g.setId("���ڵ�");
		g.setLevel(100);
		players.add(g);
		
		Novice n = new Novice();
		n.set_Class("���");
		n.setHp(10);
		n.setId("���");
		n.setLevel(1);
		players.add(n);
		
		// players�� GameCharacter Ÿ�� ArrayList ������
		// ������������, GameCharacter�� ����� �� �� ���� ����
		
		GameCharacter m = new Magician();
		m.set_Class("�븶����");
		m.setId("���¼ַ��̵���");
		m.setLevel(27);
		if(m instanceof Magician)
		{
			Magician temp = (Magician)m;
			temp.setMp(1000);
			// �Ʒ��� 1�� �ڵ�� �� 2�ٰ� ������ �ǹ��� �ڵ�
			// ((Magician)m).setMp(100);
		}
		players.add(m);
		
		players.add(new Worrior());
		players.get(players.size()-1).set_Class("Ű��������");
		players.get(players.size()-1).setId("���̹��ǳ�");
		players.get(players.size()-1).setLevel(7);
		if(players.get(players.size()-1) instanceof Worrior)
		{
			Worrior w = (Worrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			// ���� ���翡 ���ؼ�
			// w �� players ����Ʈ �ȿ� 4��° ���� ����Ű�� �ִ�.
			// �׷��� w���� set�ϸ� players.get(3)�� ���� �ٲ�
		}
		
		for (GameCharacter gameCharacter : players) 
		{
			gameCharacter.printInfo();
			gameCharacter.attack();
			if(gameCharacter instanceof Novice)
			{
				// Worrior ���� instanceof Novice ���ǿ� �����ϴ� �����̱� ����
				if(gameCharacter instanceof Worrior)
				{
					((Worrior) gameCharacter).punch();
				}
				((Novice) gameCharacter).sleep();
			}
			else if(gameCharacter instanceof Magician)
			{
				((Magician) gameCharacter).magicArrow();
			}
		}
		
		
		
	}
}
