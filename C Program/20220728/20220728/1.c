#include<stdio.h>
/* 
배열에 문자열을 넣는방법
 1. 선언하자마자 넣는방법  ex) char thee[10] = "원숭이"
 2. gets or scanf
 3. strcpy
*/ 

/* 
 배열은 포인터이기 때문에 함수의 매개변수로 쓰면
 함수에서 값의 변화가 있을 때 main 배열에서도 값의 변화가 발생
  void increaseNum(int numbers[])
*/
void increaseNum(int* numbers, int size, int n) //: 사이즈를 같이 넘겨 주는게 좋다
{
	for (int i = 0; i < n; i++)
		numbers[i] += n;
}
 
int main()
{
	// 배열 : 하나의 변순를 통해 여러개의 값을 관리하는 것
	//처음에 선언하자마자 값 넣기
	int ages[5] = { 23, 25, 30, 29, 50 };
	int ages2[3] = { 10, 20, 30 };
	
	// 선언하고 나서 값 넣기
	int ages3[3];
	ages3[0] = 20;
	ages3[1] = 30;
	ages3[2] = 40;

	for (int i = 0; i < 5; i++)
	{
		printf("%d\n", ages[i]);
		ages[i] = i * i + ages[i]; // 아무 값
	}

	return 0;
}