import java.io.*;
import java.util.*;

public class LargestAreaHistogram{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int area = largestAreaHistogram(arr);
        System.out.println(area);
    }

    public static int largestAreaHistogram(int[] arr)
    {
        int[] nsiol = nextSmallestElementIndexOnLeft(arr);
        int[] nsior = nextSmallestElementIndexOnRight(arr);
        int area = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            int width = nsior[i] - nsiol[i] -1;

            int a = arr[i]*width;
            area = Math.max(area,a);
        }
        return area;
    }

    public static int[] nextSmallestElementIndexOnLeft(int[] arr)
    {
       int n = arr.length;
       int[] ans = new int[n];

       Stack<Integer> st = new Stack<>();
       st.push(0);
       ans[0] = -1;

       for(int i=1;i<n;i++)
       {
           while(st.size() > 0 && arr[st.peek()] >= arr[i])
           {
               st.pop();
           }

           if(st.size() == 0)
           {
               ans[i] = -1;
           }
           else{
               ans[i] = st.peek();
           }
           st.push(i);
       }
       return ans;
    }
    public static int[] nextSmallestElementIndexOnRight(int[] arr)
    {
        int n = arr.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        ans[n-1] = n;

        for(int i=n-2;i>=0;i--)
        {
            while(st.size() > 0 && arr[st.peek()] >= arr[i])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                ans[i] = n;
            }
            else
            {
                ans[i] = st.peek();
            }
            st.push(i);
        }
        return ans;
    }
}