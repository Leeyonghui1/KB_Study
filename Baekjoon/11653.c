#include<stdio.h>
static int number;
int main()
{
	scanf("%d", &number);
	for (int i = 2; i <= number; i++)
	{
		while (number % i == 0)
		{
			number /= i;
			printf("%d\n", i);
		}
	}
	return 0;
}