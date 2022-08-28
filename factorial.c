#include <stdio.h>

long factorial(int);

int main()
{
	int n;
	printf("값을 입력하세요 :");
	scanf_s("%d", &n);
	printf("당신이 입력한 값의 팩토리얼 값은\n");
	printf("%2d! = %1d\n", n, factorial(n));
	printf("입니다.");
	return 0;
}

long factorial(int number) {
	if (number <= 1)
		return 1;
	else
		return (number * factorial(number - 1));
}