#include<stdio.h>
#define MAX 1024 // ��ũ�� �������
// �迭ũ�⸦ �̸� ����
int main()
{
	//���ĺ� ���� ������ġ
	char input[MAX] = { NULL, };
	printf("���ڿ� �Է��ϼ���.\n");
	gets(input);
	int charAlpha[26] = { 0 };

	for (int i = 0; input[i] != NULL; i++) 
	{
		if (input[i] >= 'A' && input[i] <= 'Z')
			input[i] += ('a' - 'A');
		if (input[i] < 'a' || input[i] > 'z')
			continue; //�����ڸ� üũ ������ ��ŵ
		else
		{
			if (charAlpha[input[i] - 'a'] == 0) //���ʵ����
				charAlpha[input[i] - 'a'] = i + 1;
			//ù��° ����� 0�̾ƴ� 1�� ���;��ϹǷ�
			//i+1�̾���Ѵ�
		}
	}

	for (int i = 0; i < 26; i++)
	{
		if (charAlpha[i] != 0)
			printf("%c�� %d��° ���ʵ���\n", 'a' + i, charAlpha[i]);
	}
	return 0;
}