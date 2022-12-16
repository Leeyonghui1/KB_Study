package test1Sol;

import java.util.ArrayList;
import java.util.Scanner;

public class T1Solution {

	public static void main(String[] args) {
		Food f = new Food("�����");
		Sushi s = new Sushi("�����ʹ�",10000,"����ͻ��");
		// e�� Food ��� Emokase Ÿ������ ���
		// FoodŸ�� ArrayList�� �迭�� �����ִ�
		Food e = new Emokase("��â����",20000);
		
		
		ArrayList<Food> foods = new ArrayList<Food>();
		f.setPrice(1000);
		foods.add(f);
		foods.add(s);
		foods.add(e);
		
		Scanner scan = new Scanner(System.in);
		while(true)
		{
			System.out.println("� ���� �߰��ҷ�?");
			String name = scan.nextLine();
			Food temp;
			if(name.equals("����") || name.equals("Sushi"))
			{
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("���� �ʹ�");
				String Sushiname = scan.nextLine();
				System.out.println("���� �ͻ��?");
				String wasabi = scan.nextLine();
				temp = new Sushi(Sushiname,price,wasabi);
				foods.add(temp);
			}
			else if(name.equals("�̸�ī��") || name.equals("Emokase"))
			{
				System.out.println("�󸶾�?");
				int price = scan.nextInt();
				scan.nextLine();
				System.out.println("�޴����� ����?");
				String menu = scan.nextLine();
				temp = new Emokase(menu,price);
				foods.add(temp);
			}
			else
			{
				if(name.equals("exit"))
				{
					System.out.println("�߰� ����");
					break;
				}
				else
				{
					System.out.println("�󸶾�?");
					int price = scan.nextInt();
					scan.nextLine();
					System.out.println("�޴����� ����?");
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
				//System.out.println("�޴�����?");
				//String menu = scan.nextLine();
				//System.out.println(((Emokase) food).choiceMenu(menu));
			}
		}
		
		
		
		
		
		scan.close();
	}
}
