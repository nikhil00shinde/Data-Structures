import java.io.*;
import java.util.*;

public class MinimumStack {

  public static class MinStack {
    Stack<Integer> allData;
    Stack<Integer> minData;

    public MinStack() {
      allData = new Stack<>();
      minData = new Stack<>();
    }


    int size() {
      return allData.size();
    }

    void push(int val) {
          allData.push(val);
          if(minData.size() == 0)
          {
              minData.push(val);
          }
          else 
          {
                if(val <= minData.peek())
              {
                  minData.push(val);
              }
          }
         
    }

    int pop() {
      int ans = -1;
        if(allData.size() == 0)
        {
          System.out.println("Stack underflow");
        }
        else
        {
           ans = allData.pop();
           if(ans == minData.peek())
           {
             minData.pop();
           }
        }
        return ans;
    }

    int top() {
       int ans = -1;
        if(allData.size() == 0)
        {
          System.out.println("Stack underflow");
        }
        else
        {
           ans = allData.pop();
        }
        return ans;
    }

    int min(){
  	     int ans = -1;
        if(minData.size() == 0)
        {
          System.out.println("Stack underflow");
        }
        else
        {
          ans = minData.peek();
        }
        return ans;
    }
  }

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    MinStack st = new MinStack();

    String str = br.readLine();
    while(str.equals("quit") == false){
      if(str.startsWith("push")){
        int val = Integer.parseInt(str.split(" ")[1]);
        st.push(val);
      } else if(str.startsWith("pop")){
        int val = st.pop();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("top")){
        int val = st.top();
        if(val != -1){
          System.out.println(val);
        }
      } else if(str.startsWith("size")){
        System.out.println(st.size());
      } else if(str.startsWith("min")){
        int val = st.min();
        if(val != -1){
          System.out.println(val);
        }
      }
      str = br.readLine();
    }
  }
}