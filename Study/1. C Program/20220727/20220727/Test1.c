#include<stdio.h>
#include<string.h>

// 1.
char* chinaZodiac(int year)
{
	int animal = year % 12;
	switch (animal)
	{
	case 0:return "������"; break;
	case 1:return "��"; break;
	case 2:return "��"; break;
	case 3:return "����"; break;
	case 4:return "��"; break;
	case 5:return "��"; break;
	case 6:return "��"; break;
	case 7:return "�䳢"; break;
	case 8:return "��"; break;
	case 9:return "��"; break;
	case 10:return "��"; break;
	case 11:return "��"; break;
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
	case 0:printf("��"); break;
	case 1:printf("��"); break;
	case 2:printf("��"); break;
	case 3:printf("��"); break;
	case 4:printf("��"); break;
	case 5:printf("��"); break;
	case 6:printf("��"); break;
	case 7:printf("��"); break;
	case 8:printf("��"); break;
	case 9:printf("��"); break;
	default:break;
	}
	switch (zi)
	{
	case 0:printf("��"); break;
	case 1:printf("��"); break;
	case 2:printf("��"); break;
	case 3:printf("��"); break;
	case 4:printf("��"); break;
	case 5:printf("��"); break;
	case 6:printf("��"); break;
	case 7:printf("��"); break;
	case 8:printf("��"); break;
	case 9:printf("��"); break;
	case 10:printf("��"); break;
	case 11:printf("��"); break;
	default: break;
	}
	printf("�� �Դϴ�.\n");
}

// 2-2 ��ƴ�.
// �߿��Ѻκ� : ���ڰ� �̾����� �迭�� �ν��Ѵ�
//�� char gan[10] = {"��","��","��","��","��","��","��","��","��","��"}; �̶�, {}�ȿ� �ִ� ���ڵ��� �ϳ��� �迭�� ����Ͽ�
//	char gan[10][10] = {"��","��","��","��","��","��","��","��","��","��"}; ó�� 2���� �迭�� �����ؾ��Ѵ�.
char* ganZi2(int year)
{
	char gan[10][10] = {"��","��","��","��","��","��","��","��","��","��"};
	char zi[12][12] = {"��","��","��","��","��","��","��","��","��","��","��","��"};

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
		return "�ܿ�";
	case 3:
	case 4:
	case 5:
		return "��";
	case 6:
	case 7:
	case 8:
		return "����";
	case 9:
	case 10:
	case 11:
		return "����";
	case -1: return "�����ƴ�";
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
	printf("Q1) �¾ ���� �Է�(����������) : ");
	scanf_s("%d",&year);
	printf("%s�� �Դϴ�.\n",chinaZodiac(year));
	
	//2-1.
	printf("Q2-1) �¾ ���� �Է�(�������) : ");
	scanf_s("%d",&year);
	ganZi(year);

	// 2-2
	printf("Q2-2) �¾ ���� �Է�(��������) : ");
	scanf_s("%d",&year);
	printf("�ش� �⵵�� %s�� �Դϴ�.\n",ganZi2(year));

	//3.
	printf("Q3) �¾ �� �Է� : ");
	int month;
	scanf_s("%d",&month);
	printf("������ %s \n",season(month));
	
	//4.
	char inPut[1024];
	printf("Q4) ���ڿ� �Է� : ");
	rewind(stdin);
	gets(inPut);
	printf("���ڿ��� ���̴� %d �Դϴ�.\n",length(inPut));
	
	return 0;
}


