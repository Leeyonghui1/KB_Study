#include<stdio.h>
int main()
{
	//1. ������ 2��~9�� �� 2�����迭
	/*
	int multi1[8][9] = { NULL };
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi1[i][j] = (2 + i) * (1 + j);
			printf("%d\n", multi1[i][j]);
		}
	}
	*/
	
	//2. ������ 10~19�� 2�����迭
	/*
	int multi2[10][9] = { NULL };
	for (int i = 0; i < 10; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi2[i][j] = (10 + i) * (1 + j);
			printf("%d\n", multi2[i][j]);
		}
	}
	*/

	//3. 1������ ���� �迭 ����
	/*
	int multi1[8][9] = { NULL };
	int sum = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi1[i][j] = (2 + i) * (1 + j);
			//printf("%d\n", multi1[i][j]);
			sum += multi1[i][j];
		}
	}
	printf("%d\n", sum);  //1980
	*/

	//4. 2������ ���� �迭 ����
	/*
	int multi2[10][9] = { NULL };
	int sum = 0;
	for (int i = 0; i < 10; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi2[i][j] = (10 + i) * (1 + j);
			//printf("%d\n", multi2[i][j]);
			sum += multi2[i][j];
		}
	}
	printf("%d\n", sum); //6525
	*/

	//5. 3,4�� ����� ���ϼ���
	/*
	int multi1[8][9] = { NULL };
	int multi2[10][9] = { NULL };
	//int sum1, sum2, all  = 0; �������� �ѹ��� �����Ҽ��¾��°� ?
	int sum1 = 0;
	int sum2 = 0;
	int all = 0;
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi1[i][j] = (2 + i) * (1 + j);
			sum1 += multi1[i][j];
		}
	}
	for (int k = 0; k < 10; k++)
	{
		for (int l = 0; l < 9; l++)
		{
			multi2[k][l] = (10 + k) * (1 + l);
			sum2 += multi2[k][l];
		}
	}
	all = sum1 + sum2;
	printf("%d\n", all); //8505
	*/

	// 6,7��
	/*
	int multi1[8][9] = { NULL };
	int multi2[10][9] = { NULL };
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi1[i][j] = (2 + i) * (1 + j);
			printf("%3d ", multi1[i][j]); //%3 -> 3ĭ ����
		}   printf("\n");
	}
	for (int k = 0; k < 10; k++)
	{
		for (int l = 0; l < 9; l++)
		{
			multi2[k][l] = (10 + k) * (1 + l);
			printf("%3d ", multi2[k][l]);
		}   printf("\n");
	}
	*/

    int multi[18][9];
	for (int i = 0; i < 18; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi[i][j] = (2 + i) * (1 + j);
			printf("%3d", multi[i][j]);
		}   printf("\n");
	}

	return 0;

}