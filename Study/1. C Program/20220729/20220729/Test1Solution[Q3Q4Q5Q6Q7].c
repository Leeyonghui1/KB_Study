#include<stdio.h>
#include"Mystructs.h"
int main()
{
	/* 
	8. 4~7까지를 배열을 매개변수로 하여서 값을 리턴한다.
	9. 함수 안에서 StudentScore로 배열 만들고 그 배열 리턴하는 함수 만들어 본다.
	10. StudentScore 배열을 매개변수로 하여 출력하는 함수 만들어 본다. 
	*/

	// 3. 학생 5명(배열생성)
	KBStudent students[5];
	// 반복문통해 데이터 입력
	for (int i = 0; i < 5; i++)
	{
		printf("점수 입력(c) : ");
		scanf_s("%d", &students[i].cScore);
		printf("점수 입력(java) : ");
		scanf_s("%d", &students[i].javaScore);
		rewind(stdin);
		printf("이름 입력 : ");
		gets(students[i].name);
	}
	// 입력된 값 출력확인
	for (int i = 0; i < 5; i++)
		printf("c = %d, java = %d, 이름 = %s\n", students[i].cScore, students[i].javaScore, students[i].name);
	
	// 4. c, java 각각의 총합을 구하기
	int cSum = 0;
	int javaSum = 0;
	for (int i = 0; i < 5; i++)
	{
		cSum += students[i].cScore;
		javaSum += students[i].javaScore;
	}
	printf(" c총합 = %d, java총합 = %d\n", cSum, javaSum);

	//5. c, java의 평균을 구하기
	double cAvg = cSum / 5.0;
	double javaAvg = javaSum / 5.0;
	printf(" c평균 = %.2f, java평균 = %.2f\n", cAvg, javaAvg);

	// 6&7. c, java,평균값(c,java점수의평균) 기준으로 각각 누가 1등,꼴지도 구하기(max, min 구하기)
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
	printf("C 1등 : %s, 점수 : %d\n", students[idx_C].name,students[idx_C].cScore);
	printf("Java 1등 : %s, 점수 : %d\n", students[idx_Java].name,students[idx_Java].javaScore);
	printf("평균 1등 : %s, 점수 : %.2f\n", students[idx_Avg].name,maxAvg);

	return 0;
}