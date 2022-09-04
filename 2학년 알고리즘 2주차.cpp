#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {

	float cel, fah;
	int n = 0;
	printf("섭씨온도 : ");
	scanf("%f", &cel);
	while (cel > -50) {
		fah = cel * (9 / 5.0) + 32;
		printf("화씨온도 : %.2f\n", fah);
		printf("섭씨온도 : ");
		scanf("%f", &cel);
		n++;
	}
	printf("%d data processed ...", n);
}

#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

void main() {
	int call_number, m, r, k, ans;

	printf("몇으로 나누어 떨어지는 놀이할까요? ");
	scanf("%d", &m);
	printf("\nStart : %d로 나누어지는 가장 가까운 수로 답하기\n", m);

	for (k = 0; k < 5; k++) {
		printf("\nCall Number = ");
		scanf("%d", &call_number);
		r = call_number % m;
		if ((m - r) < r)
			ans = call_number + (m - r);
		else
			ans = call_number - r;
		printf("\nThe answer is %d\n", ans);
	}
}

