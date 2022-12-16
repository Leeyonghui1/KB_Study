package test1;

import java.util.ArrayList;
import java.util.Scanner;
import test1_1.GameCharacter;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("ĳ�������Է�");
		int count = s.nextInt();
		
		
		ArrayList<GameCharacter> G = new ArrayList<GameCharacter>();
		while(G.size() != count)
		{
			System.out.println("ĳ���� ����?");
			int level = s.nextInt();
			if(level < 0)
				continue;
			System.out.println("ĳ���� ����?");
			s.nextLine();
			String _class = s.nextLine();
			System.out.println("ĳ���� ID?");
			String Id = s.nextLine();
			
			G.add(new GameCharacter(Id, _class));
			G.get(G.size()-1).setLevel(level);
		}
		for (GameCharacter gameCharacter : G) {
			gameCharacter.printInfo();
			gameCharacter.attack();
		}
		
		ArrayList<Magician> M = new ArrayList<Magician>();
		while(M.size() != count)
		{
			System.out.println("ĳ���� ����?");
			int level = s.nextInt();
			if(level < 0)
				continue;
			System.out.println("�� mp��?");
			int mp = s.nextInt();
			s.nextLine();
			System.out.println("ĳ���� ID?");
			String Id = s.nextLine();
			
			M.add(new Magician());
			M.get(M.size()-1).setId(Id);
			M.get(M.size()-1).setMp(mp);
			M.get(M.size()-1).setLevel(level);
		}
		for (Magician magician : M) {
			magician.printInfo();
			magician.magicArrow();
			magician.attack();
		}
		
		ArrayList<Novice> N = new ArrayList<Novice>();
		while(N.size() != count)
		{
			System.out.println("ĳ���� ����?");
			int level = s.nextInt();
			if(level < 0)
				continue;
			System.out.println("�� hp��?");
			int hp = s.nextInt();
			s.nextLine();
			System.out.println("ĳ���� ID?");
			String Id = s.nextLine();
			
			N.add(new Novice());
			N.get(N.size()-1).setId(Id);
			N.get(N.size()-1).setHp(hp);
			N.get(N.size()-1).setLevel(level);
		}
		for (Novice novice : N) {
			novice.printInfo();
			novice.sleep();
			novice.attack();
		}
		
		s.close();
	}
}
