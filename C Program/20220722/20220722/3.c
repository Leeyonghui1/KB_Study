#include<stdio.h>
#include<stdlib.h> // ���� �迭�Ҷ�
// malloc -> �޸� �ʱ�ȭ�� �ȵ�
// calloc -> 0���� �ʱ�ȭ����
int main()
{
	// 10ĭ¥�� �迭, ���� �����Ⱚ�� ���ִ�(�ڵ��ʱ�ȭ�� �ȵǾ��ִ�) 
	int* dynamic_arr = (int*)malloc(3 * sizeof(int));   // 'malloc'�� '(int*)' ��������
	for (int i = 0; i < 3; i++)
		printf("%d\n", dynamic_arr[i]);
	
	int size;
	printf("�迭 ������ ����");
	scanf_s("%d", &size);
	int* dynamic_arr2 = (int*)malloc(size * sizeof(int));
	// dynamic_arr2 �迭�� ���� �ʱ�ȭ �ϴ� for����
	for (int i = 0; i < size; i++)
		dynamic_arr2[i] = i + 10;
	// dynamic_arr2 �迭�� ���� ������Ű�� for����
	for (int i = 0; i < size; i++)
		printf("%d\n", dynamic_arr2[i]);


	//10ĭ¥�� ���ڹ迭, ���� 0���� �ʱ�ȭ����
	int* mynumbers = (int*)calloc(10, sizeof(int));
	for (int i = 0; i < 10; i++)
		printf("%d\n", mynumbers[i]);

	//�����޸𸮴� ���α׷��Ӱ� �������� �Ҵ��� ���̶�
	//�� ��ٸ� free�� ���������
	//���� ������ ������ �޸� ���� (memory leak) ������ �߻�(�޸� ����)
	//���α׷��� �̴�� �����ٸ� ���� free�� �����ʿ�� ������
	//���α׷��� ��� ����ǰ�, �� �̻� �����迭�� �Ⱦ��ٸ� free�� �ؾ��Ѵ�
	
	free(mynumbers);
	free(dynamic_arr);
	free(dynamic_arr2);

	
	return 0;
}