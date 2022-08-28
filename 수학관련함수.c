#include <stdio.h>
#include <math.h>

int main()
{
	int i;

	printf("i   i의 제곱  i의 세제곱\n");
	for (i = 3; i < 7; i++) {
		printf("%d\t%0.lf\t%0.lf\n", i, pow(i, 2), pow(i, 3));  //pow(x, y) = x의 y제곱
	}
	printf("\n\n");

	printf("abs(-10) == %3d\n",abs(-10));  //abs(x) = 절대값, 출력값 = 10
	printf("sqrt(81.0) == %5.2f\n",sqrt(81.0));  //sqrt(x) = 제곱근, 출력값 = 9.00
	printf("ceil(7.1) == %5.2f\n",ceil(7.1));  //ceil(x) = x보다 큰 최소값 정수, 출력값 = 8.00 
	printf("ceil(-4.3) == %5.2f\n",ceil(-4.3));  //음수도 마찬가지, 출력값 = -4.00
	printf("floor(6.9) == %5.2f\n",floor(6.9));  //floor(x) = x보다 작은 최대값 정수, 출력값 = 6.00
	printf("floor(-3.1) == %5.2f\n",floor(-3.1));  //음수도 마찬가지, 출력값 = -4.00
	return 0;
}