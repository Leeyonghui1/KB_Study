#include<stdio.h>
int main()
{
	int N, num;
	scanf("%d", &N);
	int count = 0;
	for (int i = 0; i < N; i++)
	{
		scanf("%d", &num);
		int check = 0;
		if (num == 1)
			continue;
		for (int j = 2; j < num; j++)
		{
			if (num % j == 0)
				check = 1;
		}
		if(check == 0)
			count++;
	}
	printf("%d", count);
	return 0;
}