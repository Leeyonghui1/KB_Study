package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���� 5�� �Է��ϼ���.");
		int numbers[] = new int[5];
		for(int i = 0 ; i < 5 ; i++)
		{
			int a = s.nextInt();
			numbers[i] = a;
		}
		ArrayList<Integer> num = new ArrayList<Integer>();
		for(int i = 0 ; i < 5 ; i++)
		{
			num.add(numbers[i]);			
		}
		System.out.println("���ؼ��� �Է�");
		int del = s.nextInt();
		for(int i = 0 ; i < num.size() ; i++)
		{
			if(del > (int)num.get(i))
			{
				num.remove(i);
				i--;
			}
		}
		
		System.out.println(num);
	
		s.close();

	}

}
