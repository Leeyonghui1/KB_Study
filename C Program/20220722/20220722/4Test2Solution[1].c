#include<stdio.h>
#include"Student.h"

int main()
{
	// �л� 2���� ��� ��
	/*
	Stu s1 = { .math = 40, .kor = 50, .eng = 55 };
	Stu s2 = { 50, 60, 55 }; // math , eng, kor����

	int avg = (s1.math + s1.eng + s1.kor) / 3;
	int avg2 = (s2.math + s2.eng + s2.kor) / 3;
	printf("avg = %d, avg2 = %d\n", avg, avg2);
	if (avg > avg2)
		printf("ù ��° �л��� ����� �� ũ��\n");
	else
		printf("�� ��° �л��� ����� �� ũ��\n");
		*/
	//�ǽ�4 3~5
	Stu students[5];
	for (int i = 0; i < 5; i++)
	{
		printf("�л��� ������ ���� �Է��ϼ���.");
		scanf_s("%d %d %d", &students[i].kor, &students[i].eng, &students[i].math);
	}
	int num;
	Stu Elite = students[0];
	for (int i = 0; i < 5; i++)
	{
		int average = students[i].kor + students[i].eng + students[i].math;
		average /= 3;

		int max = Elite.kor + Elite.eng + Elite.math;
		max /= 3;

		if (max < average)
		{
			Elite = students[i];
			num = i;
		}
	}
	printf("%d��° �л��� 1���̴�.\n", num);




	return 0;
}