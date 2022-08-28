#include<stdio.h>
int main()
{
	int X;
	scanf("%d", &X);
	// 그룹번호 X 값  
	// 1       1  1/1
	 
	// 2       2  1/2
	// 2       3  2/1
	
	// 3       4  3/1
	// 3       5  2/2
	// 3       6  1/3
	
	// 4       7  1/4
	// 4       8  2/3
	// 4       9  3/2
	// 4      10  4/1
	
	// 5      11  5/1 
	// 5      12  4/2 
	// 5      13  3/3  
	// 5      14  2/4
	// 5      15  1/5

	// max(그룹번호N) = max(그룹번호N-1) + 그룹번호N
	int group_Num = 1;
	int max = 0;
	while (1)
	{
		int a = max;  // a = max(그룹번호N-1)
		max = max + group_Num;
		if (X > max)
			group_Num++;
		else
		{
			if (group_Num % 2 != 0)  // 그룹번호 홀수
			{
				printf("gN = %d, max = %d, X = %d, a = %d\n", group_Num, max, X, a);
				printf("%d/%d", max - X + 1, X - a);
				break;
			}
			else  // 짝수
			{
				printf("%d/%d", X-a, max - X + 1);
				break;
			}
		}
	}
	return 0;
}