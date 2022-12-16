#include<stdio.h>
void printArr(int numbers[], int size)
{
	/*
	for (int i = 0; i < size; i++)
		printf("%d\n", numbers[i]);
	*/
	// �迭�� �����Ͷ�� ������ �������,�ٸ�ǥ����
	for (int i = 0; i < size; i++)
		printf("%3d", *(numbers+i));

}

// int* numbers �� int numbers[]�� �����ǹ�, �ٸ�ǥ����
int findMax(int* numbers, int size)
{
	int max = numbers[0];
	int min = numbers[0];
	for (int i = 0; i < size; i++)
	{
		if (max < numbers[i])
			max = numbers[i];
		if (min > numbers[i])
			min = numbers[i];
	}
	printf("\n�ּڰ� : %3d\n", min);
	return max;
}

//void reverse_arr(int* numbers, int size)
void reverse_arr(int numbers[], int size)
{
	for (int i = 0; i < size; i++)
	{
		numbers[i] *= -1;
	}
}

int main()
{
	int numbers1[5] = { 5,4,10,-2,1 };
	int numbers2[3] = { 100, 200, -400 };

	//1.
	printArr(numbers1, 5);

	//2.
	int max = findMax(numbers2, sizeof(numbers2) / sizeof(int));
	printf("numbers2�� �ִ� : %3d\n", max);

	//3.
	reverse_arr(numbers1, 5);
	printArr(numbers1, 5);

	return 0;
}