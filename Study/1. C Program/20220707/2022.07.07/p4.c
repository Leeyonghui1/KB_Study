#include<stdio.h>
int main()
{
	//�������� ����       ������ȣ
	//1                   1
	//2~7                 2
	//8~19                3
	//20~37               4
	//36~61               5
    // max2 = max1 + (6*count(������ȣ))
	int input;
	scanf_s("%d", &input);
	int max = 1; //�����ȼ���
	int count = 0; // ������ȣ
	while (1)
	{
		//�׷��� �þ�鼭 �ִ񰪺���
		max = max + (6 * count);
		if (max < input)
		{
			count++;
			continue;
		}
		else
		{
			printf("%d��/�� %d�� �׷�\n", input, count + 1);
			break;
		}
	}

	


	return 0;
}