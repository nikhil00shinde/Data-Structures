import java.io.*;
import java.util.*;

public class InfixConversion
{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        pre_postConversion(s);
    }

    public static void pre_postConversion(String s)
    {
        int n = s.length();
        Stack<String> pre = new Stack<>();
        Stack<String> post = new Stack<>();
        Stack<Character> op = new Stack<>();
       
        for(int i=0;i<n;i++)
        {
             char ch = s.charAt(i);

             if(ch == '(')
             {
                 op.push(ch);
             }
             else if(ch == '+' || ch == '/' || ch == '*' || ch == '-')
             { 
                       while(op.size() > 0 && op.peek() != '(' && priority(ch) <= priority(op.peek()))
                       {
                           //pre
                           String a1 = pre.pop();
                           String a2 = pre.pop();
                           String oper = Character.toString(op.peek());
                           pre.push(oper+a2+a1);

                           //post
                            a1 = post.pop();
                            a2 = post.pop();
                            oper = Character.toString(op.peek());
                           post.push(a2+a1+oper);
                          
                           op.pop();
                       }
                       op.push(ch);
             }
             else if(ch == ')')
             {
                while(op.peek() != '(')
                {
                    //pre
                    String a1 = pre.pop();
                    String a2 = pre.pop();
                    String oper = Character.toString(op.peek());
                    pre.push(oper+a2+a1);

                    //post
                    a1 = post.pop();
                    a2 = post.pop();
                    oper = Character.toString(op.peek());
                    post.push(a2+a1+oper);
                    op.pop();
                }
                op.pop();
             }
             else if(ch != ' ')
             {
                 pre.push(Character.toString(ch));
                 post.push(Character.toString(ch));
             }
             
        }


        while(op.size() >0)
        {
            String a1 = pre.pop();
            String a2 = pre.pop();
            String oper = Character.toString(op.peek());
            pre.push(oper+a2+a1);

            //post
            a1 = post.pop();
            a2 = post.pop();
            oper = Character.toString(op.peek());
            post.push(a2+a1+oper);
            op.pop();
        }
        System.out.println(post.peek());
        System.out.println(pre.peek());
    }

    public static int priority(char ch)
    {
        if(ch == '+' || ch == '-')
        {
            return 1;
        }
        else
        {
              return 2;
        }
    }
}