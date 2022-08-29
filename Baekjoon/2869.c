#include<stdio.h>
int main()
{
	int A, B, V;
	scanf("%d %d %d", &A, &B, &V);
	int count = 0;
	if (A >= V)
	{
		printf("1");
		return 0;
	}

	if ((V - A) % (A - B))
		count = ((V - A) / (A - B)) + 1;
	else
		count = (V - A) / (A - B);

	printf("%d", count + 1);

	return 0;
}