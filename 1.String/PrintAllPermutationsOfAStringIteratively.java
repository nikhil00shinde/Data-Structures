import java.util.*;

public class PrintAllPermutationsOfAStringIteratively
{
    //permutation -> arrangemenet (n!)  (n factorial)
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        solution(s);
    }
    public static void print(String s)
    {
         int len = s.length();
         int perm = getPermutation(len);

         for(int i=0;i<perm;i++)
         {
             int k  = len;
             int d = i;
             int r = 0;

             String temp = "";
             StringBuilder  sb  = new StringBuilder(s);
             while(k>0)
             {
               r = d % k;
               d = d / k;
               temp = temp + sb.charAt(r);
               sb.deleteCharAt(r);
               k--;
             }
             System.out.println(temp);
         }
    }

    //Maam approach
    public static void solution(String str){
		// write your code here
		int n = str.length();
		int perm = getPermutation(n);
		
		for(int i=0;i<perm;i++)
		{
		    StringBuilder temp = new StringBuilder("");
            StringBuilder sb = new StringBuilder(str);

            int j = i;
            int len = n;

            while(len >= 1)
            {
                int r = j % len;
                j = j / len;

                temp.append(sb.charAt(r));
                sb.deleteCharAt(r);
                len--;
            }
            System.out.println(temp);
		}
    }
    public static int getPermutation(int n)
    {
        int k = 1;
        for(int i=2;i<=n;i++)
        {
            k *=i;
        }

        return k;
    }
}