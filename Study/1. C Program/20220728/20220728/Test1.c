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
	printf("배열 사이즈 :");
	scanf_s("%d", &n);
	printf("값 입력 : \n");
	for (int i = 0; i < n; i++)
	{
		scanf_s("%d", &numbers[i]);
	}
	printf("numbers[] = ");
	for (int i = 0; i < n; i++)
	{
		printf(" %3d ", numbers[i]);
	}
	
	printf("\nQ1) increaseNum 함수 호출\n");
	increaseNum(numbers, n,100);
	
	printf("Q2) 배열 값 모두 출력하는 함수 호출\n");
	printNum(numbers,n);
	
	printf("Q3) decreaseNum 함수 호출\n");
	decreaseNum(numbers, n,100);

	printf("Q4\n");
	int decrease;
	printf("감소시킬 값 : ");
	scanf_s("%d", &decrease);
	returnNum(numbers, n,decrease);
	
	return 0;
}