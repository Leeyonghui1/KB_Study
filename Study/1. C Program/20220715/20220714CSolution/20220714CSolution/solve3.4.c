#include<stdio.h>
// 반환형(리턴값), 매개변수 없는 형태
/*3*/
void greenChar()
{
	system("color 0a");
}
/*4*/
void changeColor(char a, char b)
{
	char color[9] = "color ";
	//[0] = 'c' , [1] = 'o' , [2] = 'l'
	//[3] = 'o', [4] = 'r' , [5] = ' '
	color[6] = a;
	color[7] = b;
	color[8] = NULL;
	system(color);
}
int main()
{
	// system("color 0a");   /*3*/
	greenChar();   //3
	
	/*4*/
	printf("첫번째 문자 입력");
	char a;// = getchar();
	scanf_s("%c",&a,1);
	rewind(stdin);
	printf("두번째 문자 입력");
	char b;// = getchar();
	scanf_s("%c",&b,1);
	changeColor(a, b);

	return 0;
}