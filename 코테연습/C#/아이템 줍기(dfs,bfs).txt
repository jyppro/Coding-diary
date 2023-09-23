using System;
using System.Collections.Generic;

public class Solution
{
    const int MAX = 102;

    static int[,] board = new int[MAX, MAX];

    public int solution(int[,] rectangle, int characterX, int characterY, int itemX, int itemY)
    {
        CheckRectBorder(rectangle);

        return BFS(characterX*2, characterY*2, itemX*2, itemY*2);
    }

    private int BFS(int startX, int startY, int endX, int endY)
    {
        int answer = 0;

        int[] dx = new int[] { 1, 0, -1, 0 };
        int[] dy = new int[] { 0, 1, 0, -1 };
        Queue<(int, int)> q = new Queue<(int, int)>();

        board[startX, startY] = 1;
        q.Enqueue((startX, startY));

        while(q.Count > 0)
        {
            var cur = q.Dequeue();

            var curX = cur.Item1;
            var curY = cur.Item2;

            if(curX == endX && curY == endY)
            {
                Console.WriteLine(board[curX, curY] / 2);
                return board[curX, curY] / 2;
            }

            for(int dir = 0 ; dir < 4 ; dir++)
            {
                int nx = curX + dx[dir];
                int ny = curY + dy[dir];

                if(board[nx,ny] < 0)
                {
                    board[nx, ny] = board[curX, curY] + 1;
                    q.Enqueue((nx, ny));
                }
            }
        }
        return answer;
    }


    private void CheckRectBorder(int[,] rectangle)
    {
        for(int i = 0 ; i < rectangle.GetLength(0) ; i++)
        {
            for(int a = rectangle[i,0] * 2 ; a <= rectangle[i,2] * 2 ; a++)
            {
                for(int b = rectangle[i,1] * 2 ; b <= rectangle[i,3] * 2 ; b++)
                    board[a,b] = -1;
            }
        }

        for(int i = 0 ; i < rectangle.GetLength(0) ; i++)
        {
            for(int a = rectangle[i,0] * 2 + 1 ; a <= rectangle[i,2] * 2 - 1 ; a++)
            {
                for(int b = rectangle[i,1] * 2 + 1 ; b <= rectangle[i,3] * 2 - 1 ; b++)
                    board[a,b] = 0;
            }
        }
    }
}