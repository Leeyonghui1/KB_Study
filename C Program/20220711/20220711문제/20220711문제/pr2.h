#pragma once
#include<stdio.h>
int time()
{
	int t,h,m;
	m = 0;
	printf("Sec(초)를 입력 : ");
	scanf_s("%d", &t);
	if (t >= 3600)
	{
		printf("오류");
		return m;
	}
	if (t % 60 == 0)
	{
		h = t / 60;
		printf("%d분\n", h);
	}
	else
	{
		h = t / 60;
		m = t % 60;
		printf("%d분 %d초", h, m);
	}
}