#include<stdio.h>
struct coordinate
{
	int x;
	int y;
	int z;
}typedef coordinate;

struct ani_hospital
{
	char animal[100];

}typedef animal;
int main()
{
	// 1.
	coordinate ch1;
	ch1.x = 10;
	ch1.y = 20;
	printf("%d %d\n", ch1.x, ch1.y);

	// 2.
	coordinate ch2 = { 20,20,50 };
	printf("%d %d %d\n", ch2.x, ch2.y, ch2.z);

	// 3.
	animal hp[12] = { 0 };
	strcpy(hp[0].animal,"������");
	strcpy(hp[1].animal,"��");
	strcpy(hp[2].animal,"��");
	strcpy(hp[3].animal,"����");
	gets(hp[4].animal); // ��
	gets(hp[5].animal); // ��
	gets(hp[6].animal); // ȣ����
	gets(hp[7].animal); // �䳢
	for (int i = 8; i < 12; i++)
	{
		scanf_s("%s", hp[i].animal, 100);
	}
	for (int i = 0; i < 12; i++)
	{
		printf("%s\t", hp[i].animal);
	}

	return 0;
}