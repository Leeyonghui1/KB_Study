#include<stdio.h>
int gugu1()
{
	int sum = 0;
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
			sum += (i * j);
		}
	}
	return sum;
}

void gugu2(int a)
{
	for (int j = 1; j <= 9; j++)
	{
		printf("%d x %d = %d\n", a, j, a * j);
	}
}

void gugu3(int a,int b)
{
	for (int i = 2; i <= 9; i++)
	{
		printf("%3d��\n", i);
		for (int j = a; j <= b; j++)
		{
			printf("%d * %d = %d\n", i, j, i * j);
		}
	}
}

int gugu4(int a, int b)
{
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		for (int j = 1; j < 10; j++)
		{
			printf("%d * %d = %d\n", i, j, i * j);
			sum += i * j;
		}
	}
	return sum;
}

int main()
{
	
	// 1.
	printf(" sum = %d\n", gugu1());

	// 2.
	int a;
	printf("���ϴ� Ư�� �ܼ� = ");
	scanf_s("%d", &a);
	gugu2(a);
	
	// 3.
	int c, d;
	printf("x�� ���� x�� ���� = ");
	scanf_s("%d %d", &c, &d);
	gugu3(c,d);

	// 4.
	int e, f;
	printf("���� �� �� =");
	scanf_s("%d", &e);
	printf("���� �� �� =");
	scanf_s("%d", &f);

	printf(" sum = %d\n", gugu4(e,f));

	return 0;
}