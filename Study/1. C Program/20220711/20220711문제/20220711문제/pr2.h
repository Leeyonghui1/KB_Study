#pragma once
#include<stdio.h>
int time()
{
	int t,h,m;
	m = 0;
	printf("Sec(��)�� �Է� : ");
	scanf_s("%d", &t);
	if (t >= 3600)
	{
		printf("����");
		return m;
	}
	if (t % 60 == 0)
	{
		h = t / 60;
		printf("%d��\n", h);
	}
	else
	{
		h = t / 60;
		m = t % 60;
		printf("%d�� %d��", h, m);
	}
}