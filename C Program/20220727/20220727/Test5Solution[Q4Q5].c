#include<stdio.h>
// 4. 태어난 연도를 입력하고 나이를 리턴하는 함수
int calcAge()
{
	int year;
	printf("q4)태어난 년도 입력 : ");
	scanf_s("%d", &year);
	return 2023 - year;
}

// 5. 태어난 연도를 매개변수로 받고 나이 리턴하는 함수
int calculAge(int year)
{
	return 2023 - year;
}

int main()
{
	// 4.
	printf("나의 나이 = %d살\n", calcAge());
	
	// 5.
	int year;
	printf("q5) 몇년생? : ");
	scanf_s("%d", &year);
	printf("나의 나이 = %d살", calculAge(year));

	return 0;
}