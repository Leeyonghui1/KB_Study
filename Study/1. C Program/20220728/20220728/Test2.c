#include<stdio.h>
// 2번
float average(int ages[],int size)
{
	float sum = 0;
	for (int i = 0; i < size; i++)
	{
		sum += ages[i];
	}
	float average = sum / size;
	
	return average;
}

int* returnArr()
{
	static int arr[5];
	for (int i = 0; i < 5; i++)
		scanf_s("%d", &arr[i]);

	return arr;
}

void printArr(int arr[], int size)
{
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}


int main()
{

	int ages[1024];
	int n;
	printf("Q1)\n");
	printf("학생 수 :");
	scanf_s("%d", &n);
	printf("나이 : \n");
	for (int i = 0; i < n; i++)
	{
		scanf_s("%d", &ages[i]);
	}
	printf("ages[] = ");
	for (int i = 0; i < n; i++)
	{
		printf(" %3d ", ages[i]);
	}

	printf("\nQ2&3)\n");
	printf(" 평균나이  = %.2f", average(ages, n));

	printf("\nQ4)\n");
	int* num = returnArr();
    printf("리턴받고 출력\n");
	for (int i = 0; i < 5; i++)
	{
		printf("%d\t", num[i]);
	}

	printf("\nQ5)\n");
    printf("printArr함수 이용 출력\n");
	printArr(num, 5);


	return 0;
}