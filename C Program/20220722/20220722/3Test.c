#include<stdio.h>
#include<stdlib.h>

//3. �� �߿��� ���� ū ������ �ε����� ã�Ƴ���.
// 4. 1~2���� ���� ���� �迭�� �Ű������� �Ͽ� ���� ���� ������ �ε����� ����
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
	printf("\n�ִ밪 : %3d\n", max);
	return min;
}

int main()
{
	//1. �迭�� ����� ��, �迭�� ũ�⸦ ����ڰ� ���Ѵ�.
	int size;
	printf("�迭�� ũ�� ����\n");
	scanf_s("%d", &size);
	int* num = (int*)calloc(size, sizeof(int));
	//2. �迭�� ũ�⸸ŭ ���ڸ� �Է��Ѵ�.
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
	printf("�ּҰ� = %3d\n", min);

	free(num);

	return 0;
}