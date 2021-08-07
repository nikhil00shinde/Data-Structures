// In this we have to place n queens in n*n boxes basically we have to find the combination possible
// 2^n = nc0 + nc1 + nc2 + nc3 + ..........+ ncn
// here n represent n boxes that is n*n and 0,1,2,..,n represent queens to place

import java.util.*;

public class NQueensTask1
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        nCombinationsQueens(0,"",0,n);
    }
    public static void nCombinationsQueens(int b,String psf,int q,int n)
    {
        if(b >= n*n)
        {
            if(q == n)
            {
                System.out.println(psf);
            }
            return ;
        }
        //place queen
        nCombinationsQueens(b+1,psf+b+" ",q+1,n);

        //not place queen
         nCombinationsQueens(b+1,psf,q,n);
    }
}