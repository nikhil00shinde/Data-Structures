import java.util.*;

public class GetMazePaths{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();

       ArrayList<String> ans =  getMazePaths(0,0,n-1,m-1);
       System.out.println(ans);
    }

    public static ArrayList<String> getMazePaths(int sr,int sc,int dr,int dc)
    {
        if(sr == dr && sc == dc)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }

        if(sr > dr || sc > dc)
        {
            ArrayList<String> ans = new ArrayList<>();
            return ans;
        }

      
       ArrayList<String> ans = new ArrayList<>();

        //horizontal right step
        ArrayList<String> hans = getMazePaths(sr,sc+1,dr,dc);
        //vertical down step
        ArrayList<String> vans = getMazePaths(sr+1,sc,dr,dc);

        for(int i=0;i<hans.size();i++)
        {
            ans.add('h'+hans.get(i));
        }
        for(int i=0;i<vans.size();i++)
        {
            ans.add('v'+vans.get(i));
        }
        return ans;
     }
}