#include<stdio.h>	
int main()
{
	
	// scanf_s�� printf�� �Լ�
	int result = printf("Hello"); //"printf"�� ��� : ���� ���, ��ȯ�� : ����ϴ� ������ 'byte'��
	printf("\n%d\n", result);    
	//ex] Hello -> 5 , �ȳ��ϼ��� -> 10
	// 5,10�� ��ȯ���̶�� �θ��� ��ȯ���� return = x;�� ǥ��

	int n, m;
	int a = scanf_s("%d", &n); // "scanf_s"�� ��� : ���� �Է¹��� , ��ȯ��(=return��) : �Է¹��� ������ ����
	int b = scanf_s("%d %d", &n, &m);
	result = printf("%d %d", n, m);
	printf("\nresult=%d, a=%d, b=%d\n", result, a, b);
	

	
	
	return 0;



}