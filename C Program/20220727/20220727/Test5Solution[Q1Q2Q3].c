#include<stdio.h>
// 0726 Test5 Solution

// 2. 1번을 함수화해서 main에서 호출하기 (매개변수 반환형 없음)
void season()
{
	int month;
	printf("q2) 몇 월생? : ");
	scanf_s("%d", &month);
	if (month == 12 || month == 1 || month == 2)
		printf("겨울\n");
	else if(month >= 3 && month <=5)
		printf("봄\n");
	else if(month >= 6 && month <=8)
		printf("여름\n");
	else if(month >= 9 && month <=11)
		printf("가을\n");
	else
		printf("오류\n");
}

// 3. 매개변수를 통해서 계절 출력하는 함수
void printseason(int month)
{
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		printf("Winter is coming\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("Spring\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("Daegu is coming\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("가을\n");
		break;
	default:printf("잘못입력\n"); break;
	}
}

int main()
{
	/*
	1. 태어난 월(month)를 입력받고
		1. 계절을 출력하는 코드 main에 작성
		12, 1, 2 - 겨울
		3, 4, 5 - 봄
		6, 7, 8 - 여름
		9, 10, 11 - 가을
		그 외 - 잘못됨
	*/
	int month;
	printf("q1) 태어난 월을 입력하세요.");    // main시작하고 바로 scanf 별로좋지않음
	scanf_s("%d", &month);
	switch (month)
	{
	case 12: month = 6; // scanf로 month 12입력하면 month=6, printf(winter)하고 빠져나감, case 6으로 가지 않는다(break효과)
	case 1:
	case 2:
		printf("Winter is coming\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("Spring\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("Daegu is coming\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("가을\n");
		break;
	default:printf("잘못입력\n"); break;
	}
	printf("month = %d", month); // switch case12경우 여기서 month=6으로 출력

	// 2.
	season();

	// 3.
	int m;
	printf("q3) 태어난 월을 입력 : ");   
	scanf_s("%d", &m);
	printseason(m);
	
	return 0;
}