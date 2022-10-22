#%% 2 Challenge Programming ch10-cp02.py
from tkinter import *

win = Tk()
win.title('그리드에 배치한 버튼의 다양한 모습')

rtype = ['flat', 'groove', 'raised', 'ridge', 'solid', 'sunken'] 
for i, t in enumerate(rtype):
    r, c = divmod(i, 2)
    bt = Button(win, text='({}, {})'.format(r, c), relief=t)
    bt['width'] = 30
    bt.grid(row = r, column = c)
 
win.mainloop()