#include<stdio.h>

// 1. ���� �¾ ������ �Ű������� �ް� ���������� ���ڿ��� ����
char* outputThee(int year)
{
	char thee[10];
	switch (year%12)
	{
	case 0:return "������";// strcpy(thee, "������"); break; // strcpy(thee, "������") : thee�� �����̶�� ���ڿ��� ����ִ´�.
		   //thee = "������" ; ���ڿ��� �ٸ� ���ڿ��� �ְ������ ���� ������ �۵����� �ʴ´�. 
		   // �ֳ�? �迭�� ó�� �����Ҷ� char thee[10] = "������";�� ���������� �迭�� "������"�� ������
		   // ���߿� �迭 'thee'�� ȣ���ϸ� �迭 thee�� �������� ����Ű�°��̱� ������ "������"�� ���� �ʴ´�
		   // �׷��� "strcpy"�� ����Ѵ�.

	case 1:return "��";// strcpy(thee, "��"); break;
	case 2:return "��";// strcpy(thee, "��"); break;
	case 3:return "����"; //  strcpy(thee, "����"); break;
	case 4:return "��"; // strcpy(thee, "��"); break;
	case 5:return "��";// strcpy(thee, "��"); break;
	case 6:return "ȣ����";// strcpy(thee, "ȣ����"); break;
	case 7:return "�䳢"; //strcpy(thee, "�䳢"); break;
	case 8:return "��"; //strcpy(thee, "��"); break;
	case 9:return "��"; //strcpy(thee, "��"); break;
	case 10:return "��"; //strcpy(thee, "��"); break;
	case 11:return "��"; //strcpy(thee, "��"); break;
	default:return "����"; // printf("fault"); return -1; // return -1 : �ڵ带 ������ѹ���
	}
}

//2���� �迭 Ȱ���� ���
char* moreEasy(int year)
{
	year %= 12;
	static char thees[12][10]
		= { "������","��","��","����","��","��","ȣ����","�䳢","��","��","��","��" };
	return thees[year];
}


int main()
{
	int year;
	printf("�����ΰ���?");
	scanf_s("%d", &year);
	printf("%s", outputThee(year));
	printf("%s", moreEasy(year));
	return 0;
}
