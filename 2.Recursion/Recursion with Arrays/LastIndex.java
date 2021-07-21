import java.util.*;

public class  LastIndex
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

       int li = getLastIndex(arr,0,x);
       System.out.println(li);
    }
    public static int getLastIndex(int[] arr,int idx,int x)
    {
        if(idx == arr.length)
        {
           return -1;
        }

        int lis = getLastIndex(arr,idx+1,x);

        if(lis != -1)
        {
            return lis;
        }
        else if(arr[idx] == x)
        {
            return idx;
        }
        else
        {
            return -1;
        }
    }
}