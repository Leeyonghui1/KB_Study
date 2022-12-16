#include<stdio.h>
int main()
{
	int a, b;
	while (1)
	{
		scanf("%d %d", &a, &b);
		if (a == 0 && b == 0)
			break;
		char c = a > b ? 'a' : 'b';
		if (c == 'a')
			printf("Yes\n");
		else if (c == 'b')
			printf("No\n");
	}
	return 0;
}