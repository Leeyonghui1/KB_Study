#include<stdio.h>

int main()
{
	//2-1. ���� �¾ ������ �Ű������� �ް� ������ ���
	printf("��⵵�� �¾����?");
	int year;
	scanf_s("%d", &year);
	int ganji = year % 10; // ����Ӱ� �������� ����
	int thee = year % 12; // �������� �����ι� �������

	switch (ganji)
	{
	case 0:            // switch case���� case : ������ ���ٷ� ���°� ���� ������ 2�پ��°� �ǹ���
		printf("��");
		break;
	case 1:
		printf("��");
		break;
	case 2:
		printf("��");
		break;
	case 3:
		printf("��");
		break;
	case 4:
		printf("��");
		break;
	case 5:
		printf("��");
		break;
	case 6:
		printf("��");
		break;
	case 7:
		printf("��");
		break;
	case 8:
		printf("��");
		break;
	case 9:
		printf("��");
		break;
	default:
		printf("����");
		break;
	}

	switch (thee)
	{
	case 0:            
		printf("��");
		break;
	case 1:
		printf("��");
		break;
	case 2:
		printf("��");
		break;
	case 3:
		printf("��");
		break;
	case 4:
		printf("��");
		break;
	case 5:
		printf("��");
		break;
	case 6:
		printf("��");
		break;
	case 7:
		printf("��");
		break;
	case 8:
		printf("��");
		break;
	case 9:
		printf("��");
		break;
	case 10:
		printf("��");
		break;
	case 11:
		printf("��");
		break;
	default:
		printf("����");
		break;
	}
	return 0;
}