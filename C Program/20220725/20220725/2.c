// �����ͺ��� ����
// ������ : ������ �ּ�(=��ġ)�� �����ϴ� Ÿ��
#include<stdio.h>
int changeValue(int* p, int v)
{
	int temp = *p;
	*p = v; // 'p'�� ����Ű�� �ִ� ���� 'v'�� �ٲ�
	return temp;
} 
void no_changeValue(int p, int v)
{
	p = v; 
	//no_changeValue �Լ� �ȿ� �ִ� ���� �ٲ�����
	//main�̳� �� �Լ��� ȣ���� �κ��� ������ �״���̴�.
	// �ֳĸ� 'p'�� no_changeValue �ȿ����� �����ϱ� �����̴�.
}

int main()
{
	int ex = 10;
	int* exptr = &ex;
	// int* �� intŸ�� ������ ��ġ�� �����ϴ� Ÿ��
	// �Լ��� �Ű�����, scanf, swap �Լ� ��� ���� ���

	//changeValue(exptr, 100);
	printf("return�� = %d\n", changeValue(exptr,100));
	printf("ex = %d\n", ex);

	//changeValue(exptr, 500);
	no_changeValue(ex, 500);
	printf("ex = %d\n", ex); 
	
	return 0;
}