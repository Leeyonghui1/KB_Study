#include<stdio.h>
void swap(int* a, int* b, int* c)
{
	int temp = *a;
	*a = *b;
	*b = *c;
	*c = temp;
}


int main()
{
	int a, b, c;
	scanf_s("%d %d %d", &a, &b, &c);
	printf("%d %d %d\n", a, b, c);
	swap(&a, &b, &c);
	printf("%d %d %d\n", a, b, c);
	
	int aa, bb, cc;
	aa = a;
	bb = b;
	cc = c;


	//수동으로 해보기
	swap(&a, &b, &c); //일일히 변경해보기
	swap(&a, &b, &c);
	printf("%d %d %d\n", a, b, c);

	//do while을 안 쓸 경우엔
	//한 번 수동으로 변경하고 나서
	//그 다음에 반복문으로 원래값으로 돌아온 여부를
	//체크 가능
	//do while을 쓴 이유
	//처음엔 당연히 aa,bb,cc가 aa2,bb2,cc2랑 값이
	//똑같다.
	//그래서 그냥 while쓰면 바로 끝남
	//하지만 do-while을 쓰면 while 조건이 어떻든
	//무조건 한 번은 실행함
	//그리고 그 다음에는 조건에 따라서 반복문을 돈다.
	do
	{
		swap(&a, &b, &c);
		printf("a=%d b=%d c=%d\n", a, b, c);
	} while (aa != a && bb != b && cc != c);
	printf("%d %d %d\n", a, b, c);


	return 0;
}