#include<stdio.h>
// 4. �¾ ������ �Է��ϰ� ���̸� �����ϴ� �Լ�
int calcAge()
{
	int year;
	printf("q4)�¾ �⵵ �Է� : ");
	scanf_s("%d", &year);
	return 2023 - year;
}

// 5. �¾ ������ �Ű������� �ް� ���� �����ϴ� �Լ�
int calculAge(int year)
{
	return 2023 - year;
}

int main()
{
	// 4.
	printf("���� ���� = %d��\n", calcAge());
	
	// 5.
	int year;
	printf("q5) ����? : ");
	scanf_s("%d", &year);
	printf("���� ���� = %d��", calculAge(year));

	return 0;
}