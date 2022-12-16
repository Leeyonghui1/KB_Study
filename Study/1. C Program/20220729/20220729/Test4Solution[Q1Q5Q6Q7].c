//07.28 실습4 문제 풀이
#include<stdio.h>
//1. 2D 게임 캐릭터 좌표 저장하는 구조체
//1개의 변수가 1개 이상의 값을 관리할 때 - > "구조체"
/*  구 조 체
 -사용자가 직접 만든 자료형
 - 크기 다양
 - 배열이랑 다르다
 - 1개의 변수가 여러 가지의 속성을 가짐
*/
struct Game2DPos
{
	int x;  // 속성 1
	int y;  // 속성 2
}typedef Game2D;
int main()
{
	// struct Game2D p1 = { 10,20 }; // 이건 왜 오류가 나는가?
	// 구조체 변수에 값 넣는 방법 1
	struct Game2DPos p1 = { 10,20 }; 
	// 구조체 변수 선언 하면서 데이터 입력(데이터는 순서대로 x , y 에 들어감)
	printf("size p1 =%d\n", sizeof(p1)); // 사이즈 : 8 - 구조체에는 int형 속성이 2개, int는 4byte
	printf("방법1 결과 y = %d, x = %d\n", p1.y, p1.x); // 20 10

	// 구조체 변수에 값 넣는 방법 2
	struct Game2DPos p2 = { .y = 30,.x = 40 };
	// 구조체 변수 선언 하면서 구조체 속성을 고르면서 데이터 입력(순서 상관없이 특정 속성값 입력가능)
	printf("방법2 결과 x = %d, y = %d\n", p2.x, p2.y); // 40 30

	// 구조체 변수에 값 넣는 방법 3
	struct Game2DPos p3;
	p3.x = 50;
	p3.y = 60;
	// 구조체 변수 선언 하면서 구조체 속성을 고르면서 데이터 입력(순서 상관없이 특정 속성값 입력가능)
	// 2번방법과 달리 구조체 변수 선언 이후에 원할 때 데이터 입력 가능
	printf("방법3 결과1 x = %d, y = %d\n", p3.x, p3.y); // 50 60


	// 구조체 변수에 값 넣는 방법 4
	struct Game2DPos p4;
	scanf_s("%d %d", &p4.x, &p4.y);
	//scanf_s함수이용한 원하는 값 입력가능
	printf("방법4 결과 x = %d, y = %d\n", p4.x, p4.y);
	p3.y = 50;
	p3.x = 60;
	printf("방법3 결과2 x = %d, y = %d\n", p3.x, p3.y); //60 50

    
	return 0;
}