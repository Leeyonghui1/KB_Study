#include<stdio.h>
#include<stdlib.h>

int size;
int* num;
int min_index = 0;

void makeArr()
{
	printf("배열의 크기 결정\n");
	scanf_s("%d", &size);
	num = (int*)malloc(size*sizeof(int));
	for (int i = 0; i < size; i++)
	{
		int n;
		printf("숫자 입력하세요");
		scanf_s("%d", &n);
		num[i] = n;
	}

	for (int i = 0; i < size; i++)
	{
		printf(" %3d", num[i]);
	}
}

int findMaxMin(int* num, int size)
{
	int min = num[0];
	int max = num[0];
	int max_index =0;
	for (int i = 0; i < size; i++)
	{
		if (max < num[i])
		{
			max = num[i];
			max_index = i;
		}
		if (min > num[i])
		{
			min = num[i];
			min_index = i;
		}
	}
	printf("\n최대값 : %3d 인덱스 = %3d\n", max, max_index);
	printf("\n최소값 : %3d ", min);
	return min_index;
}

int main()
{
	makeArr();

	int min = findMaxMin(num, size);
	printf("인덱스 = %3d\n",min_index);
	
	free(num);
	return 0;
}