#pragma once
#include<stdio.h>
int cal(int a, int b, int c)
{
	int sum = 0;
	int mul = 1;

	if (c == '+')
	{
		for (int i = a; i <= b; i++)
		{
			sum += i;
			if (i < b)
				printf("%d+", i);
			else
				printf("%d", i);
		}
		printf("\ntotal = %d", sum);
	}
	else if (c == '*' || c == 'x' || c == 'X')
	{
		for (int i = a; i <= b; i++)
		{
			mul *= i;
			if (i < b)
				printf("%dx", i);
			else
				printf("%d", i);
		}
		printf("\ntotal = %d", mul);
	}
	else
	{
		printf("¿¹¿Ü");
	}

}