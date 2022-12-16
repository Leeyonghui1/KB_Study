#include<stdio.h>

// 1. 내가 태어난 연도를 매개변수로 받고 무슨띠인지 문자열을 리턴
char* outputThee(int year)
{
	char thee[10];
	switch (year%12)
	{
	case 0:return "원숭이";// strcpy(thee, "원숭이"); break; // strcpy(thee, "원숭이") : thee에 원숭이라는 문자열을 집어넣는다.
		   //thee = "원숭이" ; 문자열에 다른 문자열을 넣고싶을때 직접 대입은 작동하지 않는다. 
		   // 왜냐? 배열을 처음 선언할때 char thee[10] = "원숭이";는 정상적으로 배열에 "원숭이"가 들어가지만
		   // 나중에 배열 'thee'를 호출하면 배열 thee의 시작점을 가르키는것이기 때문에 "원숭이"가 들어가지 않는다
		   // 그래서 "strcpy"를 사용한다.

	case 1:return "닭";// strcpy(thee, "닭"); break;
	case 2:return "개";// strcpy(thee, "개"); break;
	case 3:return "돼지"; //  strcpy(thee, "돼지"); break;
	case 4:return "쥐"; // strcpy(thee, "쥐"); break;
	case 5:return "소";// strcpy(thee, "소"); break;
	case 6:return "호랑이";// strcpy(thee, "호랑이"); break;
	case 7:return "토끼"; //strcpy(thee, "토끼"); break;
	case 8:return "용"; //strcpy(thee, "용"); break;
	case 9:return "뱀"; //strcpy(thee, "뱀"); break;
	case 10:return "말"; //strcpy(thee, "말"); break;
	case 11:return "양"; //strcpy(thee, "양"); break;
	default:return "오류"; // printf("fault"); return -1; // return -1 : 코드를 종료시켜버림
	}
}

//2차원 배열 활용한 방법
char* moreEasy(int year)
{
	year %= 12;
	static char thees[12][10]
		= { "원숭이","닭","개","돼지","쥐","소","호랑이","토끼","용","뱀","말","양" };
	return thees[year];
}


int main()
{
	int year;
	printf("몇년생인가요?");
	scanf_s("%d", &year);
	printf("%s", outputThee(year));
	printf("%s", moreEasy(year));
	return 0;
}
