#include<stdio.h>
int main()
{
	char a[80];
	int t;
	scanf("%d", &t);
	rewind(stdin);
	for (int i = 0; i < t; i++)
	{
		gets(a);
		int count = 0;
		int sum = 0;
		for (int j = 0; a[j] != '\0'; j++)
		{
			if (a[j] == 'O')
			{
				count++;
				sum += count;
			}
			else if (a[j] == 'X')
				count = 0;
			else
				continue;
		}
		printf("%d\n", sum);
	}
	return 0;
}
/* 
int main()
{
	char a[80];
	int n;
	int i = 0;
	scanf("%d", &n);
	while (i < n)
	{
		scanf("%s", a);
		if (i < n)
		{
			int sum = 0;
			int count = 0;
			for (int j = 0; a[j] != NULL; j++)
			{
				if (a[j] == 'O')
				{
					count++;
					sum += count;
				}
				if (a[j] == 'X')
				{
					count = 0;
				}
			}
			printf("%d", sum);
			if (i != n - 1)
				printf("\n");
			i++;
		}
	}
	return 0;
}
*/