#include<stdio.h>

void printArr(int arr[], int size)
{
	printf("\n");
	for (int i = 0; i < size; i++)
		printf("%d\t", arr[i]);
	printf("\n");
}

//2�� . 
double average(int ages[], int size)
{
	int sum = 0;
	for (int i = 0; i < size; i++)
		sum += ages[i];
	// �Ҽ����� ���ؾ� �ϹǷ� �� �� �ϳ� Ȥ�� �� �� �Ǽ��� ��(Ÿ��)��ȯ����� ��
	return sum / (double)size;   
}

//4��. 
int* myages()
{
	static int ages[3];   // static�Ⱦ��� �Լ� ����� ������� ������ main���� �޾Ƶ����� ����
	for (int i = 0; i < 3; i++)
	{
		printf("�л��� ���� �Է�");
		scanf_s("%d", &ages[i]);
	}
	return ages;
}

int main()
{
	//1�� . ���� �л����� ���̸� �Է¹޴� �迭 �����
	int ages[3];
	for (int i = 0; i < 3; i++)
	{
		printf("�л��� ���� �Է�");
		scanf_s("%d", &ages[i]);
	}
	// 3�� .
	printf("��� ���� = %.2f\n",average(ages,3));


	//4��.
	int* values = myages();
	for (int i = 0; i < 3; i++)
		printf("%d\n", values[i]);

	//5��.
	printArr(values, 3);

	
	return 0;
}