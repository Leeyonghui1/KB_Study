#include<stdio.h>
#include <stdlib.h>
#include <time.h>
void win()
{
	int n,n1,n2,n3,n4,n5,n6,nB;
	scanf_s("%d", &n);
	printf("%2dȸ�� �ζ� ��÷ ��ȣ", n);
	printf("\n-----------------------\n");
	scanf_s("%d %d %d %d %d %d %d", &n1, &n2, &n3, &n4, &n5, &n6, &nB);
	printf("���ʽ� ��ȣ : %d", nB);
	printf("\n-----------------------\n");
}

int main()
{
	int lotto[6];
	srand(time(NULL));
	//win();

    printf("���� ���� �ζǹ�ȣ : \n");
	printf("\n************************\n");

	while (1)
	{

		for (int i = 0; i < 6; i++)
		{   // �ζǹ�ȣ ��������
			lotto[i] = (rand() % 45) + 1;
			// �ߺ�����
			for (int j = 0; j <= i - 1; j++)
			{
				if (lotto[i] == lotto[j])
				{
					i--;
					break;
				}
			
			}
		}

		// ���ڸ����� 1��
		for (int i = 0; i < 6; i++)
		{
			while (lotto[i] - 10 < 0)
			{
				lotto[i] = (rand() % 45) + 1;
				break;
			}
		}

		// ��������(������������)
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

		// �ζǹ�ȣ ���
		for (int i = 0; i < 6; i++)       
		{
			printf("%3d", lotto[i]);
		}
		
		
		// ¦�� 4�� or Ȧ�� 4��

		system("pause");
	}
}

