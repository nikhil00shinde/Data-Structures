import java.util.*;


public class ClimbStairM
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int[] qb = new int[n+1];
        Arrays.fill(qb,-1);
        int ans = climbStair(n,qb);

        System.out.println(ans);
    }

    public static int climbStair(int n,int[] qb)
    {
        if(n == 0)
        {
            return 1;
        }
         
        if(qb[n] != -1)
        {
            return qb[n];
        }
        int ans = 0;
        if(n - 1 >= 0)
        {
           ans += climbStair(n-1,qb);
        }
        if(n-2 >= 0)
        {
           ans += climbStair(n-2,qb);
        }
        if(n-3 >= 0)
        {
           ans += climbStair(n-3,qb);
        }
       qb[n] = ans;
       return qb[n];
    }
}

// Memoization -> if same problem asked again and again store that problem and return the same problem if asked again