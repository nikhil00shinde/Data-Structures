import java.util.*;

public class FirstIndex
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
        int index = getFirstIndex(arr,0,x);
        System.out.println(index);
    }
  
    public static int getFirstIndex(int[] arr,int idx,int x)
    {
         if(arr.length == idx)
         {
             return -1;
         }
         
         if(arr[idx] == x)
         {
            return idx;
         }
         else
         {
             int index = getFirstIndex(arr,idx+1,x);
             return index;
         }
         
    }
}