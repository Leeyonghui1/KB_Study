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
	strcpy(hp[0].animal,"¿ø¼şÀÌ");
	strcpy(hp[1].animal,"´ß");
	strcpy(hp[2].animal,"°³");
	strcpy(hp[3].animal,"µÅÁö");
	gets(hp[4].animal); // Áã
	gets(hp[5].animal); // ¼Ò
	gets(hp[6].animal); // È£¶ûÀÌ
	gets(hp[7].animal); // Åä³¢
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