#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main()
{
	int lotto[7];
	srand(time(NULL));
	
	while (1)
	{
	    printf("로또번호 : ");
		// 로또번호,보너스번호 랜덤생성
		for (int i = 0; i < 7; i++)
		{
			lotto[i] = (rand() % 45) + 1;
			// 로또번호 중복제거
		    for (int j = 0; j < i - 1; j++)
			{
				if (lotto[i] == lotto[j])
				{
				i--;
				break;
			    }				
		    }
		}

		 
		//오름차순 정렬
		for (int k = 0; k < 6; k++)
		{
			for (int i = 0; i < 5; i++)
			{
				if (lotto[i] > lotto[i + 1]);
				{
					int temp = lotto[i];
			    	lotto[i] = lotto[i + 1];
				    lotto[i + 1] = temp;
				}
		    }
	    }
		

		//로또번호 출력
		for (int i = 0; i < 6 ; i++) 
		{
			printf("%3d", lotto[i]);
		}
			printf("  보너스 : %3d", lotto[6]);

	    
		system("pause");
	}
}