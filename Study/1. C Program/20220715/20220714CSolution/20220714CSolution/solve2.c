#include<stdio.h>
/*2.*/
int clock(int Sec)
{
	if (Sec >= 3600)
	{
		printf("1�ð� �̻�!\n");
		return -1;
	}
	printf("%d�� %d��\n", Sec / 60, Sec % 60);
	return Sec / 60;
}
int main()
{
	clock(123);
	clock(4000);
	int result = clock(123);
	int result1 = clock(4000);

	printf("result = %d\n", result);
	printf("result = %d\n", result1);

	printf("�� �Է��ϼ���.");
	int s;
	scanf_s("%d", &s);
	clock(s);

	return 0;
}