#include<stdio.h>
// CStudy13 �ǽ�1Ǯ��
struct  Student
{
	int num;
	char name[100];
}typedef Student; // ���۱��� �빮��

void printStudent(Student s)
{
	printf("%d�� �л� %s\n", s.num, s.name);
}

int main()
{
	//1��
	Student s = { .name = "������", .num = 1 };
	printStudent(s);
	
	//2��
	Student students[3];
	for (int i = 0; i < 3; i++)
	{
		int temp;
		printf("�л��� ��ȣ?\n");
		scanf_s("%d", &temp);
		int duplicate = 0;
		for (int j = 0; j < i; j++)
		{
			if (students[j].num == temp)
			{
				printf("�ߺ���ȣ!\n");
				i--;
				duplicate = 1;
				break;
			}
		}
		if (duplicate == 0)
		{
			students[i].num = temp;
			printf("�л��� �̸���?\n");
			rewind(stdin);
			gets(students[i].name);         
			// scanf_s�Լ��� ���ڿ� �Է½� ������ �νĸ��Ѵ�. ���ڿ� �Է��Լ��� ���������� �ʴ�.
			// gets �Լ��� ���͸� ġ�� ������ ���ٷ��ν��Ѵ�. ��, ����(����)�� ����ص� ������.
		}
	}

	for (int i = 0; i < 3; i++)
		printStudent(students[i]);

	return 0;
}