import java.util.*;

public class FibonacciM
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n+1];
        Arrays.fill(qb,-1);
        int ans = fibMemoize(n,qb);
        System.out.println(ans);
    }

    public static int fibMemoize(int n,int[] qb)
    {
        if(n == 1 || n == 2)
        {
            return 1;
        }

        if(qb[n] != -1)
        {
             return qb[n];
        }

        int ans1 = fibMemoize(n-1,qb);
        int ans2 = fibMemoize(n-2,qb);
        qb[n] = ans1+ans2;
        return ans1+ans2;
    }
}