#include<stdio.h>
#include <stdlib.h>
#include <time.h>

void main()
{
	int num[7];
	srand(time(NULL));
	
	while (1)
	{
		printf("로또번호 : ");
		for (int i = 0; i < 7; i++)
		{
			num[i] = (rand() % 45) + 1;
			for (int j = 0; j < i - 1; j++)
			{
				if (num[i] == num[j])
				{
					i--;
					break;
				}
			}
		}

		for (int k = 0; k < 6; k++)
		{
			for (int i = 0; i < 5; i++)
			{
				if (num[i] > num[i + 1])
				{
					int tmp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = tmp;
				}
			}
		}

		for (int i = 0; i < 6; i++)       
		{
			printf("%3d", num[i]);
		}
		printf(" 보너스 : %3d", num[6]);


		system("pause");
	}
}

