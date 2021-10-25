import java.io.*;
import java.util.*;

public class SmallestNumberFollowingPattern
{
     public static void main(String[] args) throws Exception
     {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         String s = br.readLine();

         smallestPattern(s);
     }

     public static void smallestPattern(String s)
     {
         Stack<Integer> st = new Stack<>();

         st.push(1);
          
          int n = s.length();
          int a = 2;
         for(int i=0;i<n;i++)
         {
             
             if( s.charAt(i) == 'i')
             {
                 while(st.size() > 0)
                 {
                     System.out.print(st.pop());
                 }
             }
             st.push(a);
             a++;
         }

         while(st.size() > 0)
        {
            System.out.print(st.pop());
        }
     }
}