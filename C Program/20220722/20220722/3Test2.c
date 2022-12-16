#include<stdio.h>
#include<stdlib.h>

int size;
int* num;
int min_index = 0;

void makeArr()
{
	printf("�迭�� ũ�� ����\n");
	scanf_s("%d", &size);
	num = (int*)malloc(size*sizeof(int));
	for (int i = 0; i < size; i++)
	{
		int n;
		printf("���� �Է��ϼ���");
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
	printf("\n�ִ밪 : %3d �ε��� = %3d\n", max, max_index);
	printf("\n�ּҰ� : %3d ", min);
	return min_index;
}

int main()
{
	makeArr();

	int min = findMaxMin(num, size);
	printf("�ε��� = %3d\n",min_index);
	
	free(num);
	return 0;
}