#include<stdio.h>
// 변수의 종류
// 전역변수(글로벌변수)
// 지역변수(중괄호 안에 있는 변수, 매개변수)
// 정적변수
// (참고)정적변수 안에 지역변수,전역변수도 있다

// 전역변수 : 함수 바깥에 선언
int g = 0;
static int s1 = 0; // 정적변수는 'static' 키워드가 붙음

void upNum(int a, int b)  // a,b 매개변수(=지역변수)는 함수 끝나면 사라짐
{
	static int s2 = 0;           //static이 붙은 지역변수는 함수가 끝나면 어떻게 될까?
	a++;
	b++;
	s2++;
	g++;
	printf("%d %d %d %d\n", a, b, g, s2);

}

int main()
{
	// 지역변수는 함수나 중괄호 안에 선언
	int num = 10;
	if (num > 0)
	{
		int n = 100; // 변수 n은 num이 양수여야 존재하는 변수
		upNum(num, n);
		upNum(num, n);
		upNum(num, n);
		printf("n=%d, num=%d\n", n, num);
	}
	g++; //전역변수는 함수 어디에서든지 쓸 수 있다.
	printf("g=%d\n", g);

	return 0;
}