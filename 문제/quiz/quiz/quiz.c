#include <stdio.h>
#include <Windows.h>

int first_quiz(int num1, int num2, int num3) {

	int sum = 0;

	for (int i = num1; i <= num2; i++) {
		if (i % num3 != 0) {
			sum += i;
		}
	}

	return sum;
}
int second_quiz(sec) {
	int h;
	int m;

	if (sec > 3600) {
		printf("3600���� Ů�ϴ� error\n");
	}
	else {
		h = sec / 60;
		m = sec % 60;

		printf("%d�� %d��\n", h, m);

	}

	return m;
}
void third_quiz() {
	system("color A0");
	printf("�������� �ʷϻ����� �ٲ�����ϴ�. A0\n");
}
void fourth_quiz() {

	char input[10] = "color ";

	printf("�����Է����ּ��� ex(3E)\n");
	rewind(stdin);
	scanf_s("%c", &input[6], sizeof(input[6]));
	rewind(stdin);
	scanf_s("%c", &input[7], sizeof(input[6]));
	rewind(stdin);
	input[8] = '\0';
	system(input);

}
int five_quiz() {
	int sum = 0;
	char c;
	for (int i = 1; i <= 100; i++) {
		sum += i;
		c = i != 100 ? '+' : NULL;
		printf("%d%c", i, c);
	}
	printf("\n");
	printf("total=%d", sum);
}
int sixth_quiz(a, b) {
	int sum = 1;
	for (int i = a; i <= b; i++) {
		sum = sum * i;
		printf("%d", i);

		if (i != b) {
			printf("x");
		}

	}

	return sum;
}
int seven(int a, int b, char c7) {
	int sum;
	if (c7 == '-') {
		printf("�����Դϴ�\n");
		return 0;
	}
	else {

	if (c7 == '*' || 'x' || 'X') {
	sum = 1;
	}
	else {
	sum = 0;
	}
	}
	for (int i = a; i <= b; i++) {

		if (c7 == '+') {
			sum += i;
		}
		else if (c7 == '*' || 'x' || 'X') {
			sum *= i;
		}
		

	}

	return sum;
	
}
int eight_quiz(int number) {
	int sum = 1;
	for (int i = 1; i <= number; i++) {
		sum *= i;
	}
	return sum;

}
int nine_quiz(n, m, sum) {
	if (n == 0) {
		printf("%d", sum);
		return 0;
	}
	printf("%d", m);
	if (n == 1) {
		printf("=");
	}
	else {
		printf("*");

	}
	sum = sum * m;
	m++;
	n--;
	nine_quiz(n, m, sum);

}
int ten_quiz(n) {

	if (n == 0) {
		return 0;
	}
	else if (n == 1) {
		return 1;
	}

	else {
		return ten_quiz(n - 1) + ten_quiz(n - 2);
	}

}


int main() {
	
	int a, b, c;
	printf("ù ��° ���� : a���� b������ (c�� ��) ��\n a, b, c�� �Է�\n");
	scanf_s("%d %d %d", &a, &b, &c);
	int result1 = first_quiz(a, b, c);
	printf("%d\n", result1);



	int sec;
	printf("�� ��° ���� : �� �Է� �޾Ƽ� h��m�� ���\nsec�� �Է�\n");
	scanf_s("%d", &sec);
	int result2 = second_quiz(sec);
	printf("2������ ��ȯ���� %d�Դϴ�\n", result2);


	third_quiz();

	fourth_quiz();

	five_quiz();

	printf("\n������° ���� a���� b���� ���� ���Ѵ�\n�μ��� �Է�\n");
	int num1, num2;
	scanf_s("%d %d", &num1, &num2);

	printf("\ntotal = %d\n", sixth_quiz(num1, num2));

	
	int num3, num4;
	printf("�ϰ���° ���� a���� b������ ���̳� ���� ���Ѵ�\n�� ���� �Է����ּ���\n");
	rewind(stdin);
	scanf_s("%d %d", &num3, &num4);

	printf("��ȣ�� �Է����ּ��� +, *, -\n");
	char c7;
	rewind(stdin);
	scanf_s("%c", &c7, sizeof(c7));
	int result7 = seven(num3, num4, c7);
	if (c7 != '-') {
	printf("%d�� %d������ %c�� ����? %d\n", num3, num4, c7, result7);
	}
	
	printf("������° ���� 1���� n������ ���� �� \nn�� �Է��ϼ���\n");
	int n;
	scanf_s("%d", &n);
	printf("1���� n������ �� = %d\n", eight_quiz(n));

	printf("��ȩ��° ����n������ �� ����Լ�\n n �Է�\n");

	int nCode;
	int init = 1;
	int sum = 1;
	scanf_s("%d", &nCode);

	nine_quiz(nCode, init, sum);
	


	int p;
	printf("\n10������ n�� �Է����ּ���\n");

	scanf_s("%d", &p);

	printf("%d", ten_quiz(p));
	

	return 0;

}