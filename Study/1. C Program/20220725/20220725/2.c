// 포인터복습 설명
// 포인터 : 변수의 주소(=위치)를 저장하는 타입
#include<stdio.h>
int changeValue(int* p, int v)
{
	int temp = *p;
	*p = v; // 'p'가 가르키고 있는 값을 'v'로 바꿈
	return temp;
} 
void no_changeValue(int p, int v)
{
	p = v; 
	//no_changeValue 함수 안에 있는 값은 바뀌지만
	//main이나 이 함수를 호출한 부분의 변수는 그대로이다.
	// 왜냐면 'p'는 no_changeValue 안에서만 존재하기 때문이다.
}

int main()
{
	int ex = 10;
	int* exptr = &ex;
	// int* 는 int타입 변수의 위치를 저장하는 타입
	// 함수의 매개변수, scanf, swap 함수 등에서 자주 사용

	//changeValue(exptr, 100);
	printf("return값 = %d\n", changeValue(exptr,100));
	printf("ex = %d\n", ex);

	//changeValue(exptr, 500);
	no_changeValue(ex, 500);
	printf("ex = %d\n", ex); 
	
	return 0;
}