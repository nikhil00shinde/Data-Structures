// In linked list we don't have continous memory allocation like array that was the biggest disadvantage of array

public class LinkedListDemo{
  
    public static class LinkedList{
        Node head;
        Node tail;
        int size;


        LinkedList()
        {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        void add(int val)
        {
            Node nn = new Node(val);
            if(size == 0)
            {
                this.head = this.tail= nn;
            }
            else
            {
                tail.next = nn;
                tail = nn;
            }
            size++; 
        }

         void display()
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    } 
    public static void main(String[] args){
        
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        list.display();

    }
}