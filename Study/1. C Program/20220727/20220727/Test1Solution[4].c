#include<stdio.h>
//4. �Ű������� �޾ƿ� ���ڿ��� ���̸� �����غ�����. (�ѱ������ϰ� �����̳� ���ڸ� ������ ��)
int length(char* str)
{
	// ���ڿ��� ���̸� ���Ϸ���, �� ���ڿ��� ������ ���� �ݺ��� ����
	// ����, ����, Ư������, ������ ��� 1byte
	// �ѱ��̳� ���ڴ� 1���ڴ� 2byte
	int len = 0;
	while (str[len] != '\0')
		len++;
	return len;
}

int main()
{
	char len[100];
	printf("���ڿ� �Է� : ");
	gets(len);
	printf("���ڿ� ���� = %d", length(len));
	return 0;
}