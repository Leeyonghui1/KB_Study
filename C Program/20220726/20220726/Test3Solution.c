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
	printf("�� �ܺ��� �� ��?");
	int dan_s, dan_e;
	scanf_s("%d %d", &dan_s, &dan_e);
	printf("x�� ���� x�� ����?");
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
	// 1. �⺻���� ������(2�ܺ��� 9�ܱ��� | x1���� x9����)
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}

	// 2. gugu�Լ� ȣ��
	gugu();

	// 3. gugudan�Լ� ȣ��
	gugudan();

	return 0;
}