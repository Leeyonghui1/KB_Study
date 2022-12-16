#include<stdio.h>
extern int a; //3[1].c 에서 온 변수 a
extern int b; 

int main()
{
	b++; // 여기서 문제생김 | 3[1].c에서 static int b로 선언해서 3[1].c 이외의 공간에서 사용못함
	     // java, c#, c++의 private같은 것
	a++;
	printf("%d\n", a);
	up_Print();
	return 0;

}