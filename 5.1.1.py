''' menu = ['coffee', 'beverage', 'ade']
coffee = ['에스프레소', '아메리카노', '카페라떼' ,'카페모카']

print('=' * 45)
for category in menu:
    print('{: ^15s}'.format(category), end = '')
print()
print('=' * 45)

for ckind in coffee:
    print('{: ^10s}'.format(ckind)) 



goods = []
for i in range(3):
    item = input('구입할 품목은 ? ')
    goods.append(item)
    print(goods)
print('길이 : %d' % len(goods)) 




pl = ['C', 'C++', 'Python', 'Java']
print(pl[0])
print(pl[2])
print()

for i in range(len(pl)):
    print(pl[i]) 




rsp = ['가위', '바위', '보']
for i in range(len(rsp)):
    print(rsp[i], end = ' ')
print()

from random import choice
print('컴퓨터의 가위 바위 보 5개')
for i in range(5):
    print(choice(rsp)) 




food = ['짜장면', '짬뽕', '우동','울면']
print(food)

food.append('탕수육')
print(food)

food[1] = '굴짬뽕'
print(food)

food[food.index('우동')] = '물만두'
print(food) 





alp = list('abcdefghij')
print(alp[1:-1])
print(alp[-1:1:-1])
print(alp[-2:2:-2]) 





wlist = ['밥', '삶', '길', '죽', '꿈', '차', '떡', '복', '말']
print('wlist[:] = ', wlist[:])
print('wlist[::] = ', wlist[::])
print('wlist[::-1] = ', wlist[::-1])

print(wlist[::3])
print(wlist[1::3])
print(wlist[2::3])

print(wlist[::-2])
print(wlist[-1:-8:-3])

print(wlist[1:-1:])
print(wlist[-2:-9:-3]) 





sports = ['축구', '야구', '농구', '배구']
# 위 종목에 대응하는 팀원 수를 항목으로 구성
num = [11, 9, 5, 6]
print(sports)
print(num)
# 위 두 리스트로 출력
for i in range(len(sports)):
    print('%s: %d명 ' % (sports[i], num[i]), end = ' ')
print(); print()

# 2차원 리스트로 생성
sponum = [sports, num]
print(sponum)
# 2차원 리스트에서 출력
for i in range(len(sponum[0])):
    print('%s : %d명 ' % (sponum[0][i], sponum[1][i]), end = ' ')
print(); print()

# 다른 구조의 2차원 리스트 생성을 컴프리헨션으로 처리
psponum = [[sports[i], num[i]] for i in range(len(sports))]
print(psponum)
# 위 두 리스트에서 출력
for one in psponum:
    print('%s: %d명 ' % (one[0], one[1]), end = ' ')
print() 





menu = ('주문 종료', '올인원팩', '투게더팩', '트리오팩', '패밀리팩')
price = (0, 6000, 7000, 8000, 10000)

#주문에 필요한 메시지 만들기
msg = '주문할 콤보 번호와 수량을 계속 입력하세요!'
for i in range(len(menu)):
    msg += '\n\t %d %s' % (i, menu[i])
    if i != 0:
        msg += ' %5d 원' % (price[i])
msg += '\n >> '


more = True
total = 0
while more:
    instr = input(msg)
    if instr.count(' ') > 0: # 2개의 입력 인지를 검사
        # 입력이 2개이면 분리해 각각 입력
        order, cnt = instr.split()
        cnt = int(cnt)
    else:
        # 입력이 1개이면 주문 번호 입력
        order = instr
    order = int(order)
    if order == 0:
        print()
        print('주문 종료 '.center(20, '*'))
        more = False
    elif 1 <= order <= 4:
        print('%s, %d개 주문' % (menu[order], cnt))
        sub = price[order] * cnt
        total += sub
        print('%s 주문가격 %d, 총 가격 %d' % (menu[order], sub, total))
    else:
        print('모르겠어요. 다시 주문하세요!')
else:
    print('총 주문 가격 %d 원' % total)
    print('주문을 마치겠습니다.')
    print(' 안녕! '.center(20, '=')) 





from random import randint
lst = []
for _ in range(9):
    lst.append(randint(1, 99))

print('리스트', lst)
print('정렬 리스트', sorted(lst))
print('역순 리스트', sorted(lst, reverse = True)) 




sports = ['축구', '야구', '농구', '배구']
num = [11, 9, 5, 6]

sports.insert(1, 11)
sports.insert(3, 9)
sports.insert(5, 5)
sports.insert(7, 6)
print('메소드 insert()로 팀원 수 삽입')
print(sports); print()
sports = ['축구', '야구', '농구', '배구']
for i in range(1, len(sports)*2, 2):
    sports.insert(i, '')
print("메소드 insert()로 '' 삽입")
print(sports); print()

num = [11, 9, 5, 6]
sports[1::2] = num
print("슬라이스 sports[1::2]에 num을 대입")
print(sports); print() '''





from random import randint

lst = []
for _ in range(10):
    lst.append(randint(1, 99))
print('리스트: ', lst)

tup = tuple(lst)
print('튜플: ', tup)
print('튜플 정렬된 리스트: ', sorted(tup))
print()

print('합: %d, 항목수: %d' % (sum(tup), len(tup)))
print('최대: %d, 최소: %d, 평균: %.2f' % (max(tup), min(tup), sum(tup)/len(tup)))
