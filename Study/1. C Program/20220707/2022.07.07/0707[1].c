#include<stdio.h>
int main()
{
	//������
	/*
	int a = 10;
	int* ptr_a = &a;
	//���� ������
	int** pp_aa = &ptr_a; // �ּҰ��� �ּҸ� ����
	*/
	// ���������� �̿��ؼ� �迭�� �ִ� �� ����Ű��
	// ex)4ĭ¥�� 1���� �迭 3�� �����ϴ� 2�����迭
	int numbers[3][4] = {
		{10, 20, 30, 40},
		{50, 60, 70, 80},
		{90, 100, 110, 120}
	}; 
	//int** ptr = numbers;  //�ҷ��ڵ�
	printf("%d\n", numbers[0][0]);
	//printf("%d", ptr[0][0]); // �ҷ��ڵ�
	//4ĭ¥�� �迭�� ����Ű�� �迭������ ��������
	int(*nptr)[4] = numbers;
	printf("%d\n", nptr[0][0]);

	//�迭�� ������, ������ �� ���� ���̸� �׾ȿ� �� �� ��°���
	printf("%d\n", **numbers); //10
	printf("%d\n", **(numbers+1)); //50
	printf("%d\n", *(*numbers+1)); //20

	/*
	//�迭
	int numbers[5] = { 1,20,50,30,4 };
	//�������迭 = ���� �����Ϳ��� �Ļ�
	int multi_dim[3][2] //2�����迭 3��2��
		= {
			{3,4}, {1,2}, {99,22}
	       };

	

	// 305ȣ �л�����
	int room[5] = { 30, 22, 25, 29, 27 };
	// 3���� ���� 3��, �� ���Ǹ��� �л�����
	int r_room[3][5];
	//int** rr = r_room;
	for (int i = 0; i < 3; i++)
	{
		for (int j = 0; j < 5; j++)
			r_room[i][j] = i + j + 10;
		    
	}
	for(int i=0;i<3;i++)
	{
		for (int j = 0; j < 5; j++)
			printf("%d\n", r_room[i][j]);
		   
	}
	*/
	return 0;

}