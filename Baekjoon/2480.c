#include<stdio.h>
int main()
{
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	int max;
	for (int i = 0; i < 3; i++)
	{
		if (a > b && a > c)
			max = a;
		else if (b > a && b > c)
			max = b;
		else
			max = c;
	}
	if (a == b && b == c)
		printf("%d", 10000 + (a * 1000));
	else if (a == b && a != c)
		printf("%d", 1000 + (a * 100));
	else if (a != b && a == c)
		printf("%d", 1000 + (a * 100));
	else if (b != a && b == c)
		printf("%d", 1000 + (b * 100));
	else if (a != b && b != c && c != a)
		printf("%d", max * 100);
	else
		return 0;
}