#include<stdio.h>

void increaseNum(int* numbers, int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] += n;
}

// 2번 . 배열 출력
void printArr(int arr[], int size)
{
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}

// 3번. decrease함수
void decreaseNum(int numbers[], int size, int n)
{
	for (int i = 0; i < size; i++)
		numbers[i] -= n;
}

// 4번
void decreaseNum_Q4(int numbers[], int size, int n)
{
	if (n < 0)
		return;  // 함수가 void형식이라서 return;만 써서 프로그램 종료

	for (int i = 0; i < size; i++)
	{
		int num = numbers[i];
		num -= n;
		if (num < 0)  // n을 뺐는 데 음수라면? 즉시종료
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

	printf("---------1번-----------\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);
	increaseNum(ages2, 3, 100);
	printf("---- 변화 후----\n");
	for (int i = 0; i < 3; i++)
		printf("%d\n", ages2[i]);

	printf("---------2번-----------\n");
	printArr(ages, sizeof(ages) / sizeof(int));

	printf("---------3번-----------\n");
	decreaseNum(ages, sizeof(ages) / sizeof(int), 15);
	printArr(ages, sizeof(ages) / sizeof(int));
	
	printf("---------4번-----------\n");
	ages3[0] = 150;
	ages3[1] = 50;
	ages3[2] = 500;
	decreaseNum_Q4(ages3, 3, 100);
	printArr(ages3, 3);


	return 0;
}