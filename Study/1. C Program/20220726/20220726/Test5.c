#include<stdio.h>
void call_season()
{
	int a;
	scanf_s("%d", &a);
	switch (a)
	{
	case 12:
	case 1:
	case 2:
		printf("겨울\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("봄\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("여름\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("가을\n");
		break;
	default:printf("잘못됨\n"); break;
	}
}

void call_season2(int a)
{
	switch (a)
	{
	case 12:
	case 1:
	case 2:
		printf("겨울\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("봄\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("여름\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("가을\n");
		break;
	default:printf("잘못됨\n"); break;
	}
}

int myAge()
{
	int year;
	int myage;
	printf(" 4번\n");
	printf("출생년도 = ");
	scanf_s("%d", &year); 
	myage = (2022 - year) + 1;
	return myage;
}

int myAge2(int year)
{
	int myage = (2022 - year) + 1;
	return myage;
}

int main()
{
	//1.
	printf(" 1번\n");
	int a;
	scanf_s("%d", &a);
	switch (a)
	{
	case 12:
	case 1:
	case 2:
		printf("겨울\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("봄\n"); 
		break;
	case 6:
	case 7:
	case 8:
		printf("여름\n"); 
		break;
	case 9:
	case 10:
	case 11:
		printf("가을\n"); 
		break;
	default:printf("잘못됨\n"); break;
	}

	//2.
	printf(" 2번\n");
	call_season();

	//3.
	printf(" 3번\n");
	int b;
	scanf_s("%d", &b);
	call_season2(b);


	//4.
	printf("나의 나이 = %d\n", myAge());
	
	//5.
	printf(" 5번\n");
	int year;
	printf("출생년도 = ");
	scanf_s("%d", &year);
	printf("나의 나이 = %d\n", myAge2(year));
	
	
	
	
	
	
	
	
	return 0;
}