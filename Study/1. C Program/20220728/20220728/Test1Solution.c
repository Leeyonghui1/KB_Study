#include<stdio.h>

void increaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] += n;
}

// 2�� . �迭 ���
void printArr(int arr[], int size)
{
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}

// 3��. decrease�Լ�
void decreaseNum(int numbers[], int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] -= n;
}

// 4��
void decreaseNum_Q4(int numbers[], int size, int n)
{
	if (n < 0)
		return;  // �Լ��� void�����̶� return;�� �Ἥ ���α׷� ����

	for (int i = 0; i < size; i++)
	{
		int num = numbers[i];
		num -= n;
		if (num < 0)  // n�� ���� �� �������? �������
			return;
	}
}


int main()
{
	int ages[5] = { 23, 25, 30, 29, 50 };
	int ages2[3] = { 10,20,30 };

	int ages3[3];
	ages3[0] = 20;
	ages3[1] = 30;
	ages3[2] = 40;

	for (int i = 0; i < 5; i++)
	{
		printf("%d\n", ages[i]);
		ages[i] = i * i + ages[i];
	}

	printf("---------1��-----------\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);
	increaseNum(ages2, 3, 100);
	printf("---- ��ȭ ��----\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);

	printf("---------2��-----------\n");
	printArr(ages, sizeof(ages) / sizeof(int));

	printf("---------3��-----------\n");
	decreaseNum(ages, sizeof(ages) / sizeof(int), 15);
	printArr(ages, sizeof(ages) / sizeof(int));
	
	printf("---------4��-----------\n");
	ages3[0] = 150;
	ages3[1] = 50;
	ages3[2] = 500;
	decreaseNum_Q4(ages3, 3, 100);
	printArr(ages3, 3);


	return 0;
}