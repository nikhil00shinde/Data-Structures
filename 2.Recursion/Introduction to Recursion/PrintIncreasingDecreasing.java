import java.util.*;

public class PrintIncreasingDecreasing
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        printIncreasingDecreasing(n);

    }
    public static void printIncreasingDecreasing(int n)
    {

        if(n==0)
        {
            return ;
        }
        
        System.out.println(n);
        printIncreasingDecreasing(n-1); //2 1 1 2
        System.out.println(n);
    }
}