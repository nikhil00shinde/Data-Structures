import java.util.*;

public class ClimbStairT
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans  = climbStairTab(n);

        System.out.println(ans);
    }

    public static int climbStairTab(int n)
    {
        // Create storage
        int[] dp = new int[n+1];

        // Assign meaning to the storage dp[i] -> ith floor to take step 1,2,3 to reach ground floor

        // solve from smallest problem to largest problem
        dp[0] = 1; 

        for(int i=1;i<=n;i++)
        {
            if(i == 1)
            {
                dp[i] = dp[i-1];
            }
            else if(i == 2)
            {
               dp[i] = dp[i-1] + dp[i-2];
            }else
            {
                dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
            }
        }
        return dp[n];
    }
}