#include<stdio.h>
//�迭�� �Լ��� �Ű������� �ѱ� ���� �迭�� ũ�⵵ ���� �Ѱ���� ��
// �Ű������� int numbers[] ��� �ص� �ǰ� int* numbers��� �ص���(�迭�� �����Ͷ�)
/* �Ű����� 'size'�� �� �ʿ��Ѱ� ?
�迭�� �������̴�. 'numbers[]'�� �迭�� �������� �˷��ְ� ���� �𸥴�. 
�׷��� ��������� �˷��ֱ� ���ؼ� �迭�� ũ���� 'size' �� ���� �Ѱܾ��Ѵ�
*/

void printArr(int numbers[], int size)  // 'numbers[]'�� ������ġ�� �˰� ��������� ���� 'size'���� �ʿ��ϴ�
{
	for (int i = 0; i < size; i++)  
		printf("%d\n", numbers[i]);

}

int arrReturn(int numbers[], int size)
{
	int max, min;
	max = min = numbers[0];

	for (int i = 0; i < size; i++)
	{
		if (numbers[i] > max)
		{
			max = numbers[i];
		}
		if (numbers[i] < min)
		{
			min = numbers[i];
		}
	}
	printf("�ּҰ� = %d\n", min);
	return max;
}

void signChange(int numbers[], int size)
{
	for (int i = 0; i < size; i++)
	{
		numbers[i] = -numbers[i];
		printf("%3d", numbers[i]);
	}
}

int main()
{
	//�迭
	// 1���� ������ ���� ���� ���� ����

	int numbers1[5] = { 5,4,10,-2,1 };
	
	int numbers2[3];
	numbers2[0] = 100;
	numbers2[1] = 200;
	numbers2[2] = -300;

	/*
	for (int i = 0; i < sizeof(numbers1) / sizeof(int); i++) // sizeof(numbers1) : 20byte / sizeof(int) : 4byte  
		printf("%d\n", numbers1[i]);
	*/

	//1. printArr�� ȣ��
	printArr(numbers1, 5);   // 'numbers1'�̸� ��ü�� �迭 ������ ��ġ�� 1���� �����Ѵ�
	
	//2. �迭 ���� �ִ��� ��ȯ�ϰ� �ּڰ��� printf�� ����ϴ� �Լ� ����� ȣ��
	printf("�ִ밪 = %d\n",arrReturn(numbers1, 5));

	//3. �迭 ���� ��ȣ�� ���� ������ �Լ� ����� ȣ��
	signChange(numbers1, 5);

	return 0;

}