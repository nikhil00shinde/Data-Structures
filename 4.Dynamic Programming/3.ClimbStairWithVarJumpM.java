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
        int[] qb = new int[n+1];
        Arrays.fill(qb,-1);

        int ans = memoization(0,arr,qb);
        System.out.println(ans);
    }

    public static int memoization(int in,int[] arr,int[] qb)
    {
        if(in == arr.length)
        {
            return 1;
        }
        if(qb[in] != -1)
        {
            return qb[in];
        }
        
        int ans = 0;
        for(int i=1;i<=arr[in] && in+i<=arr.length;i++)
        {
            ans += memoization(in+i,arr,qb);
        }

        qb[in] = ans;
        return ans;
    }
}