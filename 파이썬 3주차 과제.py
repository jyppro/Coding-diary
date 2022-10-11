price = int(input('총 가격(원 가격) 입력 >>'))

rate1 = (10000  <= price <= 20000) * 1/100
rate2 = (20000  <= price <= 40000) * 2/100
rate3 = (40000  <= price) * 4/100
rate = rate1 + rate2 + rate3

discount = price * rate
discprice = price - discount
print('원 가격:', price, '할인된 가격:', discprice)
print('할인율:', rate, '할인액:', discount)







str = input('콤마로 구분된 단어 3개 입력 >>')
str = str.replace(' ', '')
w1, w2, w3 = str.split(',')

print('단어: {}, 역순: {}, 회문: {}'.format(w1, w1[::-1], (w1 == w1[::-1])))
print('단어: {}, 역순: {}, 회문: {}'.format(w2, w2[::-1], (w2 == w2[::-1])))
print('단어: {}, 역순: {}, 회문: {}'.format(w3, w3[::-1], (w3 == w3[::-1])))
