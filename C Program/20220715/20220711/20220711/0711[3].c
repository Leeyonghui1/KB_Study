#include<stdio.h>
//2. ��ȯ���� �Ű������� �Ѵ��ִ� �Լ�

int MathPower(int num)  //����
{
	if (num <= 0)
		return 0;

	return num * num;
}
int main()
{
	int result = MathPower(5);
	printf("5�� ������ %d�Դϴ�.\n", result);
	printf("3�� ������ %d�Դϴ�.\n", MathPower(3));
	result = MathPower(-7);
	printf("result = %d\n", result);
	
	return 0;

}