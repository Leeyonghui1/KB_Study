#include<stdio.h>
void swap(int* a, int* b, int* c)
{
	int temp = *a;
	*a = *c;
	*c = *b;
	*b = temp;
}


int main()
{
	int a, b, c;
	scanf_s("%d %d %d", &a, &b, &c);
	printf(" Ω√¿€ a = %d, b = %d, c = %d\n", a, b, c);
	swap(&a, &b,&c);
	printf(" ≥° a = %d, b = %d, c = %d\n", a, b, c);
	





	return 0;
}