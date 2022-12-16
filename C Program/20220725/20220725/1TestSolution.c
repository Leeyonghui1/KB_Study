#include<stdio.h>
// CStudy13 실습1풀이
struct  Student
{
	int num;
	char name[100];
}typedef Student; // 시작글자 대문자

void printStudent(Student s)
{
	printf("%d번 학생 %s\n", s.num, s.name);
}

int main()
{
	//1번
	Student s = { .name = "도광현", .num = 1 };
	printStudent(s);
	
	//2번
	Student students[3];
	for (int i = 0; i < 3; i++)
	{
		int temp;
		printf("학생의 번호?\n");
		scanf_s("%d", &temp);
		int duplicate = 0;
		for (int j = 0; j < i; j++)
		{
			if (students[j].num == temp)
			{
				printf("중복번호!\n");
				i--;
				duplicate = 1;
				break;
			}
		}
		if (duplicate == 0)
		{
			students[i].num = temp;
			printf("학생의 이름은?\n");
			rewind(stdin);
			gets(students[i].name);         
			// scanf_s함수는 문자열 입력시 공백을 인식못한다. 문자열 입력함수로 적절하지는 않다.
			// gets 함수는 엔터를 치기 전까지 한줄로인식한다. 즉, 띄어쓰기(공백)을 사용해도 괜찮다.
		}
	}

	for (int i = 0; i < 3; i++)
		printStudent(students[i]);

	return 0;
}