import java.util.*;

public class ClimbStairWithVarJump
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
        int[] dp = new int[n+1];

        // Assign meaning to storage
        // dp[i]-> at i'th how much jump can make to reach n

        // SOLVE PROBLEM FROM SMALLER TO LARGER
        dp[n] = 1;
        
        for(int i=n-1;i>=0;i--)
        {

            for(int j=1;j<=arr[i] && j+i <= arr.length;j++)
            {
                dp[i] += dp[j+i];
            }
        }
        return dp[0];
    }
}