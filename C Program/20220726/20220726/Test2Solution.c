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


	//�������� �غ���
	swap(&a, &b, &c); //������ �����غ���
	swap(&a, &b, &c);
	printf("%d %d %d\n", a, b, c);

	//do while�� �� �� ��쿣
	//�� �� �������� �����ϰ� ����
	//�� ������ �ݺ������� ���������� ���ƿ� ���θ�
	//üũ ����
	//do while�� �� ����
	//ó���� �翬�� aa,bb,cc�� aa2,bb2,cc2�� ����
	//�Ȱ���.
	//�׷��� �׳� while���� �ٷ� ����
	//������ do-while�� ���� while ������ ���
	//������ �� ���� ������
	//�׸��� �� �������� ���ǿ� ���� �ݺ����� ����.
	do
	{
		swap(&a, &b, &c);
		printf("a=%d b=%d c=%d\n", a, b, c);
	} while (aa != a && bb != b && cc != c);
	printf("%d %d %d\n", a, b, c);


	return 0;
}