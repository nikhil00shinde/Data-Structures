// The main to remember in count sort is that it do stable sort and contain array of prefix sum of last index of array.
// What is stable sort -> stable sort is that jab koi do(2) value same, jo pehli aayi ho value voh hi pehle aani chahiye hamare ans array me 

// To preserve the relative order that is stable sort

// We apply count jab value bohot jyada ho and range kam ho
import java.util.*;

import java.io.*;
import java.util.*;

public class CountSort {

   public static void countSort(int[] arr, int min, int max) {
   //write your code here
    int range = max - min +1;
    int [] prefixSum = getPrefixSum(arr,range,min);
    int [] ans = new int[arr.length];
    for(int i=arr.length-1;i>=0;i--)
    {
        int x = prefixSum[arr[i]-min];
       ans[x] = arr[i];
       prefixSum[arr[i]-min]--;
    }

    for(int i=0;i<arr.length;i++)
    {
        arr[i] = ans[i];
    }
  }

  public static int[]getPrefixSum(int[] arr,int range,int min)
  {
      int[] prefix = new int[range];
      for(int i=0;i<arr.length;i++)
      {
          int index = arr[i]-min;
          prefix[index]++;
      }

    //   calculating prefix sum
      for(int i=1;i<range;i++)
      {
          prefix[i] = prefix[i-1] + prefix[i];
      }
    //   doing -1 to get last to get last index 
      for(int i=0;i<range;i++)
      {
          prefix[i]--;
      }
      return prefix;
  }

  public static void print(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    print(arr);
  }

}