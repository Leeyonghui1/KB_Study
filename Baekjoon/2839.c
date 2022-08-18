#include<stdio.h>
int main()
{
	int N;
	scanf("%d", &N);
	int bag = 0;

	while (N > 0)
	{
		if ((N % 5) == 0)
		{
			N -= 5;
			bag++;
		}
		else if ((N % 3) == 0)
		{
			N -= 3;
			bag++;
		}
		else if (N > 5)
		{
			N -= 5;
			bag++;
		}
		else
		{
			bag = -1;
			break;
		}
	}
	printf("%d", bag);
	return 0;
}