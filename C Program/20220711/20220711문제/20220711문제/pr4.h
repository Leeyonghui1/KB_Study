#pragma once
#include<stdio.h>

char ColorSet(int backColor, int textColor)
{
	HANDLE handle = GetStdHandle(STD_OUTPUT_HANDLE);
	SetConsoleTextAttribute(handle, (backColor << 4) + textColor);
}
typedef enum Colorkinds
{
	������,
	�Ķ���,
	���,
	û�ϻ�,
	������,
	���ֻ�,
	�����,
	���,
	ȸ��,
	�����Ķ���,
	���ѳ��,
	����û�ϻ�,
	���ѻ�����,
	�������ֻ�,
	���ѳ����,
	�������

}Colorkinds;