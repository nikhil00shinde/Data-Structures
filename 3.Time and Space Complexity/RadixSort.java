import java.io.*;
import java.util.*;

// PRECEDENCE -> H > T > U
// use for sorting of telephonic number

public class RadixSort {

  public static void radixSort(int[] arr) {
    // write code here    

    int max = Integer.MIN_VALUE;
    for(int val: arr)
    {
        if(val > max)
        {
            max = val;
        }
    }
    int exp = 1;
    while(max > 0)
    {
        countSort(arr,exp);
        exp = exp * 10;
        max = max / 10;
    }
  }

  public static void countSort(int[] arr, int exp) {
    // write code here
    
    int[] range = new int[10];
    for(int i=0;i<arr.length;i++)
    {
          int k = (arr[i]/exp)%10;
          range[k]++;
    }

    for(int i=1;i<10;i++)
    {
        range[i] = range[i-1] + range[i];
    }
     
     int[] narr = new int[arr.length];
    for(int i = arr.length-1;i>=0;i--)
    {
        int k = (arr[i]/exp)%10;
        int in = --range[k];
        narr[in] = arr[i];
    }
   
    for(int i=0;i<arr.length;i++)
    {
        arr[i] = narr[i];
    }
   

    System.out.print("After sorting on " + exp + " place -> ");
    print(arr);
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    radixSort(arr);
    print(arr);
  }

}