#include<stdio.h>
/* 
�迭�� ���ڿ��� �ִ¹��
 1. �������ڸ��� �ִ¹��  ex) char thee[10] = "������"
 2. gets or scanf
 3. strcpy
*/ 

/* 
 �迭�� �������̱� ������ �Լ��� �Ű������� ����
 �Լ����� ���� ��ȭ�� ���� �� main �迭������ ���� ��ȭ�� �߻�
  void increaseNum(int numbers[])
*/
void increaseNum(int* numbers, int size, int n) //: ����� ���� �Ѱ� �ִ°� ����
{
	for (int i = 0; i < n; i++)
		numbers[i] += n;
}
 
int main()
{
	// �迭 : �ϳ��� ������ ���� �������� ���� �����ϴ� ��
	//ó���� �������ڸ��� �� �ֱ�
	int ages[5] = { 23, 25, 30, 29, 50 };
	int ages2[3] = { 10, 20, 30 };
	
	// �����ϰ� ���� �� �ֱ�
	int ages3[3];
	ages3[0] = 20;
	ages3[1] = 30;
	ages3[2] = 40;

	for (int i = 0; i < 5; i++)
	{
		printf("%d\n", ages[i]);
		ages[i] = i * i + ages[i]; // �ƹ� ��
	}

	return 0;
}