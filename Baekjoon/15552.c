#include<stdio.h>
int main()
{
	int t;
	scanf("%d", &t);
	int i = 0;
	while (i < t)
	{
		int a, b;
		scanf("%d %d", &a, &b);
		printf("%d\n", a + b);
		i++;
	}
	return 0;
}