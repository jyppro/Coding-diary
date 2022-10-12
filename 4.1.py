'''grade = float(input('1학기 평균 평점은? '))
if 3.8 <= grade:
    print('축하합니다! 장학금 지급 대상자입니다.')
print('당신의 1학기 평균 평점 %.2f이다.' % (grade))


from time import localtime
hour = localtime().tm_hour
mnt = localtime().tm_min

if hour < 10:
    print('지금 시각: %d시 %d분, 조조 할인 된다. ' %(hour, mnt))
else:
    print('지금 시각: %d시 %d분, 조조 할인 안된다. ' %(hour, mnt))

for i in 1, 2, 3:
    print('로그인')
    print('캐릭터 및 아이템 등 여러 옵션 선택')
    print('게임 실행')
    print('게임 종료') 

sum = 0
for i in 1.1, 2.5, 3.6, 4.2, 5.4:
    sum += i
    print(i, sum)
else:
    print('합: %.2f, 평균: %.2f' % (sum, sum / 5)) 

n = input("10진수의 한 자릿수 입력 >>")
print('두 자릿수 정수에서 최소 한 자릿수가 %s인 정수 찾기: ' % n)
print(' 결과 '.center(50, '='))

for i in range(10, 100):
    snum = str(i)
    if n in snum:
        print(i, end= '  ') 

n = 1
while n <= 5:
    print(n, end = ' ')
    n += 1
else:
    print("\n 반복 while 종료: n => %d" % n)


for i in range(2, 10):
    for j in range(1, 10):
        print('%d * %d = %2d' % (i, j, i * j), end = ' ') 
    print()


import random
for i in range(6):
    n = random.randint(1, 45)
    print(n, end = ' ') 


from random import randint
for i in range(6):
    n = randint(1, 45)
    print(n, end = ' ') 

winnumber = 11, 17, 28, 30, 33, 35
print('모의 로또 당첨 번호 '.center(28, '='))
print(winnumber)
print()
print(' 내 번호 확인 '.center(30, '-'))
cnt = 0
from random import randint
for i in range(6):
    n = randint(1, 45)
    if n in winnumber:
        print(n, 'o ', end = ' ')
        cnt += 1
    else:
        print(n, 'x ', end = ' ')
print()
print(cnt, '개 맞음') 


from random import randint
answer = randint(1, 10)

indata = int(input('1에서 10 사이에 수를 맞히세요 >> '))
while True:
    if indata == answer:
        print('축하한다. {}: 정답이다.'.format(indata))
        break;
    elif indata < answer:
        str = '{}보다 더 큰 수로 다시 입력 >> '.format(indata)
    else:
        str = '{}보다 더 작은 수로 다시 입력 >> '.format(indata)
    indata = int(input(str))

print(" 종료 ".center(30, '*')) '''



''' menu = Coffee menu!
    1. 아메리카노     2000
    2. 카페라떼       2500
    3. 카푸치노       3000
    4. 캐러멜마키아또 4000
    0. 주문 종료
마실 음료의 종류를 선택하세요 

print('환영합니다. 음료를 선택하세요')
total = 0
while True:
    order = int(input(menu))
    if order == 0:
        print()
        print(' 주문 종료 '.center(18, '*'))
        break;
    else:
        cnt = int(input('수량 ? '))
        if order == 1:
            total += cnt * 2000
            print('\n%s %d개 주문' % ('아메리카노', cnt))
        elif order == 2:
            total += cnt * 2500
            print('\n%s %d개 주문' % ('카페라떼', cnt))
        elif order == 3:
            total += cnt * 3000
            print('\n%s %d개 주문' % ('카푸치노', cnt))
        elif order == 4:
            total += cnt * 4000
            print('\n%s %d개 주문' % ('캐러멜 마키아또', cnt))
        else:
            print('모르겠어요.')
        print('현재 주문 가격: %d원' % total)
        print()

print('총 주문 가격: %d원' % total)
print(' 안녕! '.center(20, '=')) 




dates = int(input('한 달 최대 일수를 입력 >> '))
day = int(input('첫 날 1일의 시작 요일을 입력(0 = 일, 1 = 월, ... 6 = 토) >>'))
day %= 7 # 7이 넘어가면 재설정

# 요일 출력
print('\n', end = ' ')
for i in '일월화수목금토':
    print('%s' % i, end = ' ')
else:
    print('\n')

cnt = 0
#빈 날짜 출력
if day != 0:
    print('   ' * day, end = '')
    cnt += day

#1일 부터 말일까지 출력
for i in range(1, dates + 1):
    print('%2d' % i, end = ' ')
    cnt += 1
    if cnt % 7 == 0: #1주가 모두 출력되면 다음부터는 다음 줄에서 출력
        print()
else:
    print() 




month = int(input('월 입력 ?'))

if 4 <= month <= 5:
    print('%d월 봄' % month)
elif 6 <= month <= 8:
    print('%d월 여름' % month)
elif 9 <= month <= 10:
    print('%d월 가을' % month)
elif 11 <= month <= 12 or 1 <= month <= 3:
    print('%d월 겨울' % month)
else:
    print('%d: 잘못 입력' % month) '''





from random import randint
before = randint(1, 100)
print('첫 값은 {} 입니다.'.format(before))

while True:
    print()
    op = input('산술 연산의 종류를 입력하세요. >> ')
    if op not in '+-*/%':
        break
    else:
        oprd = int(input('두 번째 피연산자를 입력하세요. >> '))
        if op == '+':
            after = before + oprd
        elif op == '-':
            after = before - oprd
        elif op == '*':
            after = before * oprd
        elif op == '/':
            after = before / oprd
        elif op == '%':
            after = before % oprd
        print('{} {} {} = {}'.format(before, op, oprd, after))
        print()
print("종료".center(32, '*'))


















