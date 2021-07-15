import java.util.*;

public class PrintIncreasing
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        printIncreasing(n); //1 2 3 4 5
   }

   public static void printIncreasing(int n)
   {
       if(n==0)
       {
           return ;
       }

       printIncreasing(n-1); //1 2 3 4 -> faith
       System.out.println(n);
   }
}