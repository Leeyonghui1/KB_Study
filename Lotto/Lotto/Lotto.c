#include<stdio.h>
#include <stdlib.h>
#include <time.h>

void main()
{
	int num[7];
	srand(time(NULL));
	
	while (1)
    {
			printf("�ζǹ�ȣ : ");
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
				//i++;
			}
		}
						
		for (int i = 1; i < 6; i++)
		{
			if (num[i] % 2 == 0) // num[k] ¦��
			{
					if (num[i + 1] % 2 == 0) //num[k+1] ¦��
						num[i + 1] += 1;
			}
			if (num[i] % 2 != 0) // Ȧ��
			{
					if (num[i + 1] % 2 != 0)
						num[i + 1] += 1;
			}
		}


			for (int k = 0; k < 6; k++) {
				for (int i = 0; i < 5; i++) {
					if (num	[i] > num[i + 1]) {
						int tmp = num[i];
						num[i] = num[i + 1];
						num[i + 1] = tmp;
					}
				}
			}
	
		for (int i = 0; i < 6; i++)       //6��° Ȧ -> ���ʽ���ȣ ¦��
		{
			printf("%3d", num[i]);
		}
		
			if (num[5] % 2 != 0)
			{
				if (num[6] % 2 != 0)
					num[6]++;
				if (num[6] < 0)
					num[6] = 1;
				if (num[6] > 45)
					num[6] = 45;
				printf(" ���ʽ� : %d", num[6]);
			}
			else
			{
				printf(" ���ʽ� : %d", num[6]);
			}
		system("pause");
 	}

		
	
	//return 0;
}

