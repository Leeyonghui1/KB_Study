#include<stdio.h>
void gugu()
{
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}
}

void gugudan()
{
	printf("몇 단부터 몇 단?");
	int dan_s, dan_e;
	scanf_s("%d %d", &dan_s, &dan_e);
	printf("x몇 부터 x몇 까지?");
	int x_s, x_e;
	scanf_s("%d %d", &x_s, &x_e);
	for (int i = dan_s; i <= dan_e; i++)
	{
		for (int j = x_s; j <= x_e; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}


}
int main()
{
	// 1. 기본적인 구구단(2단부터 9단까지 | x1부터 x9까지)
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}

	// 2. gugu함수 호출
	gugu();

	// 3. gugudan함수 호출
	gugudan();

	return 0;
}