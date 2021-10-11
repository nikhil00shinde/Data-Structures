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

        int ans = tabulation(arr);
        System.out.println(ans);
    }

    public static int tabulation(int[] arr)
    {
        int n = arr.length;
        // CREATE STORAGE
        int[] dp  = new int[n+1];

        // assign meaning to the storage
        // dp[i] -> it represent the at i'th minm moves required to reach nth stair by taking arr[i] number of steps

        // solve from smaller problem to larger problem
        dp[n] = 0;

        for(int i=n-1;i>=0;i--)
        {
            int min = Integer.MAX_VALUE;
            for(int j=1;j<=arr[i] && j+i<=n;j++)
            {
                min = Math.min(min,dp[i+j]);
            }

            if(min == Integer.MAX_VALUE)
            {
                dp[i] = min;
            }
            else
            {
                dp[i] = min + 1;
            }
        }
        return dp[0];
    }
    
}