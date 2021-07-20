import java.util.*;

public class MaxOfAnArray
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
        // int max = getMaxOfAnArray1(arr,0);
        int max = getMaxOfAnArray2(arr,0,Integer.MIN_VALUE);
        System.out.println(max);
    }
    public static int getMaxOfAnArray1(int[] arr,int idx)
    {
       if(idx == arr.length - 1)
       {
           return arr[idx];
       }

       int max = getMaxOfAnArray1(arr,idx+1);

       if(max < arr[idx])
       {
           return arr[idx];
       }
       else
       {
           return max;
       }
    }
    public static int getMaxOfAnArray2(int[] arr,int idx,int max)
    {
        if(idx == arr.length)
        {
            return max;
        }
        
        int smax = Math.max(arr[idx],max);

        return getMaxOfAnArray2(arr,idx+1,smax);
    }
}