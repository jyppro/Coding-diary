'''def helloint():
    print('\t', 77)

print(helloint)

print(helloint())

helloint() 

def func():
    i = 10
    print(i+1)

i = 1
func()
print(i) 




grocery = ['bread', 'milk', 'butter']

for item in enumerate(grocery, 100):
    print("{} {}".format(*item)) 




def hap(x = 1, y = 0, z = 0):
    return x + y + z

print(hap(*[1, 2, 3, 4])) 




 def kwtest(**kwargs):
    a = 0
    for key in kwargs:
        if key in ['java', 'python']:
            a += kwargs[key]
    return a

print(kwtest(java = 10, python = 12, kotlin = 36, c = 8)) 




def add1(x):
    return x + 1

nums = [2, 6, 7, 13, 3, 21]
mapped = list(map(add1, nums))
print(mapped) 




a = int(input())
b = float(input())
print('결과', a + b) '''




for i in range(2,10):
    for j in range(1,10):
        print('%d*%d = %2d' % (i, j, i*j), end = ' ')
    print()
