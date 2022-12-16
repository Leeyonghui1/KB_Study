#include<stdio.h>
int fact(int num)
{
	if (num <= 1 )                //그래서 종료시점을 지정해야한다
		return 1;               
	return num * fact(num - 1);  // 종료시점이 없어서 Stack Overflow현상(무한반복계산) 발생
}
int main()
{


	printf("%d\n", fact(5));
	return 0;
}






/* 재귀함수
* 계속 함수를 호출하면 Stack Overflow현상 발생 -> 무한정호출할수는 없다
* 재귀함수 메커니즘 : 5!을 하기위해선 4!을 알아야한다 
  5! = 5 x 4!
  4! = 4 x 3!
  3! = 3 x 2!
  2! = 2 x 1!
  1! = 1
* 재귀함수는 완전히 종료되는 시점을 지정해야한다
*/