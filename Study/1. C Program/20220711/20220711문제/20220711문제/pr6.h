#pragma once
#include<stdio.h>
int mul(int a, int b)
{
	int mul = 1;
	for (int i = a; i <= b; i++)
	{
		mul *= i;
		if (i < b)
			printf("%dx", i);
		else
			printf("%d", i);
	}
	printf("total = %d", mul);
	return mul;
}
	