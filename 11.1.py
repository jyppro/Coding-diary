from tkinter import *

win = Tk()
win.title("그리드에 배치한 버튼의 다양한 모습")
win.geometry("500x500")

rtype = ['flat', 'groove', 'raised', 'ridge', 'solid', 'sunken']



for i, t in enumerate(rtype):
    Button(win, text = t)


win.mainloop()
