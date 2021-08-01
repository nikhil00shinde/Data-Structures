import java.util.*;

public class PrintPermutations
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        printPermutations(s,"");
    }
    public static void printPermutations(String s,String psf)
    {
        if(s.length() == 0)
        {
            System.out.println(psf);
            return ;
        }

        for(int i=0;i<s.length();i++)
        {
            String ros = s.substring(0,i)+s.substring(i+1);
            printPermutations(ros,psf+s.charAt(i));
        }
    }
}