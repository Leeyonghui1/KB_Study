package practice2;

import java.util.ArrayList;

public class P1 {

	public static void main(String[] args) {
		Bulbasaur b = new Bulbasaur();
		Bulbasaur i = new Ivysaur();
		Venusaur v = new Venusaur();
		
		// �������̽� �̿��ؼ��� �͸�Ŭ���� ���� ����
		Animalable p = new Animalable() {
			public void Run() {
				System.out.println("������ �ٱ�");
			}
			public void Move() {
				System.out.println("��������");
			}
			public void Charming() {
				System.out.println("�߱�߱�");
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
				System.out.println("�ɸ�� ������ �ڶ���.");
			}
			@Override
			public void Charming() {
				System.out.println("(�췷����)�̻���~~~��!!");
			}
		};
		pokemons.add(megaVenu);
		
		for (Animalable animalable : pokemons) {
			animalable.Charming();
		}
		
	}
}
