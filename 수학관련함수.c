#include <stdio.h>
#include <math.h>

int main()
{
	int i;

	printf("i   i�� ����  i�� ������\n");
	for (i = 3; i < 7; i++) {
		printf("%d\t%0.lf\t%0.lf\n", i, pow(i, 2), pow(i, 3));  //pow(x, y) = x�� y����
	}
	printf("\n\n");

	printf("abs(-10) == %3d\n",abs(-10));  //abs(x) = ���밪, ��°� = 10
	printf("sqrt(81.0) == %5.2f\n",sqrt(81.0));  //sqrt(x) = ������, ��°� = 9.00
	printf("ceil(7.1) == %5.2f\n",ceil(7.1));  //ceil(x) = x���� ū �ּҰ� ����, ��°� = 8.00 
	printf("ceil(-4.3) == %5.2f\n",ceil(-4.3));  //������ ��������, ��°� = -4.00
	printf("floor(6.9) == %5.2f\n",floor(6.9));  //floor(x) = x���� ���� �ִ밪 ����, ��°� = 6.00
	printf("floor(-3.1) == %5.2f\n",floor(-3.1));  //������ ��������, ��°� = -4.00
	return 0;
}