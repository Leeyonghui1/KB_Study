package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T2Solution {

	public static void main(String[] args) {
		// ArrayList 활용한 로또
		// 대신 배열 스타일로 코드 작성
		Scanner s = new Scanner(System.in);
		System.out.println("얼마너치 살건가요?");
		int count = s.nextInt()/1000;
		if(count > 5 || count < 1)
		{
			System.out.println("금액이 잘못되었습니다.");
			s.close();
			return;
		}
		
		for(int i = 0 ; i < count ; i++)
		{
			ArrayList<Integer> lotto = new ArrayList<Integer>();
			for(int j = 0 ; j < 6 ; j++)
			{
				int num = (int)(Math.random()*45)+1;
				boolean isDuplicate = false;
				for(int k = 0 ; k < j ; k++)
				{
					if(lotto.get(k) == num)
					{
						isDuplicate = true;
						j--;
						break;
					}
				}
				
				if(!isDuplicate)
					lotto.add(num);
			}
			int bns = (int)(Math.random()*45)+1;
			for(int j = 0 ; j < lotto.size() ; j++)
			{
				if(bns == lotto.get(j))
				{
					bns = (int)(Math.random()*45)+1;
					j = -1;
				}
			}
			Collections.sort(lotto);
			System.out.print(lotto.toString());
			System.out.println(" 보너스 : " + bns);
			lotto.clear(); // lotto 안에 있는 값을 전부 삭제(=Remove)
		}
		s.close();
	}

}
