#include<stdio.h>
int main()
{
	int count[10] = { 0 };
	int a, b, c;
	scanf("%d %d %d", &a, &b, &c);
	int sum = a * b * c;
	int num;
	while (sum > 0)
	{
		num = sum % 10;
		count[num]++;
		sum /= 10;
	}
	for (int i = 0; i < 10; i++)
		printf("%d\n", count[i]);
	return 0;
}