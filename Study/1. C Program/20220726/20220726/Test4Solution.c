#include<stdio.h>

//void��� return; ���ų� ��������
// int, double, char ���̶�� �ݵ�� return �������
int gugudan_sum()
{
	int sum = 0;
	for (int i = 2; i <= 9; i++)
	{
		for (int j = 1; j <= 9; j++)
			sum += (i * j);
	}
	return sum;
}

void q2_dan_print(int dan)
{
	for (int i = 1; i <= 9; i++)
		printf("%d x %d = %d\n", dan, i, dan * i);
}

void swap(int* s, int* e)
{
	int temp = *s;
	*s = *e;
	*e = temp;
}

void q3_gugu_gob(int s, int e) // ���
{
	// �Է¼����� 1,4 ���� ���������� �ƴ϶� 4,1 ���� ������������ �Էµȴٸ�
	// 1. �� �ȿ��� ���ǹ��Ἥ �ٲ۴�
	// 2. swap�Լ� ���� �ٲ۴�.
	/* 1�� 
	if (s > e)
	{
		int temp = s;
		s = e;
		e = temp;
	}
	*/
	/* 2�� 
	if (s > e)
		swap(&s, &e);
	*/

	for (int i = 2; i <= 9; i++)
	{
		for (int j = s; j <= e; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
		}
	}
}

int q4_gugudan_sum(int s, int e)
{
	int sum = 0;
	for (int i = s; i <= e; i++)
	{
		for (int j = 1; j <= 9; j++)
		{
			printf("%d x %d = %d\n", i, j, i * j);
			sum += (i * j);
		}
	}
	return sum;
}

int main()
{
	//1.
	printf("q1 : %d\n", gugudan_sum());
	
	//2.
	int dan;
	scanf_s("%d", &dan);
	printf("q2\n");
	q2_dan_print(dan);

	//3.
	printf("q3 : x����� x����� �ұ��?\n");
	int start, end;
	scanf_s("%d %d", &start, &end);
	q3_gugu_gob(start, end);

	//4.
	printf("�� �ܺ��� �� ��?\n");
	int start_dan, end_dan;
	scanf_s("%d %d", &start_dan, &end_dan);
	printf("q4 ��� : %d\n",q4_gugudan_sum(start_dan,end_dan));

	return 0;
}


//���ǹ� �� �Լ� ���ǻ���
// 1. if(�Լ�1 && �Լ�2) �Լ�1 ���ϰ� 0, �Լ�2 ���ϰ� 1 : ���� ȣ��� �Լ�(�Լ�1)�� False(0)�̸� �Լ�2�� ������ϰ� if���� �������
// 2. if(�Լ�1 || �Լ�2) �Լ�1 ���ϰ� 1, �Լ�2 ���ϰ� 2 : ���� ȣ��� �Լ�(�Լ�1)�� True(1)��� �Լ�2�� ����ȵǰ� if���� �����Ѵ�
// ������ �����Ͽ� �Լ��� ���ϰ��� �ް� �� ���ϰ��� ���� ������ ���ǹ��� ����ϸ� ���������� ����ȴ�.