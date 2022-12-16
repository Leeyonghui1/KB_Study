package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		if(count < 1 || count > 5)
		{
			System.out.println(count+"회차 출력은 불가");
			s.close();
			return;
		}
		
		for(int i = 0 ; i < count ; i++)
		{
			ArrayList<Integer> numbers = new ArrayList<Integer>();
			for(int j = 0 ; j < 6 ; j++)
			{
				int num = (int)(Math.random()*45)+1;
				boolean isDuplicate = false;
				for(int k = 0 ; k < j ; k++)
				{
					if(numbers.get(k) == num)
					{	
						isDuplicate = true;
						j--;
						break;
					}
				}
				if(!isDuplicate)
					numbers.add(num);
			}
			int bns = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < numbers.size() ; j++)
			{
				if(bns == numbers.get(j))
				{
					bns = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			Collections.sort(numbers);
			System.out.print((i+1) + "회차 번호 ");
			System.out.print(numbers);
			System.out.println(" 보너스 번호 : " + bns);
		}
		
		s.close();
	}

}
