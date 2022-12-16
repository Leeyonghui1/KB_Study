#pragma once
#include<stdio.h>
int pattern(int n)
{
	if (n == 0)
		return 0;
	if (n == 1)
		return 1;
	if (n > 1)
		return pattern(n - 1) + pattern(n - 2);
}
