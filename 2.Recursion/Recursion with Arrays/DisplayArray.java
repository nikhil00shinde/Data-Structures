import java.util.*;

public class DisplayArray
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
        printArray(arr,0); //expectaation -> arr[0] to arr[n-1] will be print
    }

    public static void printArray(int[] arr,int i)
    {
        if(i == arr.length)
        {
            return ;
        }

        System.out.println(arr[i]);
        printArray(arr,i+1);//faith -> arr[i+1] to arr[n-1] will be printed
    }
}