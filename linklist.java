import java.util.Scanner;

public class linklist {
    static class Node
    {
        // data member of the class
        static int data;
        Node next;
        Node(int data)
        {
            this.data = data;
            this.next = next;
        }    
    }
    Node head = null;
        public void creation()
        {
            Scanner sc = new Scanner(System.in);
            int data = sc.nextInt();
            Node nodeobj = new Node(data);
            if(head == null)
            {
                head = nodeobj;
            }
            else{
                nodeobj.next = head;
                head = nodeobj;
                System.out.println(data);
            }
        }
        public static void main(String[] args) {
          linklist obj = new linklist();
          obj.creation();
         }
}
    
    

