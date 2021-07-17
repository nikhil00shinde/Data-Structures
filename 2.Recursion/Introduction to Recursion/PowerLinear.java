import java.util.*;

public class PowerLinear
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        int ans = getPower(x,n); //2*2*2*2*2

        System.out.println(ans);
    }

    public static int getPower(int x,int n)
    {
       if(n==1)
       {
           return x;
       }
        int ans = getPower(x,n-1); //2*2*2*2

        ans *= x;
        return ans;
    }
}