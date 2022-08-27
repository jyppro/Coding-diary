/*박재영 만년달력 만들기*/
#include <stdio.h>
/*1월부터 12월까지의 전체 일수*/
int month[13] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
int yun(int year) /*윤년계산*/
{
	return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
}
int get_day(int y, int m, int d) /*달의 일수 계산*/
{
	int my = y - 1;
	int total = 365 * my;
	int i;

	total += my / 400 - my / 100 + my / 4;
	for (i = 1; i < m; i++) 
	{
		total += month[i];
		if (i == 2 && yun(y)) total++;
	}
	total += d;
	return total;
}

int get_space(int total) /*1일시작요일 계산*/
{
	return total % 7;
}

int main(void)
{
	int h, i, j, k;
	int year, day, space, mon, end;

	while (1) 
	{
		printf("1 : 입력한 년도의 달력을 전체출력합니다. \n"
			"2 : 입력한 년도의 달력에서 원하는 달의 달력을 출력합니다.\n"
			"1 또는 2를 입력해주세요 : "); /*h==1 : 출력형식1, h==2 : 출력형식2*/
		scanf_s("%d", &h);
		if (h == 1) 
		{ /*출력형식 1:해당년도 달력 전체 출력*/
			printf("몇 년도의 달력을 출력하시겠습니까? ");
			scanf_s("%d", &year);
			if (year < 1900)
			{
				printf("1900년 이후로 입력해주세요.\n");
				break;
			}
			day = get_day(year, 1, 1); // 1월1일까지 날짜수
			for (i = 1; i <= 12; ++i) 
			{
				end = month[i];
				if (i == 2 && yun(year)) end++;
				printf("\n\t\t%d년 %d월\t\t\n\n", year, i);
				printf("일\t월\t화\t수\t목\t금\t토\n");
				printf("--------------------------------------------------\n");
				space = get_space(day);
				for (k = 0; k < space; ++k) printf("\t");
				for (j = 1; j <= end; ++j) 
				{
					printf("%d\t", j);
					if ((j + space) % 7 == 0) printf("\n");
				}
				printf("\n\n");
				day += end;
			}
		}
		else if (h == 2) { /*출력형식 2: 해당년도에서 원하는 달의 달력 출력 */
			printf("연도와 달을 입력해주세요 : \n");
			scanf_s("%d", &year);
			scanf_s("%d", &mon);
			if (year < 1900)
			{
				printf("1900년 이후로 입력해주세요.\n");
				break;
			}
			printf("\n\t\t%d년 %d월\t\t\n\n", year, mon);
			printf("일\t월\t화\t수\t목\t금\t토\n");
			printf("--------------------------------------------------\n");
			day = get_day(year, mon, 1); /*총 날짜 수*/
			space = get_space(day);
			end = month[mon];
			if (mon == 2 && yun(year)) end++;
			for (k = 0; k < space; ++k) printf("\t");
			for (j = 1; j <= end; ++j) 
			{
				printf("%d\t", j);
				if ((j + space) % 7 == 0) printf("\n");
			}
		}
		else 
		{
			printf("\n0또는 1만 입력해주세요.\n"); /*1과 2이외의 숫자를 넣은경우*/
		}
		printf("\n\n");
	}
	return 0;
}