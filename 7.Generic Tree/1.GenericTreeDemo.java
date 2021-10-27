import java.io.*;
import java.util.*;

public class GenericTreeDemo
{

    public static class Node
    {
        int data;
        ArrayList<Node> children;

        Node(){

        }
        Node(int data){
            this.data = data;
            children = new ArrayList<>();
        }
    }

    public static Node construct(int[] data)
    {
        Stack<Node> st = new Stack<>();
        Node root = null;
        for(int i=0;i<data.length;i++)
        {
             if(data[i] == -1)
             {
                st.pop();
             }
             else
             {
                 Node nn = new Node(data[i]);
                  if(root == null)
                  {
                      st.push(nn);
                      root = nn;
                  }
                  else
                  {
                      Node peek = st.peek();
                      peek.children.add(nn);
                      st.push(nn);
                  }
             }
        }
        return root;
    }

    public static void display(Node root)
    {
        ArrayList<Node> childrens = root.children;
        System.out.print(root.data+" -> ");
        for(int i=0;i<childrens.size();i++)
        {
            System.out.print(childrens.get(i).data+" ");
        }
        System.out.println();

        for(int i=0;i<childrens.size();i++)
        {
            display(childrens.get(i));
        }
    }
    public static void main(String[] args)
    {
       int[] data = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};

       Node root = construct(data);

       display(root);
    }
}