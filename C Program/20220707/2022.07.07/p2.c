#include<stdio.h>
int main()
{
	//���ĺ� ���� Ƚ��
	char input[1024] = { NULL, }; //input �迭�� NULL������ ä���
	//input[1024] = { 1, }; �� ù��°ĭ���� '1'
	printf("���ڿ� �Է��ϼ���.\n");
	gets(input);
	int charAlpha[26] = { 0 }; // �迭 ���� '0'����ä��
	// = { 0 }������ �����Ⱚ
	// �� ���縵�� ������ �ǹ�
	// [0]��10-> a�� 10�� , [3]��5->d��5��
	for (int i = 0; input[i] != NULL; i++)
	{
		if (input[i] >= 'A' && input[i] <= 'Z')
		{
			input[i] += ('a' - 'A');
		}
		if (input[i] < 'a' || input[i] >'z')
		{
			// continue;
			printf("����\n");
			return 0;
		}
		else {
			charAlpha[input[i] - 'a']++;
		}
	}
	for (int i = 0; i < 26; i++)
	{
		if (charAlpha[i] != 0) {
			printf(" '%c'�� %d�����Դϴ�.\n",
				'a' + i, charAlpha[i]);
		}
	}

	return 0;
}