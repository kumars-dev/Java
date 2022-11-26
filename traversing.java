import java.util.*;
public class traversing {
    public static void main(String args[]) {
        Scanner tra = new Scanner(System.in);
        System.out.println("enter number of arrays");
        int input = tra.nextInt();
        int arr[] = new int[input];
        System.out.println("size of the array is: "+ arr.length);
        for(int i = 0; i<arr.length;i++)
        {
            System.out.print(i + " = " + (arr[i] = tra.nextInt()) + "\n");
        }
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println("\n" + i + " = " + arr[i]);
        }
        tra.close();
    }
}