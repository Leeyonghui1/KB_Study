#include<stdio.h>
// void printYourName(char n[])  // �Ű������� �迭�϶�
void printYourName(char* n)  // ���� ������ �ǹ� , �ٸ� ǥ����
{
	printf("����� �̸��� %s�Դϴ�.\n", n);
}

char* printABC()
{
	return "abc";
}

// �Ű����� ���� ���ڿ��� �Է¹޾Ƽ� �����ϰ� ���� ��?
char* returnMyInfo()
{
	static char mbti[5]; // static ������ ���� , static ������ �������
	printf("mbti?");
	gets(mbti);
	/* 
	'static' ������ mbti[5]�� ���ÿ����� �����Ѵ�. �Լ��� ������ mbti[5]�� ������� ������ return�� �����۵����� �ʴ´�.
	'static' ������ �����Ϳ����� �����Ѵ�. �����Ϳ����� �����ϴ°͵��� ���α׷��� ������ ������� ������ return�� �����۵��Ѵ�.
	*/
	return mbti;
}

char* returnMyMBTI(char* mbti)
{
	return mbti; // �Ű������� ���� �� �״�� �����غ���
}

char* change(char name[]) // �� �ٸ� �ذ��� , �Լ��ȿ��� �ٽ� �Է��ϱ�
{
	gets(name);
	return name;
}

int main()
{
	printf("�̸� �Է�: ");
	char name[100];   //���ڹ迭
	gets(name);       //�����Է�
	printYourName(name);
	printf("%s\n", printABC());
	printf("%s\n", returnMyInfo());   // �����Ⱚ�� ���´�
	printf("%s\n", returnMyMBTI("ENFP"));
	printf("%s\n", returnMyMBTI(name));
	printf("%s\n", change(name));





	 printf("%c", print1ABC());  // char �Լ� - %c  || char* �Լ� - %s
	return 0;
}


 
char print1ABC()     // charŸ�� �Լ��� %c�� ����� �ؾ� ������ �ȳ���.
{
	return "abcD\n";
}
