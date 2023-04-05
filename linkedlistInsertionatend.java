import java.util.Scanner;
public class linkedlistInsertionatend {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }

    // traversal function
    public void traversed()
    {

    }
    public static void main(String[] args) {
        int data,n;
        Node head = null;
        Scanner sc = new Scanner(System.in);
        do
        {
            System.out.println("enter data");
            data = sc.nextInt();
            Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
            }
            else{
                Node temp = head;
                while(temp.next!=null)
                {
                    temp = temp.next;
                }
                temp.next = newnode;
                newnode.next= null;
            }
            System.out.println("do you want to create more node? just press 1!");
            n= sc.nextInt();           
        }
        while(n==1);
        // if(head == null)
        // {
        //     System.out.println("linklist does not exist");
        // }
        
            Node temp = head;
            while(temp != null)
            {
                System.out.println(temp.data);
                temp = temp.next;
            }
        
        sc.close();
    }
}
// code completed for the linklist insertion at the end via dynamically................
//  lots of love guys.