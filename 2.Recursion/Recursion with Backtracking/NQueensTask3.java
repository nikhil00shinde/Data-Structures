//place the queen one at a row such that no queen kill each other

import java.util.*;

public class NQueensTask3
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        boolean[][] pos = new boolean[n][n];
        for(int i=0;i<n;i++)
        {
             Arrays.fill(pos[i],false);
        }
        nQueens(n,pos,0,"");
    }
    public static boolean isValid(boolean[][] pos,int i,int j)
    {
        int n = pos.length;
        //vertical left diagonal check
        for(int r=i-1,c=j-1;r>=0 && c>=0;r--,c--)
        {
            if(pos[r][c] == true)
            {
                return false;
            }
        }

        //vertical top check
        for(int r=i-1;r>=0;r--)
        {
            if(pos[r][j] == true)
            {
                return false;
            }
        }

        //vertical right diagonal check
        for(int r=i-1,c=j+1;r>=0 && c<n;r--,c++)
        {
            if(pos[r][c] == true)
            {
                return false;
            }
        }

        return true;
    }
    public static void nQueens(int n,boolean[][] pos,int r,String psf)
    {
        if(n == r)
        {
            System.out.println(psf+".");
            return ;
        }

        for(int c=0;c<n;c++)
        {
            if(isValid(pos,r,c) == true)
            {
              pos[r][c] = true;
              nQueens(n,pos,r+1,psf+r+"-"+c+", ");
              pos[r][c] = false;
            }
            
        }
    }
}