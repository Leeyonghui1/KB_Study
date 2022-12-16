#pragma once
#include<stdio.h>
int pro2(int n)
{
	if (n == 1)
		return 1;
	return n * pro2(n - 1);	
}