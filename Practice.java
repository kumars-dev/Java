// so this program won't create memory space dynamic n array this resolve in linked list or through exception handling.
// this is prove of, array is fixed if once defined and cannot change the size.


// problem is : create an array and insert element at last/end.
//solution to that problem is in insertion.java. visit it.
import java.util.Scanner;
public class Practice {
    public static void main(String[] args) 
    {
        // insertion practice;
        Scanner pra = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = pra.nextInt();
        System.out.println("size of the array is : " + size);
        int upperbond = size;
        int data = 80;
        int j;
        int arr[] = new int[size];
        for(int i=0;i<upperbond;i++)
        {
            arr[i]= pra.nextInt();           
        }
        for(j = 0;j<upperbond;j++)
        {
            if(j==upperbond-1)
            {
                size = size+1;
                System.out.println(size);
                arr[j+1] = data;
            }
            // System.out.println("array of j: " + arr[j]);
        }
        System.out.println("printing element of the array");
        for(int i=0;i<upperbond;i++)
        {
            System.out.println(arr[i]);

            // inserting new element 
            
        }
        pra.close();
    }
}
