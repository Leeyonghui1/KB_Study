#include<stdio.h>
extern int a; //3[1].c ���� �� ���� a
extern int b; 

int main()
{
	b++; // ���⼭ �������� | 3[1].c���� static int b�� �����ؼ� 3[1].c �̿��� �������� ������
	     // java, c#, c++�� private���� ��
	a++;
	printf("%d\n", a);
	up_Print();
	return 0;

}