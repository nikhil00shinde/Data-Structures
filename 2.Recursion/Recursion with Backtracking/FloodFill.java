import java.util.*;

public class FloodFill
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n =  scn.nextInt();
        int m =  scn.nextInt();
        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        floodfill(arr, 0, 0, "");
    }
    
    // asf -> answer so far
    public static void floodfill(int[][] maze, int sr, int sc, String asf) {

         boolean[][]  isVisited = new boolean[maze.length][maze[0].length];
         helper_fun(maze,sr,sc,asf,isVisited);
    }

    public static void helper_fun(int[][] maze,int sr,int sc,String asf,boolean[][] isVisited)
    {
        if(sr == maze.length-1 && sc == maze[0].length-1)
        {
            System.out.println(asf);
            return ;
        } 

        if(sr < 0 || sc < 0 || sr >= maze.length || sc >= maze[0].length || maze[sr][sc] == 1 || isVisited[sr][sc] == true)
        {
            return ;
        }

        isVisited[sr][sc] = true;
        
        //top
        helper_fun(maze,sr-1,sc,asf+'t',isVisited);
        //left
        helper_fun(maze,sr,sc-1,asf+'l',isVisited);
        //bottom
        helper_fun(maze,sr+1,sc,asf+'b',isVisited);
        //right
        helper_fun(maze,sr,sc+1,asf+'r',isVisited);

        isVisited[sr][sc] = false;
    }
}