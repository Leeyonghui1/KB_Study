package practice2;

import java.util.ArrayList;

import test1.Magician;
import test1.Novice;
import test1_1.GameCharacter;

public class P1 {

	public static void main(String[] args) {
		// 다형성
		// 조상클래스(왼쪽) = 자식클래스(오른쪽)
		GameCharacter g = new Novice();
		g.setId("Lee");
		// Novice n = new GameCharacter();  :: 오류
		
		// 다형성의 활용
		// 조상클래스로 하나의 ArrayList를 만들고 나서
		// 조상클래스를 상속받은 모든 클래스를 하나의 배열(or 리스트)에 집어넣을 수 있음
		ArrayList<GameCharacter> players = new ArrayList<GameCharacter>();
		players.add(new Novice());
		players.add(new Magician());
		players.add(new GameCharacter());
		
		GameCharacter gg = new Magician();
		gg.set_Class("대마법사");
		gg.setId("djlee");
		gg.setLevel(250);
		// gg는 Magician으로 instance를 만들었다
		// 하지만, 타입은 GameCharacter
		// gg를 Magician 타입으로 활용하기 위해서 타입변환이 필요하다
		((Magician)gg).setMp(0);
		gg.attack();
		gg.printInfo();
		((Magician)gg).magicArrow();
		
		// 마음대로 타입변환 불가능
		// 그래서 타입변환할 때는 조건문 체크 필요
		if(gg instanceof Novice)
		{
			((Novice)gg).setHp(100);
			((Novice)gg).sleep();
		}
		
	}
}
