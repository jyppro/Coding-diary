#include <stdio.h>  
#include <math.h>
 int main(void)
 {
	    int p, i, year, month;
		int n = 1;
		int m[13] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	    printf("1 : �⵵���Է�, 2 : �⵵,�� �Է�. ���� : ");
	   scanf_s("%d", &p); //�Է¹ް�  
	    if (p == 1) //�⵵�� �Է¹����� �׳� 1~12�� ���  
		   {
		         printf("�⵵�Է� : ");
		         scanf_s("%d", &year);
		        printf("%d��\n", year);
				for (i = 1; i < 13; i++)
				{
					for (int i=1; i < m[n]; i++)
					{
						printf("%2d  ", i);
						if (i % 7 == 0)
							printf("\n");
					}
					printf("\n");
					printf("%d��\n", i);
					printf("��  ��  ȭ  ��  ��  ��  ��  \n");
					if (i == 2) //2���ϰ�� ������ ���� ������ �ƴѰ�� ���  
					{
						if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //�����̸�  
						{
							for (int i = 1; i < 30; i++) //29�ϱ��� ���  
							{
								printf("%2d  ", i);
								if (i % 7 == 0)
									printf("\n");
							}
							printf("\n");
						}
						else //������ �ƴϸ�  
						{
							for (int i = 1; i < 29; i++) //28�ϱ��� ���  
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
		else if (p == 2) //�⵵, �� �Է¹ޱ�� ����������  
		{
			printf("�⵵�Է� : ");
			scanf_s("%d", &year);
			printf("�� �Է� : ");
			scanf_s("%d", &month); //�⵵ �� �� �Է¹ް�  
			printf("��  ��  ȭ  ��  ��  ��  ��  \n");
			if (month == 2) //2���ϰ�� ������ ���� ������ �ƴѰ�� ���  
			{
				if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) //�����̸�  
				{
					for (int i = 1; i < 30; i++) //29�ϱ��� ���  
					{
						printf("%2d  ", i);
						if (i % 7 == 0)
							printf("\n");
					}
					printf("\n");
				}
				else //������ �ƴϸ�  
				{
					for (int i = 1; i < 29; i++) //28�ϱ��� ���  
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

