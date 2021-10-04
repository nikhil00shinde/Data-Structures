import java.util.*;

public class ClimbStairR
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        
        int ans = climbStair(n);

        System.out.println(ans);
    }

    public static int climbStair(int n)
    {

        if(n == 0)
        {
            return 1;
        }
        if(n < 0)
        {
            return 0;
        }

        int a1 = climbStair(n-1);
        int a2 = climbStair(n-2);
        int a3 = climbStair(n-3);
      
        return a1 + a2 + a3;
   }
}