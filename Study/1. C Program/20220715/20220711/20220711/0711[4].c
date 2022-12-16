#include<stdio.h>
//3. 매개변수만 없는 함수
char calcul()
{
	printf("첫 번째 숫자 입력");
	int num1;
	scanf_s("%d", &num1);
	printf("두번째 숫자 입력");
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
	printf("기호는 %c입니다.\n", sign);
	return 0;
}