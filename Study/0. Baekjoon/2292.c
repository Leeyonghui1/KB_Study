#include<stdio.h>
int main()
{
	int N;
	scanf("%d", &N);
	int max = 1;
	int count = 0;
	while (1)
	{
		max = max + (6 * count);
		if (max < N)
			count++;
		else
		{
			printf("%d", count+1);
			break;
		}
	}
	return 0;
}