#include<stdio.h>
#include<stdlib.h>

//3. 그 중에서 가장 큰 숫자의 인덱스를 찾아낸다.
// 4. 1~2번을 통해 만든 배열을 매개변수로 하여 가장 작은 숫자의 인덱스를 리턴
int findMaxMin(int* num, int size)
{
	int min = num[0];
	int max = num[0];
	for (int i = 0; i < size; i++)
	{
		if (max < num[i])
			max = num[i];
		if (min > num[i])
			min = num[i];
	}
	printf("\n최대값 : %3d\n", max);
	return min;
}

int main()
{
	//1. 배열을 만드는 데, 배열의 크기를 사용자가 정한다.
	int size;
	printf("배열의 크기 결정\n");
	scanf_s("%d", &size);
	int* num = (int*)calloc(size, sizeof(int));
	//2. 배열의 크기만큼 숫자를 입력한다.
	for (int i = 0; i < size; i++)
	{
		int n;
		scanf_s("%d", &n);
		num[i] = n;
	}

	for (int i = 0; i < size; i++)
	{
		printf(" %3d", num[i]);
	}
	

	int min = findMaxMin(num, size);
	printf("최소값 = %3d\n", min);

	free(num);

	return 0;
}