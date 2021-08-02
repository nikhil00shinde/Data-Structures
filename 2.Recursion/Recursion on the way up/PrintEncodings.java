import java.util.*;

public class PrintEncodings
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printEncodings(s,"");
    }
    public static void printEncodings(String s,String asf)
    {
        if(s.length() == 0)
        {
            System.out.println(asf);
            return ;
        }

        //check if it possible to contribute as a alphabet
        int num = s.charAt(0)-'0';
        if(num >= 1 && num < 10 )
        {
            char ch = (char)(num-1 + 'a');
            printEncodings(s.substring(1),asf+ch);
        }
       
       if(s.length() >= 2)
       {
         num = (s.charAt(0)-'0')*10+(s.charAt(1)-'0');
            if(num >= 10 && num <= 26)
            {
                char ch = (char)('a'+num-1);
                printEncodings(s.substring(2),asf+ch);
            }
       }

    }
}