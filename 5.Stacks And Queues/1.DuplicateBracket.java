import java.util.*;

public class DuplicateBracket
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.nextLine();
        boolean ans = duplicateBracket(s);
        System.out.println(ans);
    }

    public static boolean duplicateBracket(String s)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
             if(ch == '(')
             {
               st.push(ch);
             }
             else if(ch == ')')
             {
                   int val = 0;
                   while(st.size() > 0 && st.peek() != '(')
                   {
                       st.pop();
                       val++;
                   }
                   st.pop();
                   if(val == 0)
                   {
                       return true;
                   }
             }
             else if(ch != ' ')
             {
               st.push(ch);
                
             }

        }
        return false;
    }
}