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

        int ans = recursion(0,arr);
        System.out.println(ans);
    }

    public static int recursion(int i,int[] arr)
    {
        if(i > arr.length)
        {
            return 0;
        }
        if(i == arr.length)
        {
            return 1;
        }
        
        int ans = 0;
        for(int j=1;j<=arr[i];j++)
        {
           ans += recursion(i+j,arr);
        }

        return ans;
    }
}