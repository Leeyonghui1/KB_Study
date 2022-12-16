package practice2;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		Bulbasaur b = new Bulbasaur();
		Bulbasaur i = new Ivysaur();
		Venusaur v = new Venusaur();
		
		// 인터페이스 이용해서도 익명클래스 생성 가능
		Animalable p = new Animalable() {
			public void Run() {
				System.out.println("빠르게 뛰기");
			}
			public void Move() {
				System.out.println("종종걸음");
			}
			public void Charming() {
				System.out.println("삐까삐까");
			}
		};
		
		ArrayList<Animalable> pokemons = new ArrayList<Animalable>();
		pokemons.add(b);
		pokemons.add(i);
		pokemons.add(v);
		pokemons.add(p);
		
		Venusaur megaVenu = new Venusaur() {
			@Override
			public void Grow() {
				System.out.println("꽃모양 나무가 자란다.");
			}
			@Override
			public void Charming() {
				System.out.println("(우렁차게)이상해~~~꽃!!");
			}
		};
		pokemons.add(megaVenu);
		
		for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
		
	}
}
