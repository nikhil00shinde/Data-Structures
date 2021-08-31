//sort 012
//divide in 3 section
// 0 to i-1 -> 0's region
//i to j-1 -> 1's region
//j to k-1 -> 2's region

//THE ONLY PROBLEM IS THAT IT WILL GET CONFUSING AS WE FOR 0's element 
import java.util.*;

public class Sort012_1ways
{
   
  public static void sort012(int[] arr){
    //write your code here
    int n = arr.length;
    int i=0,j=0,k=0;

    while(k<n)
    {
        if(arr[k] == 0)
        { 
           swap(arr,j,k);
           swap(arr,i,j);
           i++; j++; k++;
        }
        else if(arr[k] == 1)
        {
               swap(arr,j,k);
               j++;
               k++;
        }
        else
        {
           k++;
        }
    }
    
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j) {
    System.out.println("Swapping index " + i + " and index " + j);
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    sort012(arr);
    print(arr);
  }
}