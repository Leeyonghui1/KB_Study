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
		printf("�ܿ�\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("��\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("����\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("����\n");
		break;
	default:printf("�߸���\n"); break;
	}
}

void call_season2(int a)
{
	switch (a)
	{
	case 12:
	case 1:
	case 2:
		printf("�ܿ�\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("��\n");
		break;
	case 6:
	case 7:
	case 8:
		printf("����\n");
		break;
	case 9:
	case 10:
	case 11:
		printf("����\n");
		break;
	default:printf("�߸���\n"); break;
	}
}

int myAge()
{
	int year;
	int myage;
	printf(" 4��\n");
	printf("����⵵ = ");
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
	printf(" 1��\n");
	int a;
	scanf_s("%d", &a);
	switch (a)
	{
	case 12:
	case 1:
	case 2:
		printf("�ܿ�\n");
		break;
	case 3:
	case 4:
	case 5:
		printf("��\n"); 
		break;
	case 6:
	case 7:
	case 8:
		printf("����\n"); 
		break;
	case 9:
	case 10:
	case 11:
		printf("����\n"); 
		break;
	default:printf("�߸���\n"); break;
	}

	//2.
	printf(" 2��\n");
	call_season();

	//3.
	printf(" 3��\n");
	int b;
	scanf_s("%d", &b);
	call_season2(b);


	//4.
	printf("���� ���� = %d\n", myAge());
	
	//5.
	printf(" 5��\n");
	int year;
	printf("����⵵ = ");
	scanf_s("%d", &year);
	printf("���� ���� = %d\n", myAge2(year));
	
	
	
	
	
	
	
	
	return 0;
}