package test1;

import java.util.ArrayList;
import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자 5개 입력하세요.");
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
		System.out.println("기준숫자 입력");
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
