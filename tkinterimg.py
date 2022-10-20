from tkinter import *

 

win = Tk()
win.title("그림 로드")
win.geometry("660x930")

canvas = Canvas(win, bg = 'Yellow')
canvas.pack(expand = YES, fill = BOTH)

img = PhotoImage(file="C:/Users/Master/Desktop/NFT/Aoz#6294.png")
canvas.create_image(10, 10, anchor=NW, image=img)

win.mainloop()
