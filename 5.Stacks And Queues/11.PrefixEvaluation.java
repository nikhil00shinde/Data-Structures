import java.io.*;
import java.util.*;

public class PrefixEvaluation
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s  = br.readLine();

        prefixEvaluation(s);
    }

    public static void prefixEvaluation(String s)
    {
        int n = s.length();

        Stack<String> in = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Integer> val = new Stack<>();
       

       for(int i=n-1;i>=0;i--)
       {
           char ch = s.charAt(i);

           if(ch >= '0' && ch <='9')
           {
               in.push(ch+"");
               post.push(ch+"");
               val.push(ch-'0');
           }
           else{
               //    infix
                  String a1 = in.pop();
                  String a2 = in.pop();
                  String ans = "("+a1+ch+a2+")";
                  in.push(ans);

                  //postfix
                  a1 = post.pop();
                  a2 = post.pop();
                  post.push(a1+a2+ch);
                

                //value
                val.push(cal(val.pop(),val.pop(),ch));
           }
       }
       System.out.println(val.peek());
       System.out.println(in.peek());
       System.out.println(post.peek());

    }

    public static int cal(int k1,int k2,char ch)
    {
        if(ch == '*')
        {
            return k2*k1;
        }
        else if(ch == '/')
        {
            return k1/k2;
        }
        else if(ch == '-')
        {
            return k1-k2;
        }
        else
        {
            return k2+k1;
        }
    }
}