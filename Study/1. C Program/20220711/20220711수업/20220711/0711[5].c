#include<stdio.h>
//4. �Ű������� �ִ� �Լ�
void calcul_sign(int num1, int num2)
{
	int result = num2 - num1;
	if (result < 0)
		printf("��ȣ�� -\n");
	else if (result == 0)
		printf("��ȣ�� 0\n");
	else
		printf("��ȣ�� +\n");


}
int main()
{
	//calcul_sign(7, 2);
	int n1, n2;
	printf("ù��°��?");
	scanf_s("%d", &n1);
	printf("�ι�°��?");
	scanf_s("%d", &n2);
	calcul_sign(n1, n2);

	return 0;
}