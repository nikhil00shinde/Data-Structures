import java.io.*;
import java.util.*;

public class StockSpan{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] nge = solve(arr);
        display(nge);
    }
    public static void display(int[] arr)
    {
        StringBuilder sb = new StringBuilder();

        for(int val:arr)
        {
            sb.append(val+"\n");
        }
        System.out.println(sb);
    }

    public static int[] solve(int[] arr)
    {
        int n = arr.length;
        int[] nge = new int[n];

        Stack<Integer> st = new Stack<>();
        st.push(0);
        nge[0] = 1;
        for(int i=1;i<n;i++)
        {
            while(st.size() > 0 && arr[st.peek()] <= arr[i])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                nge[i] = i+1;
            }
            else
            {
                nge[i] = i-st.peek();
            }
            st.push(i);
        }
        return nge;
    }
}