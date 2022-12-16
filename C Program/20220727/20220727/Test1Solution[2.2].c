#include<stdio.h>

//2-2. 내가 태어난 연도를 매개변수로 받고 간지를 리턴하세요
char* myGanji(int year)
{
	int ganji = year % 10;
	int thee = year % 12;

	// 한글은 1글자 2byte,마지막 NULL값 - > 배열크기 3
	char ganjiResult[3]; // 간지 저장
	char theeResult[3]; // 띠 저장
	static char result[5];

	switch (ganji)
	{
	case 0:            
		strcpy(ganjiResult,"경");
		break;
	case 1:
		strcpy(ganjiResult,"신");
		break;
	case 2:
		strcpy(ganjiResult,"임");
		break;
	case 3:
		strcpy(ganjiResult,"계");
		break;
	case 4:
		strcpy(ganjiResult,"갑");
		break;
	case 5:
		strcpy(ganjiResult,"을");
		break;
	case 6:
		strcpy(ganjiResult,"병");
		break;
	case 7:
		strcpy(ganjiResult,"정");
		break;
	case 8:
		strcpy(ganjiResult,"무");
		break;
	case 9:
		strcpy(ganjiResult,"기");
		break;
	default:
		strcpy(ganjiResult,"오류");
		break;
	}

	switch (thee)
	{
	case 0:
		strcpy(theeResult,"신");
		break;
	case 1:
		strcpy(theeResult,"유");
		break;
	case 2:
		strcpy(theeResult,"술");
		break;
	case 3:
		strcpy(theeResult,"해");
		break;
	case 4:
		strcpy(theeResult,"자");
		break;
	case 5:
		strcpy(theeResult,"축");
		break;
	case 6:
		strcpy(theeResult,"인");
		break;
	case 7:
		strcpy(theeResult,"묘");
		break;
	case 8:
		strcpy(theeResult,"진");
		break;
	case 9:
		strcpy(theeResult,"사");
		break;
	case 10:
		strcpy(theeResult,"오");
		break;
	case 11:
		strcpy(theeResult,"미");
		break;
	default:
		strcpy(theeResult,"오류");
		break;
	}

	for (int i = 0; i < 2; i++)
		result[i] = ganjiResult[i];
	for (int i = 0; i < 2; i++)
		result[i + 2] = theeResult[i];
	result[4] = NULL;
	return result;
}

int main()
{
	printf("몇년도에 태어났나요?");
	int year;
	scanf_s("%d", &year);
	printf("%d", myGanji(year));
	return 0;
}