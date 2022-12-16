package test2;

import java.util.ArrayList;
import java.util.Scanner;

import test1_1.GameCharacter;

public class T2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
		
		players.add(new GameCharacter());
		players.add(new Magician());
		players.add(new Novice());
		players.add(new Worrior());
		
		for(int i = 0 ; i < players.size() ; i++)
		{
			System.out.println("id�Է�");
			String id = s.nextLine();
			players.get(i).setId(id);
			System.out.println("����");
			String _class = s.nextLine();
			players.get(i).set_Class(_class);
			System.out.println("�����Է�");
			int level = s.nextInt();
			players.get(i).setLevel(level);
			if(players.get(i) instanceof Magician)
			{
				System.out.println("mp�Է�");
				int mp = s.nextInt();
				((Magician)players.get(i)).setMp(mp);
				s.nextLine();
			}
			else if(players.get(i) instanceof Novice)
			{
				if(players.get(i) instanceof Worrior)
				{
					System.out.println("power�Է�");
					int power = s.nextInt();
					((Worrior)players.get(i)).setPower(power);
					s.nextLine();
				}
				else
				{
					System.out.println("hp�Է�");
					int hp = s.nextInt();
					((Novice)players.get(i)).setHp(hp);
					s.nextLine();					
				}
			}
			/*
			else if(players.get(i) instanceof Worrior)
			{
				System.out.println("power�Է�");
				int power = s.nextInt();
				((Worrior)players.get(i)).setPower(power);
				s.nextLine();
			}
			*/
			else
				s.nextLine();
		}
		for (GameCharacter gameCharacter : players) {
			if(gameCharacter instanceof GameCharacter)
			{
				gameCharacter.attack();
				gameCharacter.printInfo();
			}
			else if(gameCharacter instanceof Magician)
			{
				((Magician)gameCharacter).attack();
				((Magician)gameCharacter).printInfo();
				((Magician)gameCharacter).magicArrow();
			}
			else if(gameCharacter instanceof Novice)
			{
				if(gameCharacter instanceof Worrior)
				{
					((Worrior)gameCharacter).attack();
					((Worrior)gameCharacter).printInfo();
					((Worrior)gameCharacter).sleep();
					((Worrior)gameCharacter).punch();					
				}
				else
				{
					((Novice)gameCharacter).attack();
					((Novice)gameCharacter).printInfo();
					((Novice)gameCharacter).sleep();					
				}
			}
			else
				continue;
		}
		s.close();
	}
}
