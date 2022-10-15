''' mycar = {'brand' : '현대', 'model' : '제네시스', 'year' : 2016}
print(mycar)
print(type(mycar)) 



lect = dict() # 빈 딕셔너리
lect['강좌명'] = '파이썬 기초';
lect['개설년도'] = [2020, 1];
lect['학점시수'] = (3, 3);
lect['교수'] = '김민국';
print(lect)
print(len(lect))
print()
#딕셔너리 항목 참조
print(lect['개설년도'], lect['학점시수'])
print(lect['강좌명'], lect['교수']) 




season = {'봄' : 'spring', '여름' : 'summer', '가을' : 'autumn', '겨울' : 'winter'}
print(season.keys())
print(season.items())
print(season.values())

# 메소드 keys() 로 항목 순회
for key in season.keys():
    print('%s %s  ' % (key, season[key]))

for item in season.items():
    print('{} {}  '.format(item[0], item[1]), end = ' ')
print()

# 메소드 items()의 반환 값인 튜플을 한 변수에 저장한 경우, 항목 순회 2
for item in season.items():
    print('{} {}  '.format(*item), end = ' ') 
print() 


odd = {1, 2, 3, 4, 5}
print(odd.pop()) 




from random import randrange
from random import sample

#randrange() 함수와 집합을 이용, 중복 제거
mylotto = set()
while True:
    num = randrange(1, 46)
    print(num, end = ' ')
    mylotto.add(num)
    if len(mylotto) == 6:
        break
print()
print('집합 : {}'.format(mylotto))
print('정렬리스트 : {}'.format(sorted(mylotto)))
print()

#sample() 함수를 이용하면 매우 간편
lotto = sample(range(1, 46), 6)
print('sample 함수 리스트 : {}'.format(mylotto))
print('sample 함수 정렬 리스트 : {}'.format(sorted(mylotto)))






from random import choice
# 한글의 format 출력문제로 '보'를 '보오'로
dcs = {'가위' : '보오', '바위' : '가위', '보오' : '바위'}
# 출력에 필요한 단어를 구성해 리스트로 생성
tit = ['비김', '철수', '영희', '승자']
# rock scissors paper
rsp = ('가위', '바위', '보오')
# 제목출력
print('*'*17)
print('{:4} {:4} {:4}'.format(tit[1], tit[2], tit[3]))
print('*'*17)

for _ in range(10):
    #철수의 결정
    cs = choice(rsp)
    #영희의 결정
    yh = choice(rsp)

    # 철수와 영희의 결정 출력
    print('{:4} {:4}'.format(cs, yh), end = ' ')

    # 비기는 조건
    if cs == yh:
        index = 0 # 비김 출력
    elif dcs[cs] == yh:
        index = 1 # 철수 출력
    else:
        index = 2 # 영희 출력
    # 게임 결과 출력
    print('{:4}'.format(tit[index])) 





# K - pop 가수와 곡을 차트 순위에 맞춰 입력
singer = ['BTS', '볼빨간사춘기', 'BTS', '블랙핑크', '태연', 'BTS']
song = ['작은 것들을 위한 시', '나만 봄', '소우주', 'Kill This Love', '사계']

# zip() 함수로 가수와 곡을 조합
kpop = list(zip(singer, song))
print(kpop)

# dict() 함수와 enumeratezip() 함수로 순위를 키로 가수와 곡을 사전으로 구성
kpopchart = dict(enumerate(kpop, start = 1))

# 일반 출력
print(kpopchart)
print()

# 모듈 pprint 의 pprint() 함수 활용
import pprint
pprint.pprint(kpopchart) 





stocks = {'삼성에스디에스' : 242000, '삼성전자' : 47000, '엔씨소프트' : 52600,
          '핸디소프트' : 5120,'골프존' : 215000, '기아' : 56300}

print(stocks)

while True:
    which = input("주식 이름 ? ")
    if which in stocks:
        print('{} : {}'.format(which, stocks[which]))
    else:
        print('주식 이름이 없습니다.')
        break 





from random import choice
# 한글의 format 출력문제로 '보'를 '보오'로
dcs = {'가위' : '보오', '바위' : '가위', '보오' : '바위'}
# 출력에 필요한 단어를 구성해 리스트로 생성
tit = ['비김', '철수', '영희', '승자']
# rock scissors paper
rsp = ('가위', '바위', '보오')

# 승리 횟수를 저장
cnt = {tit[0]:0, tit[1]:0, tit[2]:0}

# 제목출력
print('*' * 20)
print('{:4} {:4} {:^5}'.format(tit[1], tit[2], tit[3]))
print('*' * 20)

# 총 게임 횟수
numgame = 20
for _ in range(numgame):
    #철수의 결정
    cs = choice(rsp)
    #영희의 결정
    yh = choice(rsp)

    # 철수와 영희의 결정 출력
    print('{:4} {:4}'.format(cs, yh), end = ' ')

    # 비기는 조건
    if cs == yh:
        index = 0 # 비김 출력
    elif dcs[cs] == yh:
        index = 1 # 철수 출력
    else:
        index = 2 # 영희 출력
    cnt[tit[index]] += 1
    print('{:3}{}'.format(tit[index], cnt[tit[index]]))
print()
print('총 게임 회수 : %d 비긴 회수 : %d' % (numgame, cnt[tit[0]]))

vgame = cnt[tit[1]] + cnt[tit[2]]
print('철수 승률 : {:.2f}'.format(cnt[tit[1]]/vgame))
print('영희 승률 : {:.2f}'.format(cnt[tit[2]]/vgame)) 





from random import sample

A = set(sample(list(range(1, 21)), 5))
B = set(sample(list(range(1, 21)), 5))

print('A = {} '.format(A))
print('B = {} '.format(B))
print()


print('A | B = {}'.format(A | B))
print('A & B = {}'.format(A & B))
print('A - B = {}'.format(A - B))
print('A ^ B = {}'.format(A ^ B)) '''
