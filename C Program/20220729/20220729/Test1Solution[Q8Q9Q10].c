#include<stdio.h>
#include"Mystructs.h"

//��ũ�� ��� ���
//const �̿��� ����� ������
#define C 'C'
#define JAVA 'J'
#define TOTAL 'T'

//subject�� ���� c Ȥ�� java ���հ��
int sumTotal(KBStudent stu[], int size, char subject)
{
	int cSum = 0;
	int javaSum = 0;
	for (int i = 0; i < size; i++)
	{
		if (subject == C)
			cSum += stu[i].cScore;
		else if (subject == JAVA)
			javaSum += stu[i].javaScore;
		else
		{
			printf("�߸��� ����\n");
			return -1;
		}
	}
	if (subject == C)
		return cSum;
	else
		return javaSum;
}

// ��ձ��ϴ� �Լ�
double avgTotal(KBStudent stu[], int size, char subject)
{
	if (subject == C)
		return sumTotal(stu, size, C) / (double)size;
	else if (subject == JAVA)
		return sumTotal(stu, size, JAVA) / (double)size;
	else
	{
		printf("�߸��� ����\n");
		return -1;
	}
}

// 1��,�õ�ϱ�
char* whoNO1(KBStudent stu[], int size, char subject)
{
	int maxC = 0;
	int maxJava = 0;
	double maxAvg = 0;
	int idx_C = 0;
	int idx_Java = 0;
	int idx_Avg = 0;
	maxC = stu[0].cScore;
	maxJava = stu[0].javaScore;
	maxAvg = (stu[0].cScore + stu[0].javaScore) / 2.0;
	for (int i = 0; i < 5; i++)
	{
		if (subject == C)
		{
			if (stu[i].cScore > maxC)
			{
				maxC = stu[i].cScore;
				idx_C = i;
			}
		}
		else if (subject == JAVA)
		{
			if (stu[i].javaScore > maxJava)
			{
				maxJava = stu[i].javaScore;
				idx_Java = i;
			}
		}
		else if (subject == TOTAL)
		{
			if (((stu[i].cScore + stu[i].javaScore) / 2.0) > maxAvg)
			{
				maxAvg = (stu[i].cScore + stu[i].javaScore) / 2.0;
				idx_Avg = i;
			}
		}
		else
		{
			printf("�߸��� ���ڿ�\n");
			return NULL;
		}
	}
	if (subject == C)
		return stu[idx_C].name;
	else if (subject == JAVA)
		return stu[idx_Java].name;
	else
		return stu[idx_Avg].name;

}
int main()
{
	/*
	8. 4~7������ �迭�� �Ű������� �Ͽ��� ���� �����Ѵ�.
	9. �Լ� �ȿ��� StudentScore�� �迭 ����� �� �迭 �����ϴ� �Լ� ����� ����.
	10. StudentScore �迭�� �Ű������� �Ͽ� ����ϴ� �Լ� ����� ����.
	*/

	KBStudent students[5] =
	{
		{.cScore = 100, .javaScore = 11, .name = "�̵���"},
		{.cScore = 71, .javaScore = 15, .name = "������"},
		{.cScore = 93, .javaScore = 30, .name = "����Ź"},
		{.cScore = 85, .javaScore = 100, .name = "������"},
		{.cScore = 90, .javaScore = 96, .name = "������"},
	};


	printf("c�� ���� = %d\n", sumTotal(students, 5, C));
	printf("java�� ���� = %d\n", sumTotal(students, 5, JAVA));
	printf("c�� ��� = %.2f\n", avgTotal(students, 5, C));
	printf("java�� ��� = %.3f\n", avgTotal(students, 5, JAVA));
	
	printf("c 1�� = %s\n", whoNO1(students, 5, C));
	printf("java 1�� = %s\n", whoNO1(students, 5, JAVA));
	printf("��� 1�� = %s\n", whoNO1(students, 5, TOTAL));

	return 0;
}