import java.util.*;

public class FibonacciT
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int ans = fibonacciTabulation(n);
        System.out.println(ans);
    }
    
    public static int fibonacciTabulation(int n)
    {
        //storage 
        int[] dp = new int[n+1];

        // assign meaning to storage dp[i]-> contains the fibonacci of i
        
        // solve from smallest problem to largest problem
        dp[0] = 0;
        dp[1] = 1;

        for(int i=2;i<=n;i++)
        {
             dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}