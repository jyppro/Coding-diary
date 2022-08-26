#include <stdio.h>  
#include <math.h>
 int main(void)
 {
	    int p, i, year, month;
		int n = 1;
		int m[13] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    printf("1 : 년도만입력, 2 : 년도,달 입력. 선택 : ");
	   scanf_s("%d", &p); //입력받고  
	    if (p == 1) //년도만 입력받으면 그냥 1~12월 출력  
		   {
		         printf("년도입력 : ");
		         scanf_s("%d", &year);
		        printf("%d년\n", year);
				for (i = 1; i < 13; i++)
				{
					for (int i=1; i < m[n]; i++)
					{
						printf("%2d  ", i);
						if (i % 7 == 0)
							printf("\n");
					}
					printf("\n");
					printf("%d월\n", i);
					printf("일  월  화  수  목  금  토  \n");
					if (i == 2) //2월일경우 윤년인 경우와 윤년이 아닌경우 계산  
					{
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //윤년이면  
						{
							for (int i = 1; i < 30; i++) //29일까지 출력  
							{
								printf("%2d  ", i);
								if (i % 7 == 0)
									printf("\n");
							}
							printf("\n");
						}
						else //윤년이 아니면  
						{
							for (int i = 1; i < 29; i++) //28일까지 출력  
							{
								printf("%2d  ", i);
								if (i % 7 == 0)
									printf("\n");
							}
							printf("\n");
						}
					}
				}
		}
		else if (p == 2) //년도, 달 입력받기로 결정했으면  
		{
			printf("년도입력 : ");
			scanf_s("%d", &year);
			printf("달 입력 : ");
			scanf_s("%d", &month); //년도 달 다 입력받고  
			printf("일  월  화  수  목  금  토  \n");
			if (month == 2) //2월일경우 윤년인 경우와 윤년이 아닌경우 계산  
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //윤년이면  
				{
					for (int i = 1; i < 30; i++) //29일까지 출력  
					{
						printf("%2d  ", i);
						if (i % 7 == 0)
							printf("\n");
					}
					printf("\n");
				}
				else //윤년이 아니면  
				{
					for (int i = 1; i < 29; i++) //28일까지 출력  
					{
						printf("%2d  ", i);
						if (i % 7 == 0)
							printf("\n");
					}
					printf("\n");
				}
			}
		}
		for (int i = 1; i < m[n]; i++)
		{
			printf("%2d  ", i);
			if (i % 7 == 0)
				printf("\n");
		}
return 0;
}

