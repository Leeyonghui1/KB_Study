// 0729 �ǽ� ����Ǯ��
#include<stdio.h>
#include"Mystructs.h"
int main()
{
	// 2��. �л� 1���� ����� ����. �ڵ�� �� ����, scanf�ε� �� ����
	// ����ü ������ ���ֱ� ��� (1)
	KBStudent k1 = { 50, 100, "�̵���" }; //c,java,�̸�
	printf("%d %d %s\n", k1.cScore, k1.javaScore, k1.name);
	// ����ü ������ ���ֱ� ��� (2)
	KBStudent k2 = { .cScore = 10, .javaScore =  20, "������" };
	printf("%d %d %s\n", k2.cScore, k2.javaScore, k2.name);
	// ����ü ������ ���ֱ� ��� (3)
	KBStudent k3;
	k3.cScore = 20;
	k3.javaScore = 40;
	strcpy(k3.name, "�赿��");
	printf("%d %d %s\n", k3.cScore, k3.javaScore, k3.name);
	// ����ü ������ ���ֱ� ��� (4)
	KBStudent k4;
	scanf_s("%d %d", &k4.cScore, &k4.javaScore);
	rewind(stdin);
	gets(k4.name);
	printf("%d %d %s\n", k4.cScore, k4.javaScore, k4.name);

	return 0;
}