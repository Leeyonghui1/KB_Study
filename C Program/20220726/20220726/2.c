#include<stdio.h>
void noSwap(int a, int b)  //  main 값 변화 없음
{                          // 매개변수로 "값"을 복사해오므로
	int temp = a;          // main이랑 전혀 관계가 없음
	a = b;
	b = temp;
}

void yesSwap(int* a, int* b) // main 값 변화
{                             // 매개변수로 "위치"를 가져오므로
	int temp = *a;            // '*'을 이용해 해당 위치에 접근해 값 변경 가능
	*a = *b;
	*b = temp;
}

int main()
{
	int a = 10;
	int b = 100;
	printf(" 시작 a = %d, b = %d\n", a,b);
	noSwap(a, b);
	printf(" noSwap a = %d, b = %d\n", a,b);
	yesSwap(&a, &b); 	
	printf(" Swap a = %d, b = %d\n", a,b);
	
	int* pa = &a;
	int* pb = &b;
	yesSwap(pa, pb); // 매개변수로 주소값을 넣어준단
	printf(" Swap a = %d, b = %d\n", a,b);

	return 0;
}