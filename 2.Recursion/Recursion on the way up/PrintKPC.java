import java.util.*;

public class PrintKPC
{
    public static ArrayList<String> kpc; 
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s = scn.next();
        
        kpc = new ArrayList<>();
        kpc.add(".;");
        kpc.add("abc");
        kpc.add("def");
        kpc.add("ghi");
        kpc.add("jkl");
        kpc.add("mno");
        kpc.add("pqrs");
        kpc.add("tu");
        kpc.add("vwx");
        kpc.add("yz");
        printKPC(s,"");
    }

    public static void printKPC(String s,String ans)
    {
         
         if(s.length() == 0)
         {
             System.out.println(ans);
             return ;
         }
        //check for contribution at each level how many options is their
        int k = (int)(s.charAt(0) - '0');
        String key = kpc.get(k);

        for(int i=0;i<key.length();i++)
        {
            printKPC(s.substring(1),ans+key.charAt(i));
        }
    }

}