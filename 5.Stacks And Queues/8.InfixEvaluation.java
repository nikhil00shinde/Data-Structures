import java.io.*;
import java.util.*;

public class InfixEvaluation
{
    public static void main(String[] args) throws Exception
    {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String s = br.readLine();

       int ans = infixEvaluation(s);
       System.out.println(ans);
    }

    public static int infixEvaluation(String s)
    {
        Stack<Character> oprt = new Stack<>();
        Stack<Integer> oprd = new Stack<>();
        
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);

            if(ch == '(')
            {
                oprt.push(ch);
            }
            else if(ch == '+' || ch == '*' || ch == '-' || ch == '/')
            {
                     int v1 = pref(ch);
                  while(oprt.size() > 0 && oprt.peek() != '(' && pref(oprt.peek()) >= v1)
                  {
                        int a1 = oprd.pop();
                        int a2 = oprd.pop();
                        int ans = cal(a1,a2,oprt.peek());
                        oprd.push(ans);
                        oprt.pop();
                  }
                  oprt.push(ch);
            }
            else if(ch == ')')
            {
                      int v1 = pref(ch);
                      int v2 = pref(oprt.peek());
                       
                      while(oprt.peek() != '(')
                      {
                         int a1 = oprd.pop();
                         int a2 = oprd.pop();
                        int ans = cal(a1,a2,oprt.pop());
                        oprd.push(ans);
                      }
                     oprt.pop();
            }
            else if(ch != ' ')
            {
                oprd.push(Integer.parseInt(ch+""));
            }
        }
        while(oprt.size() > 0)
        {
            int a1 = oprd.pop();
            int a2 = oprd.pop();

            int ans = cal(a1,a2,oprt.pop());
            oprd.push(ans);
        }
        return oprd.peek();
    }
    public static int cal(int a1,int a2,char ch)
    {
        if(ch == '+')
        {
           return a1+a2;
        }
        else if(ch == '*')
        {
          return a1*a2;
        }
        else if(ch == '-')
        {
            return a2-a1;
        }
        else{
           return a2/a1;
        }
    }
    public static int pref(Character ch)
    {
        if(ch == '+' || ch == '-')
        {
            return 1;
        }
        else{
            return 2;
        }
        
    }
}