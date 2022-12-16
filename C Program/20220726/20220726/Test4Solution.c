#include<stdio.h>

//void라면 return; 적거나 생략가능
// int, double, char 등이라면 반드시 return 적어야함
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

void q3_gugu_gob(int s, int e) // 출력
{
	// 입력순서가 1,4 같이 오름차순이 아니라 4,1 같이 내림차순으로 입력된다면
	// 1. 이 안에서 조건문써서 바꾼다
	// 2. swap함수 만들어서 바꾼다.
	/* 1번 
	if (s > e)
	{
		int temp = s;
		s = e;
		e = temp;
	}
	*/
	/* 2번 
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
	printf("q3 : x몇부터 x몇까지 할까요?\n");
	int start, end;
	scanf_s("%d %d", &start, &end);
	q3_gugu_gob(start, end);

	//4.
	printf("몇 단부터 몇 단?\n");
	int start_dan, end_dan;
	scanf_s("%d %d", &start_dan, &end_dan);
	printf("q4 결과 : %d\n",q4_gugudan_sum(start_dan,end_dan));

	return 0;
}


//조건문 안 함수 주의사항
// 1. if(함수1 && 함수2) 함수1 리턴값 0, 함수2 리턴값 1 : 먼저 호출된 함수(함수1)가 False(0)이면 함수2도 실행안하고 if문도 실행안함
// 2. if(함수1 || 함수2) 함수1 리턴값 1, 함수2 리턴값 2 : 먼저 호출된 함수(함수1)가 True(1)라면 함수2는 실행안되고 if문을 실행한다
// 변수를 선언하여 함수의 리턴값을 받고 그 리턴값을 받은 변수를 조건문에 사용하면 정상적으로 실행된다.