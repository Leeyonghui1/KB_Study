#include<stdio.h>
// 0726 Test5 Solution

// 2. 1���� �Լ�ȭ�ؼ� main���� ȣ���ϱ� (�Ű����� ��ȯ�� ����)
void season()
{
	int month;
	printf("q2) �� ����? : ");
	scanf_s("%d", &month);
	if (month == 12 || month == 1 || month == 2)
		printf("�ܿ�\n");
	else if(month >= 3 && month <=5)
		printf("��\n");
	else if(month >= 6 && month <=8)
		printf("����\n");
	else if(month >= 9 && month <=11)
		printf("����\n");
	else
		printf("����\n");
}

// 3. �Ű������� ���ؼ� ���� ����ϴ� �Լ�
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
		printf("����\n");
		break;
	default:printf("�߸��Է�\n"); break;
	}
}

int main()
{
	/*
	1. �¾ ��(month)�� �Է¹ް�
		1. ������ ����ϴ� �ڵ� main�� �ۼ�
		12, 1, 2 - �ܿ�
		3, 4, 5 - ��
		6, 7, 8 - ����
		9, 10, 11 - ����
		�� �� - �߸���
	*/
	int month;
	printf("q1) �¾ ���� �Է��ϼ���.");    // main�����ϰ� �ٷ� scanf ������������
	scanf_s("%d", &month);
	switch (month)
	{
	case 12: month = 6; // scanf�� month 12�Է��ϸ� month=6, printf(winter)�ϰ� ��������, case 6���� ���� �ʴ´�(breakȿ��)
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
		printf("����\n");
		break;
	default:printf("�߸��Է�\n"); break;
	}
	printf("month = %d", month); // switch case12��� ���⼭ month=6���� ���

	// 2.
	season();

	// 3.
	int m;
	printf("q3) �¾ ���� �Է� : ");   
	scanf_s("%d", &m);
	printseason(m);
	
	return 0;
}