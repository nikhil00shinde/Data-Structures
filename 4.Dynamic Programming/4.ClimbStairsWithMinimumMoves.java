import java.util.*;

public class ClimbStairsWithMinimumMoves
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = scn.nextInt();
        }

        // int ans = recursion(0,arr);
        int[] qb = new int[n+1];
        Arrays.fill(qb,-1);
        int ans = memoization(0,arr,qb);
        System.out.println(ans);
    }
     

    public static int memoization(int in,int[] arr,int[] qb)
    {
        if(in == arr.length)
        {
            return 0;
        }

        if(qb[in] != -1)
        {
            return qb[in];
        }
         
         int min = Integer.MAX_VALUE;
        for(int i=1;i<=arr[in] && i+in<=arr.length;i++)
        {
            min = Math.min(min,memoization(i+in,arr,qb));
        }
         qb[in] = min;
        if(min == Integer.MAX_VALUE)
        {
            return qb[in];
        }
        qb[in] = min + 1;
        return qb[in];

    }


    public static int recursion(int in,int [] arr)
    {
        if(in == arr.length)
        {
            return 0;
        }

        int min = Integer.MAX_VALUE-1;

        for(int i=1;i<=arr[in] && i+in<=arr.length;i++)
        {
           min = Math.min(min,recursion(i+in,arr));
        }
        return min + 1;
    }
}
