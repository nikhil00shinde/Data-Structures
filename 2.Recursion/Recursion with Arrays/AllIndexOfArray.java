import java.util.*;

public class AllIndexOfArray
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
        int x = scn.nextInt();
        int [] index = allIndices(arr,x,0,0);

        for(int i=0;i<index.length;i++)
        {
            System.out.println(index[i]);
        }
    }
    public static int[] getAllIndex(int[] arr,int idx,int x,int fsf)
    {
        if(arr.length == idx)
        {
            int[] val = new int[fsf];
            return val;
        }

        if(arr[idx] == x)
        {
            int[] val = getAllIndex(arr,idx+1,x,fsf+1);
            val[fsf] = idx;
            return val;
        }
        else{
            return getAllIndex(arr,idx+1,x,fsf);
        }
    }
    public static int[] allIndices(int[] arr,int x,int idx,int fsf)
    {
        if(arr.length == idx)
        {
            return new int[fsf];
        }

        int[] a;
        if(arr[idx] == x)
        {
             a = allIndices(arr,x,idx+1,fsf+1);
        }
        else
        {
            a = allIndices(arr,x,idx+1,fsf);
        }

        if(arr[idx] == x)
        {
            a[fsf] = idx;
        }

        return a;
    }
}