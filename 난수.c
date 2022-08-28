#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define max 100

int main()
{
	int i, number;
	long seed;
	srand(time(NULL));
	printf("1~ %5d 사이의 난수6개 : srand(time(NULL)); rand()%%100+1\n\t",max);
	for (i = 1; i < 6; i++) {
		number = rand() %100 + 1;
		printf("%5d", number);
	}
	printf("\n\n");

	return 0;
}