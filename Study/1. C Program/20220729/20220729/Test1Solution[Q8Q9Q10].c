#include<stdio.h>
#include"Mystructs.h"

//매크로 상수 사용
//const 이용한 상수도 괜찮음
#define C 'C'
#define JAVA 'J'
#define TOTAL 'T'

//subject에 따라서 c 혹은 java 총합계산
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
			printf("잘못된 과목\n");
			return -1;
		}
	}
	if (subject == C)
		return cSum;
	else
		return javaSum;
}

// 평균구하는 함수
double avgTotal(KBStudent stu[], int size, char subject)
{
	if (subject == C)
		return sumTotal(stu, size, C) / (double)size;
	else if (subject == JAVA)
		return sumTotal(stu, size, JAVA) / (double)size;
	else
	{
		printf("잘못된 문자\n");
		return -1;
	}
}

// 1등,꼴등구하기
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
			printf("잘못된 문자열\n");
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
	8. 4~7까지를 배열을 매개변수로 하여서 값을 리턴한다.
	9. 함수 안에서 StudentScore로 배열 만들고 그 배열 리턴하는 함수 만들어 본다.
	10. StudentScore 배열을 매개변수로 하여 출력하는 함수 만들어 본다.
	*/

	KBStudent students[5] =
	{
		{.cScore = 100, .javaScore = 11, .name = "이동준"},
		{.cScore = 71, .javaScore = 15, .name = "김진규"},
		{.cScore = 93, .javaScore = 30, .name = "조영탁"},
		{.cScore = 85, .javaScore = 100, .name = "이유나"},
		{.cScore = 90, .javaScore = 96, .name = "오세룡"},
	};


	printf("c의 총합 = %d\n", sumTotal(students, 5, C));
	printf("java의 총합 = %d\n", sumTotal(students, 5, JAVA));
	printf("c의 평균 = %.2f\n", avgTotal(students, 5, C));
	printf("java의 평균 = %.3f\n", avgTotal(students, 5, JAVA));
	
	printf("c 1등 = %s\n", whoNO1(students, 5, C));
	printf("java 1등 = %s\n", whoNO1(students, 5, JAVA));
	printf("평균 1등 = %s\n", whoNO1(students, 5, TOTAL));

	return 0;
}