package test4;

import java.util.ArrayList;
import java.util.Scanner;

public class T4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("총 캐릭 수 입력");
		int num1 = s.nextInt();
		GameCharacter[] G = new GameCharacter[num1];
		for(int i = 0 ; i < G.length ; i++)
		{
			s.nextLine();
			G[i] = new GameCharacter();
			System.out.println((i+1)+"번 캐릭 정보 입력");
			G[i].setId(s.nextLine());
			G[i].set_Class(s.nextLine());
			G[i].setLevel(s.nextInt());
			while(G[i].getLevel() < 0)
			{
				System.out.println("레벨 다시 입력");
				G[i].setLevel(s.nextInt());
			}
		}
		for(int i = 0 ; i < G.length ; i++)
		{
			System.out.println(G[i].getId());
			System.out.println(G[i].get_Class());
			G[i].attack();
			System.out.println(G[i].getLevel());
			GameCharacter.sayHello();
		}
		
		System.out.println("============");
		System.out.println("총 캐릭 수 입력");
		int num2 = s.nextInt();
		ArrayList<GameCharacter> G2 = new ArrayList<GameCharacter>();
		for(int i = 0 ; i < num2 ; i++)
		{
			s.nextLine();
			GameCharacter g = new GameCharacter();
			System.out.println((i+1)+"번 캐릭 정보 입력");
			g.setId(s.nextLine());
			g.set_Class(s.nextLine());
			g.setLevel(s.nextInt());
			while(g.getLevel() < 0)
			{
				System.out.println("레벨 다시 입력");
				g.setLevel(s.nextInt());
			}
			G2.add(g);
		}
		for(int i = 0 ; i < G2.size() ; i++)
		{
			System.out.println(G2.get(i).getId());
			System.out.println(G2.get(i).get_Class());
			G2.get(i).attack();
			System.out.println(G2.get(i).getLevel());
			GameCharacter.sayHello();
		}
		s.close();
	}
}
