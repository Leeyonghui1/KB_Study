#include<stdio.h>
//3. 매개변수로 태어난 월을 받고, 그에 따른 계절을 문자열로 리턴
char* season(int month)
{
	switch (month)
	{
	case 12:
	case 1:
	case 2:
		return "겨울";
	case 3:
	case 4:
	case 5:
		return "봄";
	case 6:
	case 7:
	case 8:
		return "여름";
	case 9:
	case 10:
	case 11:
		return "가을";
	case -1:
		return "지구아님";
		break;
	default:
		return "오류";
		break;
	}
}

int main()
{
	int month;
	printf("태어난 월 입력 : ");
	scanf_s("%d", &month);
	printf("%s", season(month));
	return 0;
}