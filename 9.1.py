'''taxrate = [(6,0), (15, 1_080_000), (24, 5_220_000),
           (35, 14_900_000), (38, 19_400_000),
           (40, 25_400_000), (42, 35_400_000)]


base = (0, 12_000000, 46_000000, 88_000000, 150_000000, 300_000000, 500_000000)

def getsection(income):
    if base[6] < income:
        section = 6
    elif base[5] < income:
        section = 5
    elif base[4] < income:
        section = 4
    elif base[3] < income:
        section = 3
    elif base[2] < income:
        section = 2
    elif base[1] < income:
        section = 1
    else:
        section = 0
    return section

income = int(input('종합 소득 금액 입력 >> '))
section = getsection(income)
tax = income * taxrate[section][0] / 100 - taxrate[section][1]

print("종합 소득: {:,.0f}".format(income))
print("세율: {}%".format(taxrate[section][0]))
print("세금: {:,.0f}".format(tax))

 

 

 

 

LCD = [["|||||",
        "|   |",
        "|   |"
        "|   |"
        "|||||"],

       
       ["   | ",
        "  || ",
        "   | ",
        "   | ",
        " ||||"],
       

       ["|||||",
        "    |",
        "|||||",
        "|    ",
        "|||||"],
 

       ["|||||",
        "    |",
        "|||||",
        "    |",
        "|||||"],


       ["|   |",
        "|   |",
        "|||||",
        "    |",
        "    |"],


       ["|||||",
        "|    ",
        "|||||",
        "    |",
        "|||||"],
        

       ["|||||",
        "|    ",
        "|||||",
        "|   |",
        "|||||"],


       ["|||||",
        "    |",
        "    |",
        "    |",
        "    |"],
 

       ["|||||",
        "|   |",
        "|||||",
        "|   |",
        "|||||"],

 
       ["|||||",
        "|   |",
        "|||||",
        "    |",
        "    |"]]
 

ROW = 5

 
def printLCD(digit):
    for row in range(ROW):
        for i in range(len(digit)):
            num = int(digit[i])
            print(LCD[num][row], end = ' ')
        print()
 

def checkdgt(s):
    tag = True
    for c in s:
        if c not in '012345':
            tag = False
            break
        return tag
snum = '7'
while not checkdgt(snum):
    snum = input("0~5 자릿수로만 정수 형태 1개 입력 >> ")

printLCD(snum) 

 

 

 


from random import choice

 
madewin = {'가위': '바위',
           '바위': '가위',
           '보': '바위'}


game = [' 가위# 바위# 보 게임 ', '가위', '바위', '보']
msg = ['비겼습니다', '축하합니다! 당신이 이겼습니다.']
msg.append('아쉽지만, 컴퓨터가 이겼습니다.')


print((game[0] + '시작 ').center(55, '='))
while True:
    try:
        s = '0(종료), 1(가위), 2(바위), 3(보[자기]) 중 하나 선택 >> '
        num = int(input(s))
    except:
        num = 1
 
    if num == 0:
        break;

 
    if not (0 <= num <= 3):
        print('\t입력이 잘못됐습니다. 다시 하세요!')
        continue;

 
    player = game[num]
    com = choice(game[1:])
    if player == com:
        winner = 0
    elif madewin[player] == com:
        winner = 1
    else:
        winner = 2
    print('당신:', player, 'vs', '컴퓨터:', com)
    print(msg[winner] + '\n')

print('\n', ' 종료합니다 '.center(55, '=')) '''





from random import sample
from random import randint

rank = { 6: ('1등', 1000000000),
         5: {1: ('2등', 50000000),
             0: ('3등', 1000000)},
         4: ('4등', 50000),
         3: ('5등', 5000)}

def makenum(same):
    nums = winnum.copy()
    for i in range(6 - same):
        nums.pop()

    while len(nums) != 6:
        n = randint(1, 45)
        if n not in winnum:
            nums.add(n)
    return nums

def getwinner(lotto):
    global bonus
    for i, item in enumerate(lotto):
        print('%c' % (ord('A') + i), end = ' ')
        win = winnum.intersection(item)
        if win:
            wincnt = len(win)
            print('당첨 번호 개수 %d, ' % wincnt, end = '')
            printnums(win)
            if 3 <= wincnt:
                grade = rank[wincnt]
                if 5 == wincnt:
                    if bonus in item:
                        print('\t 보너스 번호 %d도 맞춤!!!' % bonus)
                        grade = rank[wincnt][1]
                    else:
                        grade = rank[wincnt][0]
                print('\t%s %s원' % (grade[0], grade[1]))
            else:
                print('\t 2개 이하 맞춰, 꽝!')
        else:
            print('모두 꽝!!!')
            
def printlotto(lotto):
    for i, item in enumerate(lotto):
        print('%c 자동 ' %(ord('A') + i), end = ' ')
        printnums(item)
    print()
        
def printnums(nums):
    for num in sorted(nums):
        print('%02d' % num, end = ' ')
    print()

winnum = set(sample( list(range(1, 46)), 7 ))
bonus = winnum.pop()

print('당첨 번호: ', end = '')
printnums(winnum)
print('보너스 번호:', bonus)
print()

lottos = []
rank1num = winnum.copy()
lottos.append(rank1num)

rank2num = winnum.copy()
rank2num.pop(); rank2num.add(bonus)
lottos.append(rank2num)

rank3num = winnum.copy()
rank3num.pop()
while True:
    num = randint(1, 45)
    if num != bonus and num not in rank3num:
        rank3num.add(num)
        break
lottos.append(rank3num)

for i in range(5):
    lottos.append(makenum(4 - i))

printlotto(lottos)
getwinner(lottos)
