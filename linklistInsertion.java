
// insertion when we have only single data or static data to represent linked list

public class linklistInsertion
{
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
   public static void main(String[] args) {
    int k =20;
    Node newnode = new Node(k);
    Node head =null;
    if(head == null)
    {
        head = newnode;
    }
    
    Node temp = head;
    while (temp !=null)
    {
        System.out.println(temp.data);
        System.out.println(temp.next);
        temp = temp.next;
    }
   }
}