#include<stdio.h>
void increaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
	{
		numbers[i] += n;
	}
	printf("numbers[] = ");
	for (int i = 0; i < size; i++)
	{
		printf(" %3d ", numbers[i]);
	}
	printf("\n");
} 

void printNum(int numbers[],int size)
{
	printf("numbers[] = ");
	for (int i = 0; i < size; i++)
	{
		printf(" %3d ", numbers[i]);
	}
	printf("\n");
}

void decreaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
	{
		numbers[i] -= n;
	}
	printf("numbers[] = ");
	for (int i = 0; i < size; i++)
	{
		printf(" %3d ", numbers[i]);
	}
	printf("\n");
}

void returnNum(int numbers[], int size, int n)
{
	if (n < 0)
		return;
	else
	{
		for (int i = 0; i < size; i++)
		{
			numbers[i] -= n;
			if (numbers[i] < 0)
				return;
		}
	    printf("numbers[] = ");
		for (int i = 0; i < size; i++)
		{
			printf(" %3d ", numbers[i]);
		}
		printf("\n");
	}
}


int main()
{
	int numbers[1024];
	int n;
	printf("�迭 ������ :");
	scanf_s("%d", &n);
	printf("�� �Է� : \n");
	for (int i = 0; i < n; i++)
	{
		scanf_s("%d", &numbers[i]);
	}
	printf("numbers[] = ");
	for (int i = 0; i < n; i++)
	{
		printf(" %3d ", numbers[i]);
	}
	
	printf("\nQ1) increaseNum �Լ� ȣ��\n");
	increaseNum(numbers, n,100);
	
	printf("Q2) �迭 �� ��� ����ϴ� �Լ� ȣ��\n");
	printNum(numbers,n);
	
	printf("Q3) decreaseNum �Լ� ȣ��\n");
	decreaseNum(numbers, n,100);

	printf("Q4\n");
	int decrease;
	printf("���ҽ�ų �� : ");
	scanf_s("%d", &decrease);
	returnNum(numbers, n,decrease);
	
	return 0;
}