#include<stdio.h>	
int main()
{
	
	// scanf_s와 printf도 함수
	int result = printf("Hello"); //"printf"의 기능 : 값을 출력, 반환값 : 출력하는 변수의 'byte'값
	printf("\n%d\n", result);    
	//ex] Hello -> 5 , 안녕하세요 -> 10
	// 5,10은 반환값이라고 부르며 반환값은 return = x;로 표기

	int n, m;
	int a = scanf_s("%d", &n); // "scanf_s"의 기능 : 값을 입력받음 , 반환값(=return값) : 입력받을 변수의 개수
	int b = scanf_s("%d %d", &n, &m);
	result = printf("%d %d", n, m);
	printf("\nresult=%d, a=%d, b=%d\n", result, a, b);
	

	
	
	return 0;



}