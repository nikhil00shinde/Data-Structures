import java.io.*;
import java.util.*;

public class PostfixEvaluation
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        postfixEvaluation(s);
    }
    public static void postfixEvaluation(String s)
    {
        int n = s.length();
        Stack<String> in = new Stack<>();
        Stack<String> pre = new Stack<>();
        Stack<Integer> val = new Stack<>();
       
       for(int i=0;i<n;i++)
       {
          char ch = s.charAt(i);

          if(ch >= '0'  && ch <='9')
          {
              in.push(ch+"");
              pre.push(ch+"");
              val.push(ch-'0');
          } 
          else
          {
             if(ch == '+')
             {
                //  infix
                 String a1 = in.pop();
                 String a2 = in.pop();
                 String ans = "(" + a2 + ch + a1 +")";
                 in.push(ans);

                //  value
                int k1 = val.pop();
                int k2 = val.pop();
                val.push(k2+k1);

                // prefix
                 a1 = pre.pop();
                 a2 = pre.pop();
                pre.push(ch+a2+a1);

             }
             else if(ch == '-')
             {
                  //  infix
                 String a1 = in.pop();
                 String a2 = in.pop();
                 String ans = "(" + a2 + ch + a1 +")";
                 in.push(ans);

                //  value
                int k1 = val.pop();
                int k2 = val.pop();
                val.push(k2-k1);

                // prefix
                 a1 = pre.pop();
                 a2 = pre.pop();
                pre.push(ch+a2+a1);
             }
             else if(ch == '/')
             {
                  //  infix
                 String a1 = in.pop();
                 String a2 = in.pop();
                 String ans = "(" + a2 + ch + a1 +")";
                 in.push(ans);

                //  value
                int k1 = val.pop();
                int k2 = val.pop();
                val.push(k2/k1);

                // prefix
                 a1 = pre.pop();
                 a2 = pre.pop();
                pre.push(ch+a2+a1);
             }
             else if(ch == '*')
             {
                  //  infix
                 String a1 = in.pop();
                 String a2 = in.pop();
                 String ans = "(" + a2 + ch + a1 +")";
                 in.push(ans);

                //  value
                int k1 = val.pop();
                int k2 = val.pop();
                val.push(k2*k1);

                // prefix
                 a1 = pre.pop();
                 a2 = pre.pop();
                pre.push(ch+a2+a1);
             }
          }
       }

       System.out.println(val.pop());
       System.out.println(in.pop());
       System.out.println(pre.pop());

    }
}