import java.util.*;

public class PowerLogarithmic
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int x = scn.nextInt();
        int n = scn.nextInt();

        // int ans = getPower1(x,n);
        int ans = getPower2(x,n);

        System.out.println(ans);
    }
    //  This function expects call function to be only log(n) high.
    public static int getPower1(int x,int n)
    {
        //the number call will be 2^logx => height -> logx
       if(n==0)
       {
           return 1;
       }


       int ans = getPower1(x,n/2)*getPower1(x,n/2);

       if(n%2 == 1)
       {
           ans *= x;
       }
       return ans;
    }
    
    public static int getPower2(int x,int n)
    {
         if(n==0)
         {
             return 1;
         }

         int ans = getPower2(x,n/2);
         
         ans = ans*ans;
         if(n%2 == 1)
         {
             ans *= x;
         }
         return ans;
    }
}