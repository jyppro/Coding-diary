#%% 4 Challenge Programming ch10-cp04.py
import tkinter as tk

def sayhi():
	print('command: 안녕!')

def hi(e):
	print('bind: 안녕!')

win = tk.Tk()
win.geometry('300x200')
win.title('반가워요, Tkinter!')

btn = tk.Button(win, text="인사 이벤트 처리")
btn.bind('<Button-1>', hi)
btn['command'] = sayhi
btn.pack(expand=True, fill='both')

win.mainloop()