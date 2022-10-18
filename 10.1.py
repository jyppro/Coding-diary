'''import math
import random

def getarea(r):
    return r * r * math.pi

radius = random.random() * 10
radius = round(radius, 2)
print('원의 반지름: %.2f' % radius)
print('원주율 pi: %.4f' % math.pi)
print('반지름 %.2f인 원의 면적은 %.2f' %(radius, getarea(radius))) 





from math import factorial as fact
from statistics import median, mean, variance, stdev

if __name__ == '__main__':
    for i in range(1, 21, 5):
        print('{:2d}! = {}'.format(i, fact(i)))

    lst = [80, 99, 77, 65, 92, 74, 82]
    print(); print(lst)
    print('중앙 값: %.2f' % median(lst))
    print('평균: %.2f' % mean(lst))
    print('분산: %.2f' % variance(lst))
    print('표준편차: %.2f' % stdev(lst)) 





import turtle as t

colors = ['yellow', 'red', 'blue']
t.setup(500, 500)
t.bgcolor('black')
rep = 200
t.speed(0)
for i in range(rep):
    t.color(colors[i % len(colors)])
    t.width(i/rep + 1)
    t.forward(i * 2)
    t.left(119) 





import turtle as t
t.setup(500, 400)

rep = 60
t.speed(0)

for i in range(rep):
    for i in range(5):
        t.forward(100)
        t.left(360/5)
    t.left(360/rep) 






import turtle as t
from random import randint

tshs = ['arrow', 'circle', 'turtle', 'square', 'triangle', 'classic']
han = ['화살', '원', '거북이', '사각형', '삼각형', '전통']
cols = ['red', 'blue', 'green', 'purple', 'magenta', 'black', 'gray', 'yellow', 'cyan', 'orange', 'aqua']

t.setup(800, 500)
t.clear()
for i in range(20):
    t.penup()
    x = randint(-300, 300)
    y = randint(-200, 200)
    t.setpos(x, y)

    t.pendown()
    t.shape(tshs[i % len(tshs)])
    t.fillcolor(cols[i % len(cols)])
    t.begin_fill()
    t.circle(randint(3, 50))
    t.end_fill()
    t.pensize(2)
    t.pencolor(cols[(i+1) % len(cols)])
    t.write(han[i % len(han)]) 






import numpy as np
import matplotlib.pyplot as plt
linestyles = ['-', '--', '-.', ':']
x = np.linspace(-np.pi * 2, np.pi * 2, 720)
cos, sin = np.cos(x), np.sin(x)
plt.plot(x, sin, ls = ':', label = 'sin')
plt.plot(x, cos, ls = '--', label = 'cos')
plt.title("Graph of sin cos")
plt.xlabel('radians')
plt.ylabel('value')
plt.grid()
plt.legend()
plt.show() '''
