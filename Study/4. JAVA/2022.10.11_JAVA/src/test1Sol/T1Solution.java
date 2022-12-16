package test1Sol;

import java.util.ArrayList;
import java.util.List;

public class T1Solution {

	public static void main(String[] args) {
		Pikachu p = new Pikachu("레옹");
		Bulbasaur b = new Bulbasaur();
		Squirtle s = new Squirtle();
		
		Animalable d = new Animalable() {
			@Override
			public void charming() {
				System.out.println("멍멍 짖는다.");
			}
		};
		
		Plantable myp = new Plantable() {
			@Override
			public void grow() {
				System.out.println("LG 틔운기계에서 자라는 내 꽃");
			}
		};
		
		
		Pokemonable g = new Pokemonable() {

			@Override
			public void charming() {
				System.out.println("구워워억");
			}

			@Override
			public void grow() {
				System.out.println("바다속에서 자란다.");
			}

			@Override
			public void fight() {
				 System.out.println("거북거부 손Death");
			}
		};
		
		// ArrayList는 List라는 인터페이스를 상속받은 클래스
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		List<Integer> ns = new ArrayList<Integer>();
		
		
		// try catch 문법 - java,c#에서 자주 사용
		// try로 지정된 부분이 오류가 나면 catch부분으로 넘어가고
		// 프로그램이 종료되진 않는다.
		// try catch 안한상태에서 오류나면 그대로 종료
		try {
			// 얕은 복사 이슈를 해결할 열쇠 - Clonable라는 인터페이스
			Pikachu pipi = (Pikachu)p.clone();
			pipi.setName("노란뚱땡이");
			// p의 이름은 레옹으로 설정
			// 근데 pipi 이름은 노란뚱땡이로 바꾸니 p도 바뀜
			// ->> pipi랑 p랑 똑같은 위치를 참조하기 때문(얕은복사)
			System.out.println(p.getName());
			System.out.println(pipi.getName());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		// Plantable의 grow를 오버라이딩한것
		// 화살표형태로 줄여버린것 :: 람다(lambda)
		// 람다는 하나의 메소드만 존재할때만 가능
		Plantable myFlower = () -> {
			System.out.println("무럭무럭 자나라요");
		};
		myFlower.grow();
	}
}
