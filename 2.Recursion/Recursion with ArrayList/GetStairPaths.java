import java.util.*;

public class GetStairPaths
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> ans = getStairPaths(n);
        System.out.println(ans);
    }
    public static ArrayList<String> getStairPaths(int n)
    {
        if(n==0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        ArrayList<String> myans = new ArrayList<>();
        //1 step
        if( n - 1 >= 0)
        {
            ArrayList<String> ans = getStairPaths(n-1);
            for(int i=0;i<ans.size();i++)
            {
                myans.add(1+ans.get(i));
            }
        }
        //2 step
        if(n-2 >= 0)
        {
              ArrayList<String> ans = getStairPaths(n-2);
              for(int i=0;i<ans.size();i++)
            {
                myans.add(2+ans.get(i));
            }
        }
        //3 step
        if(n-3 >= 0)
        {
            ArrayList<String> ans = getStairPaths(n-3);
            for(int i=0;i<ans.size();i++)
            {
                myans.add(3+ans.get(i));
            }
        }
        return myans;
    }
}