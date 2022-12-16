#include"yourtest.h"
//yourtest.h에 있는 함수원형을 yourtest.c에 정의
//헤더파일 yourtest.h의 함수를 정의하는 파일이기에 main함수는 없어야한다

void yourTypeTest(int c)
{
	for (int i = 0; i < c; i++)
		printf("Hello\n");
}


