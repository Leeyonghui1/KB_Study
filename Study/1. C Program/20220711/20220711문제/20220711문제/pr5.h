#pragma once
#include<stdio.h>
void Sum()
{
	int sum = 0;
	for (int i = 1; i <= 100; i++)
	{
		sum += i;
		if (i < 100)
			printf("%d+", i);
		else
			printf("%d", i);
	}
	printf("\ntotal = %d", sum);
	return sum;
}