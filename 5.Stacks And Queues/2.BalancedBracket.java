import java.util.*;

public class BalancedBracket
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        
        boolean ans = checkBalancedBracket(s);
        System.out.println(ans);
    }

    public static boolean checkBalancedBracket(String s)
    {
        Stack<Character> st = new Stack<>();
            
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{')
            {  
                st.push(ch);
            }
            else if(ch == ')' || ch == ']' || ch == '}')
            {

                  if(ch == ')')
                  {
                      if(st.size() > 0 && st.peek() == '(')
                      {
                          st.pop();
                      }
                      else
                      {
                          return false;
                      }
                  }
                  else if(ch == ']')
                  {
                      if(st.size() > 0 && st.peek() == '[')
                      {
                          st.pop();
                      }
                      else
                      {
                          return false;
                      }
                  }
                  else if(ch == '}')
                  {
                      if(st.size() > 0 && st.peek() == '{')
                      {
                          st.pop();
                      }
                      else
                      {
                          return false;
                      }
                  }
            }
        }

        if(st.size() > 0)
        {
            return false;
        }
        return true;
    }
}