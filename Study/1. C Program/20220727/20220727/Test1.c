#include<stdio.h>
#include<string.h>

// 1.
char* chinaZodiac(int year)
{
	int animal = year % 12;
	switch (animal)
	{
	case 0:return "원숭이"; break;
	case 1:return "닭"; break;
	case 2:return "개"; break;
	case 3:return "돼지"; break;
	case 4:return "쥐"; break;
	case 5:return "소"; break;
	case 6:return "범"; break;
	case 7:return "토끼"; break;
	case 8:return "용"; break;
	case 9:return "뱀"; break;
	case 10:return "소"; break;
	case 11:return "양"; break;
	default: break;
	}
}

//2-1.
void ganZi(int year)
{
	int gan = year % 10;
	int zi = year % 12;
	switch (gan)
	{
	case 0:printf("경"); break;
	case 1:printf("신"); break;
	case 2:printf("임"); break;
	case 3:printf("계"); break;
	case 4:printf("갑"); break;
	case 5:printf("을"); break;
	case 6:printf("병"); break;
	case 7:printf("정"); break;
	case 8:printf("무"); break;
	case 9:printf("기"); break;
	default:break;
	}
	switch (zi)
	{
	case 0:printf("신"); break;
	case 1:printf("유"); break;
	case 2:printf("술"); break;
	case 3:printf("해"); break;
	case 4:printf("자"); break;
	case 5:printf("축"); break;
	case 6:printf("인"); break;
	case 7:printf("묘"); break;
	case 8:printf("진"); break;
	case 9:printf("사"); break;
	case 10:printf("오"); break;
	case 11:printf("미"); break;
	default: break;
	}
	printf("해 입니다.\n");
}

// 2-2 어렵다.
// 중요한부분 : 문자가 이어지면 배열로 인식한다
//즉 char gan[10] = {"경","신","임","계","갑","을","병","정","무","기"}; 이때, {}안에 있는 글자들이 하나의 배열로 취급하여
//	char gan[10][10] = {"경","신","임","계","갑","을","병","정","무","기"}; 처럼 2차원 배열로 선언해야한다.
char* ganZi2(int year)
{
	char gan[10][10] = {"경","신","임","계","갑","을","병","정","무","기"};
	char zi[12][12] = {"신","유","술","해","자","축","인","묘","진","사","오","미"};

	static char ganzi[100];
	strcat_s(ganzi,10,gan[year % 10]);
	strcat_s(ganzi,10,zi[year % 12]);

	return ganzi;
}

//3.
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
	case -1: return "지구아님";
	}
}

//4.
int length(char inPut[])
{
	int len = 0;
	for (int i = 0; inPut[i] != 0; i++)
		len++;
	return len;
}

int main()
{
	//1.
	int year;
	printf("Q1) 태어난 연도 입력(십이지리턴) : ");
	scanf_s("%d",&year);
	printf("%s띠 입니다.\n",chinaZodiac(year));
	
	//2-1.
	printf("Q2-1) 태어난 연도 입력(간지출력) : ");
	scanf_s("%d",&year);
	ganZi(year);

	// 2-2
	printf("Q2-2) 태어난 연도 입력(간지리턴) : ");
	scanf_s("%d",&year);
	printf("해당 년도는 %s해 입니다.\n",ganZi2(year));

	//3.
	printf("Q3) 태어난 월 입력 : ");
	int month;
	scanf_s("%d",&month);
	printf("계절은 %s \n",season(month));
	
	//4.
	char inPut[1024];
	printf("Q4) 문자열 입력 : ");
	rewind(stdin);
	gets(inPut);
	printf("문자열의 길이는 %d 입니다.\n",length(inPut));
	
	return 0;
}


