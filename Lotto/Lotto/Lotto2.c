#include<stdio.h>
#include<time.h>
#include<stdlib.h>

int main()
{
	int lotto[7];
	srand(time(NULL));
	
	while (1)
	{
	    printf("�ζǹ�ȣ : ");
		// �ζǹ�ȣ,���ʽ���ȣ ��������
		for (int i = 0; i < 7; i++)
		{
			lotto[i] = (rand() % 45) + 1;
			// �ζǹ�ȣ �ߺ�����
		    for (int j = 0; j < i - 1; j++)
			{
				if (lotto[i] == lotto[j])
				{
				i--;
				break;
			    }				
		    }
		}

		 
		//�������� ����
		for (int k = 0; k < 6; k++)
		{
			for (int i = 0; i < 5; i++)
			{
				if (lotto[i] > lotto[i + 1]);
				{
					int temp = lotto[i];
			    	lotto[i] = lotto[i + 1];
				    lotto[i + 1] = temp;
				}
		    }
	    }
		

		//�ζǹ�ȣ ���
		for (int i = 0; i < 6 ; i++) 
		{
			printf("%3d", lotto[i]);
		}
			printf("  ���ʽ� : %3d", lotto[6]);

	    
		system("pause");
	}
}