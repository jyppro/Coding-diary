#include <stdio.h>

int increment1(int number);

int main()
{
	int number = 10;

	number = increment1(number); //앞에 반환값(number)을 넣어야만 호출후 작업을 적용시킬 수 있다.
	printf("number = %d\n\n", number);

	return 0;
}
int increment1(int number) {
	return  ++number;
}

#include <stdio.h>

void print(int n);
int increment(int n);

int main()
{
	int n = 3;
	increment(n);
	print(n);
	n = increment(n);
	print(n);
	print(n++);
	print(n);

	return 0;
}

void print(int n)
{
	printf("%d\n", n);
}
int increment(int n)
{
	return ++n;
}