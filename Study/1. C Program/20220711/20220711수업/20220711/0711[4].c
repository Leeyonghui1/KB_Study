#include<stdio.h>
//3. �Ű������� ���� �Լ�
char calcul()
{
	printf("ù ��° ���� �Է�");
	int num1;
	scanf_s("%d", &num1);
	printf("�ι�° ���� �Է�");
	int num2;
	scanf_s("%d", &num2);
	int result = num2 - num1;
	if (result < 0)
		return '-';
	else if (result == 0)
		return '0';
	else
		return '+';
}
int main()
{
	char sign = calcul();
	printf("��ȣ�� %c�Դϴ�.\n", sign);
	return 0;
}