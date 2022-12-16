package test1Sol;

import java.util.ArrayList;
import java.util.Scanner;

public class T1Solution {

	public static void main(String[] args) {
		Food f = new Food("비빔밥");
		Sushi s = new Sushi("연어초밥",10000,"녹색와사비");
		// e는 Food 대시 Emokase 타입으로 적어도
		// Food타입 ArrayList나 배열에 들어갈수있다
		Food e = new Emokase("곱창전골",20000);
		
		
		ArrayList<Food> foods = new ArrayList<Food>();
		f.setPrice(1000);
		foods.add(f);
		foods.add(s);
		foods.add(e);
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("어떤 음식 추가할래?");
			String name = scan.nextLine();
			Food temp;
			if(name.equals("스시") || name.equals("Sushi"))
			{
				System.out.println("얼마야?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("무슨 초밥");
				String Sushiname = scan.nextLine();
				System.out.println("무슨 와사비?");
				String wasabi = scan.nextLine();
				temp = new Sushi(Sushiname,price,wasabi);
				foods.add(temp);
			}
			else if(name.equals("이모카세") || name.equals("Emokase"))
			{
				System.out.println("얼마야?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("메뉴명이 뭐야?");
				String menu = scan.nextLine();
				temp = new Emokase(menu,price);
				foods.add(temp);
			}
			else
			{
				if(name.equals("exit"))
				{
					System.out.println("추가 종료");
					break;
				}
				else
				{
					System.out.println("얼마야?");
					int price = scan.nextInt();
					scan.nextLine();
					System.out.println("메뉴명이 뭐야?");
					String menu = scan.nextLine();
					temp = new Food(menu,price);
					foods.add(temp);					
				}
			}
		}
		
		for (Food food : foods) {
			food.eat();
			if(food instanceof Emokase)
			{
				((Emokase) food).sayEmo();
				//System.out.println("메뉴뭔데?");
				//String menu = scan.nextLine();
				//System.out.println(((Emokase) food).choiceMenu(menu));
			}
		}
		
		
		
		
		
		scan.close();
	}
}
