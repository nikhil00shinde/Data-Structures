import java.util.*;

public class Factorial
{
    public static void  main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int f = getFactorial(n); //5*4*3*2*1 -> expectation
        System.out.println(f);
    }

    public static int getFactorial(int n)
    {
         if(n==0)
         {
             return 1;
         }

        int f = getFactorial(n-1); // 4*3*2*1 -> faith
        return f*n;
    }
}