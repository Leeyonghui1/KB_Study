#include<stdio.h>

int main()
{
	//2-1. 내가 태어난 연도를 매개변수로 받고 간지를 출력
	printf("몇년도에 태어났나요?");
	int year;
	scanf_s("%d", &year);
	int ganji = year % 10; // 경신임계 갑을병정 무기
	int thee = year % 12; // 신유술해 자축인묘 진사오미

	switch (ganji)
	{
	case 0:            // switch case쓸때 case : 옆으로 한줄로 쓰는거 보다 밑으로 2줄쓰는게 실무용
		printf("경");
		break;
	case 1:
		printf("신");
		break;
	case 2:
		printf("임");
		break;
	case 3:
		printf("계");
		break;
	case 4:
		printf("갑");
		break;
	case 5:
		printf("을");
		break;
	case 6:
		printf("병");
		break;
	case 7:
		printf("정");
		break;
	case 8:
		printf("무");
		break;
	case 9:
		printf("기");
		break;
	default:
		printf("오류");
		break;
	}

	switch (thee)
	{
	case 0:            
		printf("신");
		break;
	case 1:
		printf("유");
		break;
	case 2:
		printf("술");
		break;
	case 3:
		printf("해");
		break;
	case 4:
		printf("자");
		break;
	case 5:
		printf("축");
		break;
	case 6:
		printf("인");
		break;
	case 7:
		printf("묘");
		break;
	case 8:
		printf("진");
		break;
	case 9:
		printf("사");
		break;
	case 10:
		printf("오");
		break;
	case 11:
		printf("미");
		break;
	default:
		printf("오류");
		break;
	}
	return 0;
}