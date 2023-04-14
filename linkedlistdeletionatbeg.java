import java.util.*;
public class linkedlistdeletionatbeg {
    static class Node{
        int data;
        Node next;
        // constructor
        public Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args)
    {
        // insertion for deleting the element
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int k;
        //insertion 
        do
        {
            System.out.println("enter the data");
            int data = sc.nextInt();
            Node newnode = new Node(data);
            if(head == null)
            {
                head = newnode;
            }
            else{
                newnode.next = head;
                head = newnode;
            }
            System.out.println("are you want to enter the data! if 'yes' then press 1 otherwise 2");
            k= sc.nextInt();
        }
        while(k == 1);
        // deletion at beginning .................................
        Node temp = head;
        temp = temp.next;
        head = temp;
        // .......................................................
            while (temp != null)
            {
                System.out.print(temp.data);
                temp = temp.next;
            }
        sc.close();
    }
}
