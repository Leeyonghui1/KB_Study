#pragma once
#include<stdio.h>
int calcul()
{
	int a, b, c ;

	
	printf("a = ");
	scanf_s("%d",&a);
	printf("b = ");
	scanf_s("%d", &b);
	printf("c = ");
	scanf_s("%d", &c);
	
	int sum = 0;
	for (int i = a; i <= b; i++)
	{
		if (i % c == 0)
			continue;
		sum += i;
	}
	printf("sum=%d\n", sum);
	
}