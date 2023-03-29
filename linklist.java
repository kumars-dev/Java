import java.util.Scanner;

public class linklist
{
    static class Node
    {
        // data member of the class
        int data;
        Node next;
        // constructor
        Node(int data)
        {
            this.data = data;
            // this.next = next;
        }    
    }
    Node head = null;
        public void creation()
        {
            int n,data;
            Scanner sc = new Scanner(System.in);
            do
            {
               System.out.println("enter the data");
                data = sc.nextInt();
                Node nodeobj = new Node(data);
                    if(head == null)
                    {
                        head = nodeobj;
                    }
                    else
                    {
                        nodeobj.next = head;
                        head = nodeobj;                    
                    }
                    System.out.println("do you want to continue to add more node, if yes, press 1");
                    n=sc.nextInt();
            }
            while(n==1);
            sc.close();
       
        }
        public void traversal()
        {
            Node temp = head;
           if(head ==null)
           {
            System.out.println("ll is not exist");
           }
           else
           {
            while(temp!=null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
           }
        }
        public static void main(String[] args) {
          linklist obj = new linklist();
          obj.creation();
          obj.traversal();
         }
}
    
    

