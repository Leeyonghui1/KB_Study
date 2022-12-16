#include<stdio.h>
//4. 매개변수만 있는 함수
void calcul_sign(int num1, int num2)
{
	int result = num2 - num1;
	if (result < 0)
		printf("기호는 -\n");
	else if (result == 0)
		printf("기호는 0\n");
	else
		printf("기호는 +\n");


}
int main()
{
	//calcul_sign(7, 2);
	int n1, n2;
	printf("첫번째수?");
	scanf_s("%d", &n1);
	printf("두번째수?");
	scanf_s("%d", &n2);
	calcul_sign(n1, n2);

	return 0;
}