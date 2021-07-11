import java.util.*;

public class RemovePrimes
{
    public static void main(String[] args)
    {
        Scanner scn = new  Scanner(System.in);
        int n = scn.nextInt();

        ArrayList<Integer> al = new ArrayList<>();

        for(int i=0;i<n;i++)
        {
            al.add(scn.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
    public static void solution(ArrayList<Integer> al)
    {
           int n = al.size();

           for(int i=n-1;i>=0;i--)
           {
                if(isPrime(al.get(i)) == true)
                {
                    al.remove(i);
                }
           }
    }
    public static boolean isPrime(int val)
    {
         for(int i=2;i<=(int)(Math.sqrt(val));i++)
         {
               if(val%i ==0)
               {
                   return false;
               }
         }
         return true;
    }
}