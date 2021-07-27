import java.util.*;

public class PrintSubsequence
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();

        printSubsequence(s,"");
    }

    public static void  printSubsequence(String s,String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans);
            return ;
        }
       char ch = s.charAt(0);
       printSubsequence(s.substring(1),ans+ch);
       printSubsequence(s.substring(1),ans);

    }
}