#include <stdio.h>

double sum(double g[], int n);
void printarray(double g[], int n);

int main()
{
	int i = 0;
	double x[5];

	int arraysize = sizeof(x) / sizeof (x[0]); //배열원소의 수 계산식
	printf("실수 5개의 값을 입력하세요. \n");
	for (i = 0; i < arraysize; i++) {
		printf("x[%d] = ", i);
		scanf_s("%lf", &x[i]);
	}
	printf("\n입력한 자료값은 다음과 같습니다.\n");
	printarray(x, arraysize);
	printf("함수에서 구한 합은 %.3lf 이다. \n", sum(x, arraysize));
	return 0;
}
//배열값의 합 구하는 함수
double sum(double g[], int n)
{
	int i;
	double total = 0;

	for (i = 0; i < n; i++)
		total += g[i];

	return total;
}
//배열값을 모두 출력하는 함수
void printarray(double g[], int n)
{
	int i;

	for (i = 0; i < n; i++)
		printf("x[%d] = %.2lf\n", i, g[i]);
	printf("\n");
}