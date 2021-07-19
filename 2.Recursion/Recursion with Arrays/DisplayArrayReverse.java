import java.util.*;

public class DisplayArrayReverse
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
        printArrayReverse(arr,0);
    }

    public static void printArrayReverse(int[] arr,int idx)
    {
        if(idx == arr.length)
        {
            return ;
        }

        printArrayReverse(arr,idx+1);
        System.out.println(arr[idx]);
    }
}