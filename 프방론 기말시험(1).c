#include <stdio.h>					//(1)번 문제지 1번문제
										 //1에서 100까지의 합
int main()
{
	int i, a = 0;
	for (i = 1; i <= 100; i++) {
		a += i;
	}
	printf("총합 : %d", a);
	return 0;
}

#include <stdio.h>					//2번문제
										//임의의 정수를 나눌 수 있는 값 구하기
int main()
{
	int i, a;
	printf("임의의 정수를 입력.");
	scanf_s("%d", &a);
	for (i = 1; i <= a; i++) {
		if (a%i == 0) {
			printf("%d\n",i);
		}
	}
	return 0;
}

#include <stdio.h>					//3번문제

int main()
{
	int i, a = 0;
	for (i = 1; i <= 100; i++) {
		if (i % 2 == 0)
			a -= i;
		else
			a += i;
	}
	printf("%d", a);
	return 0;
}

#include <stdio.h>					//4번문제
int main() {
	int A[5][5], m = 0, n = 0, k = 1;
	for (m = 0; m <= 4;) {
		if (n > 4)
		{
			m += 1;
			n = 0;
		}
		A[m][n] = k;
		k += 1;
		n += 1;
	}
	for (m = 0; m < 5; m++) {
		for (n = 0; n < 5; n++)
			printf("%2d\t", A[n][m]);
		printf("\n\n");
	}
	return 0;
}

#include <stdio.h>					//5번문제

int main()
{
	int A[10], a, i;
	printf("1000이하의 정수를 입력하세요.");
	scanf_s("%d",&a);
	for (i = 0; i < 9; i++) {
		A[i] = a % 2;
		a = a / 2;
		printf("A[%d] : %d\n", i, A[i]);
	}
	return 0;
}

#include <stdio.h>					//6번문제

int main()
{
	int a = 1, b = 1, c = 1, count = 0;
	for (c = 1; c <= 7; c++) {
		for (b = 1; b <= 10; b++) {
			for (a = 1; a <= 15; a++) {
				if (a * 200 + b * 300 + a * 400 == 3000) {
					printf("200원짜리 %2d개\t 300원짜리 %2d개\t 400원짜리 %2d개\n", a, b, c);
					count += 1;
				}
			}
		}
	}
	printf("경우의 수는 %d개 입니다.\n", count);
	return 0;
}

#include <stdio.h>					//7번문제

int main()
{
	int a = 0, b = 1, c = 0, t = 0;
	double s = 1;
	printf("%d\n%d\n", a, b);
	for (t = 0; t < 48; t++) {
		c = a + b;
		a = b;
		b = c;
		printf("%d\n", c);
		s += c;
	}
	printf("%0.lf\n", s);
	return 0;
}

#include <stdio.h>					//8번문제(못품)

int main()
{
	int a[6] = { 12, 8, 10, 6, 25, 15 }, i = 0, j = 1, num = 0;
	for (i = 0; i <= 5; i++) {
		for (j = 1; j <= 6; j++) {
			if (a[i] > a[j]) {
				num = a[i];
				a[i] = a[j];
				a[j] = num;
			}
			j += 1;
		}
		i += 1;
		j = i + 1;
	}
	for (i = 0; i <= 5; i++) {
		printf("%d\t", a[i]);
	}
	return 0;
}