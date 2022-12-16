package practice2;

import java.util.ArrayList;

import test1.Magician;
import test1.Novice;
import test1_1.GameCharacter;

public class P1 {

	public static void main(String[] args) {
		// ������
		// ����Ŭ����(����) = �ڽ�Ŭ����(������)
		GameCharacter g = new Novice();
		g.setId("Lee");
		// Novice n = new GameCharacter();  :: ����
		
		// �������� Ȱ��
		// ����Ŭ������ �ϳ��� ArrayList�� ����� ����
		// ����Ŭ������ ��ӹ��� ��� Ŭ������ �ϳ��� �迭(or ����Ʈ)�� ������� �� ����
		ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		
		GameCharacter gg = new Magician();
		gg.set_Class("�븶����");
		gg.setId("djlee");
		gg.setLevel(250);
		// gg�� Magician���� instance�� �������
		// ������, Ÿ���� GameCharacter
		// gg�� Magician Ÿ������ Ȱ���ϱ� ���ؼ� Ÿ�Ժ�ȯ�� �ʿ��ϴ�
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		// ������� Ÿ�Ժ�ȯ �Ұ���
		// �׷��� Ÿ�Ժ�ȯ�� ���� ���ǹ� üũ �ʿ�
		if(gg instanceof Novice)
		{
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
		}
		
	}
}
