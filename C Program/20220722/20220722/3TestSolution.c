#include<stdio.h>
#include<stdlib.h>
#define MAX 1024 // ��ũ�� ��� : ���ؿ������� ���� ó���Ǳ� ������ �̰��� �̿��ؼ� �迭ũ�� ���ϴ°� ����

//����]�迭 �ȿ� ���ڸ� �ְ� �ű⼭ ���� ū ��, �׸��� �� ū ���� �ε��� ���(main�� Ǯ��)
int main()
{
	int numbers[5];
	// int mynumbers[MAX];  // ��ũ�λ���� �̿��� �迭ũ�� ����
	/*
	int num = 5;
	int numbers2[num]; 
	 * ������ �迭ũ�� ������ �� ����. �׷��� �����迭(malloc, calloc)�� ����Ѵ�.
	 * �ֳ�? ���� num, �迭 numbers2 ��� ���ÿ����� �����Ѵ�
	   ������ ������ �켱������ �Ҵ��ϴ��� ��Ȯ������ �ʾƼ� 'numbers2[num];'�� ó������ ���Ѵ�.
	 * �׷��� �迭�� �ٸ������� �Ҵ��ؾ��ϴµ� �� ���� ��(Heep)�����̸� �ű⿡ �����Ҵ��� �Ѵ�.
	*/

	int size = sizeof(numbers) / sizeof(int);
	for (int i = 0; i < size; i++)
	{
		printf("%d��° ���� �Է�", i);
		scanf_s("%d", &numbers[i]);
	}
	int max = numbers[0]; // ù��° ���ڸ� ���� ũ�ٰ� ����
	int max_index = 0;
	for (int i = 0; i < size; i++)
	{
		if (max < numbers[i])
		{
			max = numbers[i];
			max_index = i;
		}
	}
	printf("�ִ��� [%d]�� �ֽ��ϴ�.\n", max_index);




	return 0;
}