#include<stdio.h>
void gugu()
{
	for (int i = 2; i < 10; i++)
	{
		printf("%3d단\n", i);
		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %d\n", i, j, i * j);
		}
	}
}

void gugu_two()
{
	int a, b;
	scanf_s("%d %d", &a, &b);
	printf(" %d단 부터 %d단 까지\n", a, b);
	int c, d;
	scanf_s("%d %d", &c, &d);
	printf(" %d부터 %d까지\n", c, d);
	
	for (int i = a; i <= b; i++)
	{
		printf("%3d단\n", i);
		for (int j = c; j <= d; j++)
		{
			printf("%d * %d = %d\n", i, j, i * j);
		}
	}

}

int main()
{
	
	// 1.
	for (int i = 2; i < 10; i++)
	{
	    printf("%3d단\n", i);
		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %d\n", i, j, i * j);
	    }
	}

	//2.
	gugu();
	
	//3.
	gugu_two();


	return 0;
}