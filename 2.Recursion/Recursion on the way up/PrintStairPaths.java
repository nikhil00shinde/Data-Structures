import java.util.*;

public class PrintStairPaths
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPaths(n,"");
    }

    public static void printStairPaths(int n, String psf)
    {
        if(n==0)
        {
            System.out.println(psf);
            return ;
        }
        //1 step
        if(n>=1)
        {
            printStairPaths(n-1,psf+'1');
        }

        //2 step
        if(n>=2)
        {
             printStairPaths(n-2,psf+'2');
        }

        //3 step
        if(n>=3)
        {
            printStairPaths(n-3,psf+'3');
        }
    }
}