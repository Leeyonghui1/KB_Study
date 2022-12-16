package test2;

import java.util.ArrayList;

import test1_1.GameCharacter;

public class T2Solution {

	public static void main(String[] args) {
		ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
		
		GameCharacter g = new GameCharacter();
		g.set_Class("프로그래머");
		g.setId("조코딩");
		g.setLevel(100);
		players.add(g);
		
		Novice n = new Novice();
		n.set_Class("백수");
		n.setHp(10);
		n.setId("흰손");
		n.setLevel(1);
		players.add(n);
		
		// players는 GameCharacter 타입 ArrayList 이지만
		// 다형성에의해, GameCharacter를 상속한 건 다 들어갈수 있음
		
		GameCharacter m = new Magician();
		m.set_Class("대마법사");
		m.setId("모태솔로이동준");
		m.setLevel(27);
		if(m instanceof Magician)
		{
			Magician temp = (Magician)m;
			temp.setMp(1000);
			// 아래의 1줄 코드는 위 2줄과 동일한 의미의 코드
			// ((Magician)m).setMp(100);
		}
		players.add(m);
		
		players.add(new Worrior());
		players.get(players.size()-1).set_Class("키보드전사");
		players.get(players.size()-1).setId("네이버의논객");
		players.get(players.size()-1).setLevel(7);
		if(players.get(players.size()-1) instanceof Worrior)
		{
			Worrior w = (Worrior)players.get(players.size()-1);
			w.setHp(1200);
			w.setPower(5000);
			// 얕은 복사에 의해서
			// w 는 players 리스트 안에 4번째 값을 가리키고 있다.
			// 그래서 w에서 set하면 players.get(3)의 값이 바뀜
		}
		
		for (GameCharacter gameCharacter : players) 
		{
			gameCharacter.printInfo();
			gameCharacter.attack();
			if(gameCharacter instanceof Novice)
			{
				// Worrior 또한 instanceof Novice 조건에 충족하는 조건이기 때문
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
