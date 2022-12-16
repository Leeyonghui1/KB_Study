#include<stdio.h>
int main()
{
	int T,H,W,N;
	scanf("%d", &T);
	for (int i = 0; i < T; i++)
	{
		// H : Ãþ¼ö 
		// W : È£¼ö
		// N : ¸î¹øÂ°¼Õ´Ô
		scanf("%d %d %d", &H, &W, &N);
		// ¼Õ´ÔÀÇ Ãþ¼ö
		int x = N % H;
		if (x == 0)
			x = H;
		// ¼Õ´ÔÀÇ È£¼ö
		int y = (N / H) + 1;
		if (N % H == 0)
			y -= 1;
		printf("%d%02d\n", x, y);
	}
	return 0;
}