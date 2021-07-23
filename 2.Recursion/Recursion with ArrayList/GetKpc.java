import java.util.*;

public class GetKpc
{
    public static String[] str = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        ArrayList<String> ans = getKpc(s);
        System.out.println(ans);
    }
    public static ArrayList<String> getKpc(String s)
    {
        if(s.length() == 0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
      
      ArrayList<String> ans = getKpc(s.substring(1));
      ArrayList<String> rans = new ArrayList<>();
      int  num = (int)(s.charAt(0)-'0');
      String k =  str[num];
      for(int i=0;i<k.length();i++)
      {
          for(int j=0;j<ans.size();j++)
          {
              rans.add(k.charAt(i) + ans.get(j));
          }
      }
      return rans;
    }
}