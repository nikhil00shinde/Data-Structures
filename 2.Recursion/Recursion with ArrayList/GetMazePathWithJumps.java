import java.util.*;

public class GetMazePathWithJumps
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        ArrayList<String> ans = getMazePathWithJumps(0,0,n-1,m-1);
        System.out.println(ans);
    }

    public static ArrayList<String> getMazePathWithJumps(int sr,int sc,int dr,int dc)
    {
        if(sr == dr && sc == dc)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
       ArrayList<String> myans = new ArrayList<>();  
       for(int i=1;i+sc<=dc;i++)
       {
                ArrayList<String> hans = getMazePathWithJumps(sr,sc+i,dr,dc);
                for(int j=0;j<hans.size();j++)
                {
                    myans.add("h"+i+hans.get(j));
                }
       }

       for(int i=1;i+sr<=dr;i++)
       {
                ArrayList<String> hans = getMazePathWithJumps(sr+i,sc,dr,dc);
                for(int j=0;j<hans.size();j++)
                {
                    myans.add("v"+i+hans.get(j));
                }
       }
       for(int i=1;i+sr<=dr && i+sc<=dc;i++)
       {
                ArrayList<String> hans = getMazePathWithJumps(sr+i,sc+i,dr,dc);
                for(int j=0;j<hans.size();j++)
                {
                    myans.add("d"+i+hans.get(j));
                }
       }
       return myans;
    }
}