import java.util.*;

public class PrintZigZag
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        printLogarithmic(n);
    }

    public static void printLogarithmic(int n)
    {

        if( n == 0)
        {
            return ;
        }

        System.out.print(n + " ");
        printLogarithmic(n-1);
        System.out.print(n+" ");
        printLogarithmic(n-1);
        System.out.print(n+ " ");
    }
}