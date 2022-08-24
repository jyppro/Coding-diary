#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define max 100

int main()
{
	int i, a, number; 
	long seed;
	seed = time(NULL);
	srand(seed);
	printf("1~100까지의 난수가 입력되었습니다. 맟춰보십시오.\n");
	for (i = 0; i < 1; i++)
	{
		number = rand() % 100 + 1;
		scanf_s("%5d\n", &a);
	}

		if (number < a)
		{
			printf("틀렸습니다.\n");
			printf("당신이 입력한 수보다 큰 수 입니다.\n");
		}

	return 0;
}



