//2. 함수 원형(헤드)와 함수 정의 분리하기
#include<stdio.h>
#include"mytest.h" //3-1. 새로운 헤더파일생성
#include"yourtest.h" //3-2. 새로운 헤더파일생성

void test();  //함수 원형(헤드) - 반환형 매개변수 형태
int main()
{
	test();
	mytest(); // mytest.h에서 만든 함수 호출
	yourTypeTest(10); //yourtest.c에서 함추 호출
}
void test()   // 함수 정의 !! 정의에는 ';(세미클론)' 안씀
{
	printf("함수 테스트\n");
}

/*
함수선언
1. 함수선언을 main위에 적는다.
2. 함수의 원형(헤드)부분만 main위에 적고 정의는 main 아래에 적는다.
3-1. 새로운 헤더파일(mytest.h)에 함수를 정의하고 main에서 함수호출
3-2. 새로운 헤더파일(yourtest.h)에 함수의 원형(헤드)만
     함수의 정의는 다른 파일(yourtest.c)에 적고 main에서 함수호출      

! 주의사항 !
하나의 헤더 파일안에서 함수정의 방식이 동일해야한다.
ex) 현재 mytest.h 방식과 yourtest.h방식을 하나의 헤더파일에 같이 쓸수 없다.
    같이 쓸려면 mytest.h방식 or yourtest.h방식 중 하나로 통일해서 하나의 헤더파일로 써야함.
*/