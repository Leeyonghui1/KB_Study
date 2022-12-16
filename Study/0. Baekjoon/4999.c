#include<stdio.h>
int main()
{
	char a[1001] = { 0, };
	char b[1001] = { 0, };
	scanf("%s %s", a, b);
	int count_A = 0;
	int count_B = 0;
	for (int i = 0; i < 1001; i++)
	{
		if (a[i] == 'h')
			count_A = i;
		if (b[i] == 'h')
			count_B = i;
	}
	if (count_A >= count_B)
		printf("go");
	else
		printf("no");
	return 0;
}