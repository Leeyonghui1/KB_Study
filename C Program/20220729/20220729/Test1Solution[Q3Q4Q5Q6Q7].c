#include<stdio.h>
#include"Mystructs.h"
int main()
{
	/* 
	8. 4~7������ �迭�� �Ű������� �Ͽ��� ���� �����Ѵ�.
	9. �Լ� �ȿ��� StudentScore�� �迭 ����� �� �迭 �����ϴ� �Լ� ����� ����.
	10. StudentScore �迭�� �Ű������� �Ͽ� ����ϴ� �Լ� ����� ����. 
	*/

	// 3. �л� 5��(�迭����)
	KBStudent students[5];
	// �ݺ������� ������ �Է�
	for (int i = 0; i < 5; i++)
	{
		printf("���� �Է�(c) : ");
		scanf_s("%d", &students[i].cScore);
		printf("���� �Է�(java) : ");
		scanf_s("%d", &students[i].javaScore);
		rewind(stdin);
		printf("�̸� �Է� : ");
		gets(students[i].name);
	}
	// �Էµ� �� ���Ȯ��
	for (int i = 0; i < 5; i++)
		printf("c = %d, java = %d, �̸� = %s\n", students[i].cScore, students[i].javaScore, students[i].name);
	
	// 4. c, java ������ ������ ���ϱ�
	int cSum = 0;
	int javaSum = 0;
	for (int i = 0; i < 5; i++)
	{
		cSum += students[i].cScore;
		javaSum += students[i].javaScore;
	}
	printf(" c���� = %d, java���� = %d\n", cSum, javaSum);

	//5. c, java�� ����� ���ϱ�
	double cAvg = cSum / 5.0;
	double javaAvg = javaSum / 5.0;
	printf(" c��� = %.2f, java��� = %.2f\n", cAvg, javaAvg);

	// 6&7. c, java,��հ�(c,java���������) �������� ���� ���� 1��,������ ���ϱ�(max, min ���ϱ�)
	int maxC = 0;
	int maxJava = 0;
	double maxAvg = 0;
	maxC = students[0].cScore;
	maxJava = students[0].javaScore;
	maxAvg = (students[0].cScore + students[0].javaScore) / 2.0;
	int idx_C = 0;
	int idx_Java = 0;
	int idx_Avg = 0;
	for (int i = 0; i < 5; i++)
	{
		if (students[i].cScore > maxC)
		{
			maxC = students[i].cScore;
			idx_C = i;
		}
		if (students[i].javaScore > maxJava)
		{
			maxJava = students[i].javaScore;
			idx_Java = i;
		}
		if ((students[i].cScore + students[i].javaScore) / 2.0 > maxAvg)
		{
			maxAvg = (students[i].cScore + students[i].javaScore) / 2.0;
			idx_Avg = i;
		}
	}
	printf("C 1�� : %s, ���� : %d\n", students[idx_C].name,students[idx_C].cScore);
	printf("Java 1�� : %s, ���� : %d\n", students[idx_Java].name,students[idx_Java].javaScore);
	printf("��� 1�� : %s, ���� : %.2f\n", students[idx_Avg].name,maxAvg);

	return 0;
}