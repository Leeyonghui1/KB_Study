#include<stdio.h>
#include"Mystructs.h"
int main()
{
	// �л� 1���� ��
	StudentScore s1 = { .kor = 100, .eng = 0, .math = 50 };
	printf("���� = %d, ���� = %d, ���� = %d\n", s1.kor, s1.eng, s1.math);

	// �л� 3���� �� ( = ����üŸ�� �迭�� ���� ��)
	StudentScore students[3]
		= {
			{.kor = 10, .eng = 20, .math = 30},
			{.kor = 20, .eng = 40, .math = 60},
			{.kor = 30, .eng = 60, .math = 90},
	};
	
	for(int i = 0 ; i <3;i++)
		printf("���� = %d, ���� = %d, ���� = %d\n", students[i].kor, students[i].eng, students[i].math);

	// �迭�� Ư�� �� ������ ������ ���� ����
	printf("students[0] ���� �� ���� = %d\n", students[0].kor);
	students[0].kor = 50;
	printf("students[0] ���� �� ���� = %d\n", students[0].kor);

	// �迭 �� ������ �� ���� ��� ����
    printf("[1]���� = %d, [2]���� = %d, [0]���� = %d\n", students[1].kor, students[2].eng, students[0].math);

	
	return 0;
}