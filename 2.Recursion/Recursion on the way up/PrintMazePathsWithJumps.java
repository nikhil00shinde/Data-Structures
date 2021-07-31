import java.util.*;

public class PrintMazePathsWithJumps
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePaths(0,0,n-1,m-1,"");
    }
     // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf)
    {
        if(sr == dr && sc == dc)
        {
            System.out.println(psf);
        }
        for(int i=1;i+sc<=dc;i++)
        {
            printMazePaths(sr,sc+i,dr,dc,psf+"h"+i); //horizontal
        }

        for(int i=1;i+sr<=dr;i++)
        {
             printMazePaths(sr+i,sc,dr,dc,psf+"v"+i); //vertical
        }

        for(int i=1;i+sr<=dr && i+sc<=dc;i++)
        {
             printMazePaths(sr+i,sc+i,dr,dc,psf+"d"+i); //diagonal
        }
    }
}