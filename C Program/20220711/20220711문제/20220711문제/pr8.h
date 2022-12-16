#pragma once
#include<stdio.h>
int pro1(int n)
{
	int mul = 1;
	for (int i = 1; i <= n; i++)
	{
		mul *= i;
		if (i < n)
			printf("%dx", i);
		else
			printf("%d", i);
	}
	printf("\ntotal = %d", mul);

}