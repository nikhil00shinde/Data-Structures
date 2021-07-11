import java.util.*;

public class PrintAllPalindromicSubstring
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();//nextLine()

        print(s);
    }
    public static void print(String s)
    {
        //first find all substring
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+1;j<=s.length();j++)
            {
                String temp = s.substring(i,j);
                if(isPalindrome(temp) == true)
                {
                    System.out.println(temp);
                }
            }
        }
    }
    public static boolean isPalindrome(String s)
    {
        int i = 0;
        int j = s.length()-1;

        while(i<j)
        {
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(c != d)
            {
                return false;
            }
            i++;
            j--;
        }
      return true;
    }
}