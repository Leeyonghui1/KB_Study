#include<stdio.h>
// ��ȯ��(���ϰ�), �Ű����� ���� ����
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
	printf("ù��° ���� �Է�");
	char a;// = getchar();
	scanf_s("%c",&a,1);
	rewind(stdin);
	printf("�ι�° ���� �Է�");
	char b;// = getchar();
	scanf_s("%c",&b,1);
	changeColor(a, b);

	return 0;
}