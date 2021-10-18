import java.io.*;
import java.util.*;

public class CelebrityProblem{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++)
        {
            String line = br.readLine();

            for(int j=0;j<n;j++)
            {
                arr[i][j] = line.charAt(j)-'0';
            }
        }

        findCelebrity(arr);
    }

    public static void findCelebrity(int[][] arr)
    {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            st.push(i);
        }

        //check for potential celebrity
        while(st.size() >=2)
        {
            int i = st.pop();
            int j = st.pop();

            // if i knows j -> i is not celebrity
            if(arr[i][j] == 1)
            {
                st.push(j);
            }
            else{
                    //    i does'nt know j -> j is not celebrity
                   st.push(i);
            }
        }

        int pot = st.pop();

        for(int i=0;i<n;i++)
        {
            if(i != pot)
            {
                    if(arr[i][pot] == 0 || arr[pot][i] == 1)
                        {
                            System.out.println("none");
                            return;
                        }
            }
            
        }

        System.out.println(pot);
        
    }
}