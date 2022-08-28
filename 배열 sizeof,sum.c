#include <stdio.h>

double sum(double g[], int n);
void printarray(double g[], int n);

int main()
{
	int i = 0;
	double x[5];

	int arraysize = sizeof(x) / sizeof (x[0]); //�迭������ �� ����
	printf("�Ǽ� 5���� ���� �Է��ϼ���. \n");
	for (i = 0; i < arraysize; i++) {
		printf("x[%d] = ", i);
		scanf_s("%lf", &x[i]);
	}
	printf("\n�Է��� �ڷᰪ�� ������ �����ϴ�.\n");
	printarray(x, arraysize);
	printf("�Լ����� ���� ���� %.3lf �̴�. \n", sum(x, arraysize));
	return 0;
}
//�迭���� �� ���ϴ� �Լ�
double sum(double g[], int n)
{
	int i;
	double total = 0;

	for (i = 0; i < n; i++)
		total += g[i];

	return total;
}
//�迭���� ��� ����ϴ� �Լ�
void printarray(double g[], int n)
{
	int i;

	for (i = 0; i < n; i++)
		printf("x[%d] = %.2lf\n", i, g[i]);
	printf("\n");
}