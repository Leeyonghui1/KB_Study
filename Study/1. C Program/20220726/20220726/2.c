#include<stdio.h>
void noSwap(int a, int b)  //  main �� ��ȭ ����
{                          // �Ű������� "��"�� �����ؿ��Ƿ�
	int temp = a;          // main�̶� ���� ���谡 ����
	a = b;
	b = temp;
}

void yesSwap(int* a, int* b) // main �� ��ȭ
{                             // �Ű������� "��ġ"�� �������Ƿ�
	int temp = *a;            // '*'�� �̿��� �ش� ��ġ�� ������ �� ���� ����
	*a = *b;
	*b = temp;
}

int main()
{
	int a = 10;
	int b = 100;
	printf(" ���� a = %d, b = %d\n", a,b);
	noSwap(a, b);
	printf(" noSwap a = %d, b = %d\n", a,b);
	yesSwap(&a, &b); 	
	printf(" Swap a = %d, b = %d\n", a,b);
	
	int* pa = &a;
	int* pb = &b;
	yesSwap(pa, pb); // �Ű������� �ּҰ��� �־��ش�
	printf(" Swap a = %d, b = %d\n", a,b);

	return 0;
}