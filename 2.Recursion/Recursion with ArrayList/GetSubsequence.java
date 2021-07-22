import java.util.*;

public class GetSubsequence
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        String s =  scn.next();
        ArrayList<String> ans = gss(s);
        System.out.println(ans);
    }

    public static ArrayList<String> gss(String s)
    {
        if(s.length() == 0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }


        ArrayList<String> rans = gss(s.substring(1));
        
        ArrayList<String> ans = new ArrayList<>();
 
        //s.chatAt(0) has no choice
        for(int i=0;i<rans.size();i++)
        {
            String k = rans.get(i);
            ans.add(k);
        }

        //s.charAt(0) has choice
        for(int i=0;i<rans.size();i++)
        {
            String k = s.charAt(0) + rans.get(i);
            ans.add(k);
        }
        return ans;
    }
}