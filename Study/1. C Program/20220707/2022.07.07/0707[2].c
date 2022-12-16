#include<stdio.h>
int main()
{
	//1. 구구단 2단~9단 값 2차원배열
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
	
	//2. 구구단 10~19단 2차원배열
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

	//3. 1번에서 만든 배열 총합
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

	//4. 2번에서 만든 배열 총합
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

	//5. 3,4번 결과를 더하세요
	/*
	int multi1[8][9] = { NULL };
	int multi2[10][9] = { NULL };
	//int sum1, sum2, all  = 0; 여러변수 한번에 지정할수는없는가 ?
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

	// 6,7번
	/*
	int multi1[8][9] = { NULL };
	int multi2[10][9] = { NULL };
	for (int i = 0; i < 8; i++)
	{
		for (int j = 0; j < 9; j++)
		{
			multi1[i][j] = (2 + i) * (1 + j);
			printf("%3d ", multi1[i][j]); //%3 -> 3칸 띄어쓰기
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