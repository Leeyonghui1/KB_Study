#include<stdio.h>
#include <stdlib.h>
#include <time.h>
#include<Windows.h>

// ��ũ�λ�� ����
#define size 6
#define max 7

// �������� ����
int lotto[size];
int sum = 0;
int average = 0;
int win_Lotto[max];
int count = 0;
int m;

void setColor(int colorNum) //�ؽ�Ʈ ���� �ֱ�
{
	SetConsoleTextAttribute(GetStdHandle(STD_OUTPUT_HANDLE), colorNum);
}

int choice_Mode()  // ��� 1,2�� �����ϼ���
{
	printf(" ���� �� �ϳ��� �����ϼ���.\n");
	printf(" 1. �̹� ȸ�� ��÷ Ȯ��\n");
	printf(" 2. ���� ȸ�� ��ȣ ����\n");
	printf(" ��� ���� (1 or 2)");
	scanf_s("%d", &m);

	return m;
}

void enter_MyNum()  // ���� �ζ� ��ȣ �Է�
{
	for (int i = 0; i < size; i++)
	{
		scanf_s("%d", &lotto[i]);
	}
}

void start_Lottery(int m)    // choice_Mode �Լ����� ���� ��ȯ�� 'm'���� �Ű������� �ϴ� �Լ�
{
	if (m == 1)   // �̹� ȸ�� �ζ� ��÷ Ȯ�� ���
	{
		system("cls");
		printf("                        �̹� ȸ�� �ζ� ��÷ ��ȣ\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			scanf_s("%d", &win_Lotto[i]);
		}
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" ���ʽ���ȣ = %d \n", win_Lotto[6]);
			}
			else
			{
				printf(" %d�� = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
	if (m == 2)  // ���� ȸ�� �ζ� ��ȣ ���� ���
	{
		system("cls");
		printf("                        ���� ȸ�� �ζ� ��÷ ��ȣ\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			scanf_s("%d", &win_Lotto[i]);
		}
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" ���ʽ���ȣ = %d ", win_Lotto[6]);
			}
			else
			{
				printf(" %d�� = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
}

void make_Lotto() // ���� �ζǹ�ȣ �����Լ�(�ߺ���������)
{
	for (int i = 0; i < size; i++)
	{   // �ζǹ�ȣ ��������
		lotto[i] = (rand() % 45) + 1;
		// �ߺ�����
		for (int j = 0; j < i ; j++)
		{
			if (lotto[i] == lotto[j])
			{
				i--;
				break;
			}
		}
	}
}

void limit_Num() // ���ڸ� ���ڴ� �ִ� 2��
{
	while (lotto[2] < 10)
	{
		lotto[2] = (rand() % 45) + 1;
	}
}

void change_OdEv()  // �ζ� ��ȣ 4��°���� ���� ȸ�� ��� Ȧ¦ ��ȭ
{
	if (win_Lotto[3] % 2 != 0)  // ���� ���� ȸ�� 4�� ���ڰ� Ȧ���ε�
	{
		if (lotto[3] % 2 != 0)  // ������ ���� ȸ�� �ζ� 4�� ���ڵ� Ȧ�����
		{
			while (lotto[3] % 2 != 0)  // ¦���� ���� �� ���� ��ȣ ���� �ݺ�
			{
				lotto[3] = (rand() % 45) + 1;
			}
		}
	}
	else              // �̿ܿ� ���� ȸ�� 4�� ���ڰ� ¦����
	{
		if (lotto[3] % 2 == 0) // ������ ���� ȸ�� �ζ� 4�� ���ڰ� ¦�����
		{
			while (lotto[3] % 2 == 0) // Ȧ���� ���� �� ���� ��ȣ ���� �ݺ�
			{
				lotto[3] = (rand() % 45) + 1;
			}
		}
	}
}

void bubble_Lotto() // ��������(������������)
{
	for (int k = 0; k < size; k++)
	{
		for (int i = 0; i < size - 1; i++)
		{
			if (lotto[i] > lotto[i + 1])
			{
				int tmp = lotto[i];
				lotto[i] = lotto[i + 1];
				lotto[i + 1] = tmp;
			}
		}
	}
}

void del_Lotto()  // �ߺ� ����
{
	for (int i = 0; i < size; i++)
	{
		for (int j = 0; j < i; j++)
		{
			if (lotto[j] == lotto[i])
			{
				i--;
				break;
			}
		}
	}
}

int check_average_Lotto() // ���� 6�� ��հ� Ȯ�� 
{
	for (int i = 0; i < 6; i++)
	{
		sum += lotto[i];
		average = sum / 6;
	}
	printf("��հ� = %d  ", average);
	return average;
}

void replay_Lotto(int average)  // ��ǥ ��հ������� 14�̻� 34����, ���� ����� �ٽ� ��ȣ ����
{
	if (average < 14 || average > 34)
	{
		for (int i = 0; i < size; i++)
		{
			lotto[i] = 0;
		}
		system("cls");
		printf("��ȣ ������ �ٽ� �����մϴ�.\n");
		printf("                            �ζ� ��÷ ��ȣ\n");
		printf("\n---------------------------------------------------------------------------\n");
		for (int i = 0; i < max; i++)
		{
			if (i == 6)
			{
				printf(" ���ʽ���ȣ = %d ", win_Lotto[6]);
			}
			else
			{
				printf(" %d�� = %d ", i + 1, win_Lotto[i]);
			}
		}
		printf("\n---------------------------------------------------------------------------\n");
	}
}

void print_Num_m1() // ���1�� ��ȣ ���
{
	for (int i = 0; i < size; i++)
	{
		printf(" %d�� = %d ", i + 1, lotto[i]);
	}
}

void print_Num_m2() // ���2�� ��ȣ ���
{
	for (int i = 0; i < size; i++)
	{
		printf("%d�� = %d ", i + 1, lotto[i]);
		if (win_Lotto[3] % 2 != 0)
		{
			if (lotto[3] % 2 != 0)
			{
				system("cls");
				printf("��ȣ ������ �ٽ� �����մϴ�.\n");
				printf("                            �ζ� ��÷ ��ȣ\n");
				printf("\n---------------------------------------------------------------------------\n");
				for (int i = 0; i < max; i++)
				{
					if (i == 6)
					{
						printf(" ���ʽ���ȣ = %d ", win_Lotto[6]);
					}
					else
					{
						printf(" %d�� = %d ", i + 1, win_Lotto[i]);
					}
				}
				printf("\n---------------------------------------------------------------------------\n");
			}
		}
		else
		{
			if (lotto[3] % 2 == 0)
			{
				system("cls");
				printf("��ȣ ������ �ٽ� �����մϴ�.\n");
				printf("                            �ζ� ��÷ ��ȣ\n");
				printf("\n---------------------------------------------------------------------------\n");
				for (int i = 0; i < max; i++)
				{
					if (i == 6)
					{
						printf(" ���ʽ���ȣ = %d ", win_Lotto[6]);
					}
					else
					{
						printf(" %d�� = %d ", i + 1, win_Lotto[i]);
					}
				}
				printf("\n---------------------------------------------------------------------------\n");
			}
		}
	}
}

int end_Lottoery() // ���� ���� ���� Ȯ��
{
	for (int i = 0; i < size; i++)
	{
		if (lotto[i] == win_Lotto[6])
		{
			setColor(2);
			printf("\n���ʽ� ��ȣ");
			setColor(7);
			printf(" ���� ");
		}
		for (int j = 0; j < size; j++)
		{
			if (lotto[i] == win_Lotto[j])
			{
				count += 1;
			}
		}
	}
	printf("\n%d�� ���� ", count);
	return count;
}

void rank_Lotto(int count)  //��� Ȯ��
{
	switch (count)
	{
	case 6:setColor(6); printf("1��"); setColor(7); printf("�Դϴ�."); break;
	case 5:setColor(2); printf("2�� or 3��"); setColor(7); printf("�Դϴ�.[");
		setColor(2); printf("���ʽ���ȣ "); setColor(7); printf("Ȯ���ϼ���] ."); break;
	case 4:setColor(9); printf("4��"); setColor(7); printf("�Դϴ�."); break;
	case 3:setColor(8); printf("5��"); setColor(7); printf("�Դϴ�."); break;
	default: setColor(4); printf("��"); setColor(7); printf("�Դϴ�."); break;
	}
}


int main()
{
	srand(time(NULL));  // ����ð��� ������ �Ͽ� ���ο� ��������
	choice_Mode();  // ��� 1,2 �����ϱ�
	start_Lottery(m); // ��÷�� �ζ� ��ȣ �Է�

	while (m == 1) // �̹� ȸ�� �ζ� ��÷ Ȯ��
	{
		printf("\n                      ���� �ζ� ��ȣ  ");
		printf("\n******************************************************************\n");

		enter_MyNum();   // ���� ��ȣ �Է�
  		print_Num_m1();    // ���� ���
		end_Lottoery();  // ���� ���� Ȯ��
		rank_Lotto(count);  // ��� Ȯ�� �� ���

		printf("\n******************************************************************\n");
		break;
	}
	while (m == 2) // ���� ȸ�� �ζ� ��ȣ ����
	{
		printf("\n                        ���� ���� �ζ� ��ȣ  ");
		printf("\n******************************************************************\n");

		sum = 0;
		average = 0;
		count = 0;

		make_Lotto();    // �ζ� ��ȣ ����
		bubble_Lotto();  // �������� ����
		change_OdEv();  // ������ ����[1] : �ζ� ��ȣ 4������ ���� ȸ�� ��� Ȧ¦ ��ȭ�ʿ�
		del_Lotto();    // �ߺ�����
		bubble_Lotto(); // �������� ����
		limit_Num();     // ������ ����[2] : �� �ڸ� ���ڴ� �ִ� 2��
		del_Lotto();    // �ߺ�����
		bubble_Lotto(); // �������� ����
		check_average_Lotto();  // ������ �ζ� ��ȣ 6���� ��հ� Ȯ��
		print_Num_m2();     // ���� ���
		printf("\n******************************************************************\n");
		replay_Lotto(average);  // ������ ����[3] : ��հ� ��ǥ������ 14�̻� 34����
		
		system("pause");
	}
	return 0;
}
