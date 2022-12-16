#include<stdio.h>
//2. 반환형과 매개변수가 둘다있는 함수

int MathPower(int num)  //선언
{
	if (num <= 0)
		return 0;

	return num * num;
}
int main()
{
	int result = MathPower(5);
	printf("5의 제곱은 %d입니다.\n", result);
	printf("3의 제곱은 %d입니다.\n", MathPower(3));
	result = MathPower(-7);
	printf("result = %d\n", result);
	
	return 0;

}