import random as r
import turtle as t

width, height = 1000, 1000

def goright():
    t.setheading(0)
    t.circle(50, 90)

def goleft():
    t.setheading(180)
    t.circle(50, 90)

def goup():
    t.setheading(90)
    t.circle(50, 90)

def godown():
    t.setheading(270)
    t.circle(50, 90)

def cls():
    t.clear()
 
t.setup(width, height)
t.shape('turtle')
t.clear()
t.home()

t.onkeypress(goright, 'Right')
t.onkeypress(goleft, 'Left')
t.onkeypress(goup, 'Up')
t.onkeypress(godown, 'Down')
t.onkeypress(cls, 'Escape')
t.listen()
