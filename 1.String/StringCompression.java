import java.util.*;

public class StringCompression
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();

        System.out.println(compression1(s));
         System.out.println(compression2(s));
    }
    public static String compression1(String s){
		// write your code here
        String temp = "";
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i) !=  s.charAt(i+1))
           {
               temp = temp + s.charAt(i);
           }
        }
        temp = temp + s.charAt(s.length()-1);
		return temp;
	}

	public static String compression2(String s){
		// write your code here
          String temp = "";
         int k = 1;
        for(int i=0;i<s.length()-1;i++)
        {
           if(s.charAt(i) !=  s.charAt(i+1))
           {
               if(k > 1) temp = temp + s.charAt(i) + Integer.toString(k);
               else temp = temp + s.charAt(i);
               k = 1;
           }
           else
           {
               k++;
           }
        }
        if(k > 1) temp = temp + s.charAt(s.length()-1) + Integer.toString(k);
        else temp = temp + s.charAt(s.length()-1);
		return temp;
	}
}