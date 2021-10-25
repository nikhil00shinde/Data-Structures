import java.io.*;
import java.util.*;

public class MergeOverlappingInterval
{
   public static void main(String[] args) throws Exception
   {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
       int n = Integer.parseInt(br.readLine());

       int[][] arr = new int[n][2];

       for(int i=0;i<n;i++)
       {
           String s = br.readLine();

           arr[i][0] = Integer.parseInt(s.split(" ")[0]);
           arr[i][1] = Integer.parseInt(s.split(" ")[1]);
       }

       mergeOverlappingIntervals(arr);
   }

   public static class Interval implements Comparable<Interval>{
       int fn;
       int sn;

       Interval(int fn,int sn)
       {
           this.fn = fn;
           this.sn = sn;
       }

       public int compareTo(Interval o)
       {
           if(this.fn < o.fn)
           {
               return -1;
           }
           else if(this.fn > o.fn)
           {
                return 1;
           }
           else
           {
               return 0;
           }
       }
   }

   public static void mergeOverlappingIntervals(int[][] arr)
   {
      
      int n = arr.length;
      Interval[] intvl = new Interval[n];

      for(int i=0;i<n;i++)
      {
          intvl[i] = new Interval(arr[i][0],arr[i][1]);
      }
      Arrays.sort(intvl);

      Stack<Interval> st = new Stack<>();
      st.push(intvl[0]);

      for(int i=1;i<n;i++)
      {
          Interval p = st.peek();
          Interval c = intvl[i];
        //   System.out.println(st.peek().fn+"  "+st.peek().sn);
          if(c.fn <= p.sn)
          {
              st.peek().sn = Math.max(c.sn,p.sn);
          }
          else
          {
              st.push(intvl[i]);
          }
      }
      

      Stack<Interval> ans = new Stack<>();

      while(st.size()>0)
      {
          ans.push(st.pop());
      }

      while(ans.size()>0)
      {
          System.out.println(ans.peek().fn+" "+ans.peek().sn);
          ans.pop();
      }
   }
}