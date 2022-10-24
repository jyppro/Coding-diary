#%% 6 Challenge Programming ch10-cp06.py
import pygame
 
WHITE = (255, 255, 255)
RED = (255, 0, 0)
 
def drawcircle(screen, x, y):
    #pygame.draw.ellipse(screen, RED, [1 + x, y, 10, 10], 0) 
    pygame.draw.circle(screen, RED, [x, y], 2) 

pygame.init()
size = [600, 400]
screen = pygame.display.set_mode(size)
 
pygame.display.set_caption("마우스로 그림 그리기")
 
done = False
mpos = []
mdown = False
 
clock = pygame.time.Clock()
  
while not done:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            done = True
        elif event.type == pygame.MOUSEBUTTONDOWN:
        	mdown = True
        elif event.type == pygame.MOUSEMOTION:
            if mdown:
                mpos.append(event.pos)
        elif event.type == pygame.MOUSEBUTTONUP:
        	mdown = False
  
    screen.fill(WHITE)
    for pos in mpos:
	    drawcircle(screen, pos[0], pos[1])

    pygame.display.update()
    clock.tick(40)
 
pygame.quit()