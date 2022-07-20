#include<stdio.h>
#include <stdlib.h>
#include <time.h>
void win()
{
	int n,n1,n2,n3,n4,n5,n6,nB;
	scanf_s("%d", &n);
	printf("%2d회차 로또 당첨 번호", n);
	printf("\n-----------------------\n");
	scanf_s("%d %d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6, &nB);
	printf("보너스 번호 : %d", nB);
	printf("\n-----------------------\n");
}

int main()
{
	int lotto[6];
	srand(time(NULL));
	//win();

    printf("나의 생성 로또번호 : \n");
	printf("\n************************\n");

	while (1)
	{

		for (int i = 0; i < 6; i++)
		{   // 로또번호 랜덤생성
			lotto[i] = (rand() % 45) + 1;
			// 중복제거
			for (int j = 0; j <= i - 1; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			
			}
		}

		// 한자릿수는 1개
		for (int i = 0; i < 6; i++)
		{
			while (lotto[i] - 10 < 0)
			{
				lotto[i] = (rand() % 45) + 1;
				break;
			}
		}

		// 버블정렬(오름차순정렬)
		for (int k = 0; k < 6; k++)
		{
			for (int i = 0; i < 5; i++)
			{
				if (lotto[i] > lotto[i + 1])
				{
					int tmp = lotto[i];
					lotto[i] = lotto[i + 1];
					lotto[i + 1] = tmp;
				}
			}
		}

		// 로또번호 출력
		for (int i = 0; i < 6; i++)       
		{
			printf("%3d", lotto[i]);
		}
		
		
		// 짝수 4개 or 홀수 4개

		system("pause");
	}
}

