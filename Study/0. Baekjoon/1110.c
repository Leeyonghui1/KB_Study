#include<stdio.h>
int main()
{
	int n;
	scanf("%d", &n);
	int compare = n;
	int a = 0;
	int b = 0;
	int sum = 0;
	int cycle = 0;
	int newNum = 0;
	a = n / 10;
	b = n % 10;
	sum = a + b;
	newNum = (b * 10) + (sum % 10);
	cycle++;
	while (compare != newNum)
	{
		a = newNum / 10;
		b = newNum % 10;
		sum = a + b;
		newNum = (b * 10) + (sum % 10);
		cycle++;
	}
	printf("%d", cycle);
	return 0;
}
