#include<stdio.h>
struct Student
{
	char name[100];
	int number;

}typedef Stu;


void print_s()
{
	Stu s1 = {.number = 1,.name = "������" };
	printf("%d�� �л� %s\n", s1.number, s1.name);
}

void print_ss()
{
	Stu ss[100];

	for (int i = 0; i < 3; i++)
	{
		scanf_s("%d", &ss[i].number);
		scanf_s("%s", &ss[i].name,sizeof(ss[i].name));
		for (int j = 0; j < i; j++)
		{
			if (ss[i].number == ss[j].number)
			{
				printf("�ٽ� �Է��ϼ���\n");
				i--;
				break;
			}
		}
	}
	for (int i = 0; i < 3; i++)
	{
		printf("%d�� �л� %s\n", ss[i].number, ss[i].name);
	}

}

int main()
{
	//print_s();

	printf("�л��� ��ȣ, �̸��� �Է��ϼ���\n");
	print_ss();
	 
	return 0;
}