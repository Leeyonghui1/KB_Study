#pragma once
#include<stdio.h>

char ColorSet(int backColor, int textColor)
{
	HANDLE handle = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(handle, (backColor << 4) + textColor);
}
typedef enum Colorkinds
{
	검은색,
	파란색,
	녹색,
	청록색,
	빨간색,
	자주색,
	노란색,
	흰색,
	회색,
	연한파란색,
	연한녹색,
	연한청록색,
	연한빨간색,
	연한자주색,
	연한노란색,
	밝은흰색

}Colorkinds;