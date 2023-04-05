import java.util.Scanner;
public class linkedlistInsertionatlocation 
{
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static void main(String[] args)
    {
        int k;
        Scanner sc = new Scanner(System.in);
        Node head = null;
        do
        {   System.out.println("enter the node data");        
            int data = sc.nextInt();
            Node newnode = new Node(data);
            // Node head =null;
                    if(head == null)
                    {
                        head = newnode;
                    }
                    else
                    {
                        // insertion at begning 
                        newnode.next = head;
                        head = newnode;
                    }
                    System.out.println("enter again? if pressed 1;");
                    k = sc.nextInt();           
        }  
        while(k==1);          
            // below code is not executing........................
            int n, m;
            do
            {
                System.out.println("do you want to insert new node but at specific location then press 1");
                n = sc.nextInt();
                if(n==1)
                {
                    System.out.println("enter the new data to be filled in newnode");
                    int newdata = sc.nextInt();
                    System.out.println("enter the location where you want to insert node");
                    int loc = sc.nextInt();
                    Node new_node = new Node(newdata);
                    // Node head = null;
                    Node temp = head;
                    for(int i = 0; i<loc; i++)
                    {
                        temp = temp.next;
                    }
                    new_node.next = temp.next;
                    temp.next = new_node;
                }
                System.out.println("do you want to input again? Press 2");
                m= sc.nextInt();
            }
            while(m==2);
            Node temp = head;
            while (temp != null)
            {
                System.out.print(temp.data);
                temp = temp.next;
            }
        sc.close();
    }
        // Node temp = head;10
}

