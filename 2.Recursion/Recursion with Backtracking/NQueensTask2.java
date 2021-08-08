//in this  we have to place n queens in n*n matrix  such 1 queen at a row

import java.util.*;

public class NQueensTask2
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        for(int c=0;c<n;c++)
        {
            int boxN = c;
          placeNQueens1AtRow(1,n,""+boxN+" ");
        }
    }
    public static void placeNQueens1AtRow(int r,int n,String psf)
    {
        if(r == n)
        {
            System.out.println(psf);
            return ;
        }

        for(int c=0;c<n;c++)
        {
            int boxN = r*n+c;
            placeNQueens1AtRow(r+1,n,psf+boxN+" ");
        }
    }
}