#include<stdio.h>

void printArr(int arr[], int size)
{
	printf("\n");
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}

//2번 . 
double average(int ages[], int size)
{
	int sum = 0;
	for (int i = 0; i < size; i++)
		sum += ages[i];
	// 소수점을 구해야 하므로 둘 중 하나 혹은 둘 다 실수로 형(타입)변환해줘야 함
	return sum / (double)size;   
}

//4번. 
int* myages()
{
	static int ages[3];   // static안쓰면 함수 종료시 사라지기 때문에 main에서 받아들이지 못함
	for (int i = 0; i < 3; i++)
	{
		printf("학생의 나이 입력");
		scanf_s("%d", &ages[i]);
	}
	return ages;
}

int main()
{
	//1번 . 교실 학생들의 나이를 입력받는 배열 만들기
	int ages[3];
	for (int i = 0; i < 3; i++)
	{
		printf("학생의 나이 입력");
		scanf_s("%d", &ages[i]);
	}
	// 3번 .
	printf("평균 나이 = %.2f\n",average(ages,3));


	//4번.
	int* values = myages();
	for (int i = 0; i < 3; i++)
		printf("%d\n", values[i]);

	//5번.
	printArr(values, 3);

	
	return 0;
}