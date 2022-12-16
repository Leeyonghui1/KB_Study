package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Food f1 = new Sushi();
		f1.setName("연어초밥");
		f1.setPrice(15000);
		
		Food f2 = new EmoKase();
		f2.setName("간고등어구이");
		f2.setPrice(13000);

		ArrayList<Food> foodlist = new ArrayList<Food>();
		foodlist.add(f1);
		foodlist.add(f2);
		
		while(foodlist.size() != 5)
		{
			System.out.println("음식명입력");
			String n = s.nextLine();
			System.out.println("가격은?");
			int p = s.nextInt();
			s.nextLine();
			
			if(n.contains("초밥"))
			{
				foodlist.add(new Sushi());
				foodlist.get(foodlist.size()-1).setName(n);
				foodlist.get(foodlist.size()-1).setPrice(p);
			}
			else if(n.contains("고급"))
			{
				foodlist.add(new EmoKase());
				foodlist.get(foodlist.size()-1).setName(n);
				foodlist.get(foodlist.size()-1).setPrice(p);
			}
			else
			{
				foodlist.add(new Food());
				foodlist.get(foodlist.size()-1).setName(n);
				foodlist.get(foodlist.size()-1).setPrice(p);
			}
		}
		
		for (Food food : foodlist) {			
			if(food instanceof Sushi)
			{
				((Sushi)food).eat();
				((Sushi)food).wasabiBrand();
			}
			else if(food instanceof EmoKase)
			{
				((EmoKase)food).eat();;
				((EmoKase)food).sayEmo();
				System.out.println("아래 문장은 choiceMenu함수호출");
				System.out.println("나는"+((EmoKase)food).choiceMenu());
			}
			else
				food.eat();
		}
		s.close();
	}

}
