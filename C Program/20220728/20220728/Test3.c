#include<stdio.h>
int main()
{
	// 5�� , ���� 3�� ���ǽ� , ���ǽǺ� �л�
	// 1��.
	int students[5][3] = {
		{10,20,30},
		{12,14,16},
		{13,16,19},
		{14,18,22},
		{15,20,25}
	};
	// 2��.
	for (int i = 0; i < 5; i++)
	{
		printf("\n");
		for (int j = 0; j < 3; j++)
			printf("%d\t", students[i][j]);
		printf("\n");
	}


	// 3��.
	int floor;
	printf("�� �� : ");
	scanf_s("%d", &floor);
	int room;
	printf("���ǽ� ���� : ");
	scanf_s("%d", &room);

	for (int i = 0; i < floor; i++)
	{
		for (int j = 0; j < room; j++)
			scanf_s("%d", &students[i][j]);
	}
	for (int i = 0; i < floor; i++)
	{
		printf("\n");
		for (int j = 0; j < room; j++)
			printf("%d\t", students[i][j]);
		printf("\n");
	}


	return 0;
}