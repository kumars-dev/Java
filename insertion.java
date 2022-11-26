// solution of practice.java;
import java.util.*;
public class insertion {
    public static void main(String[] args) 
    {
        Scanner ins = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = ins.nextInt();
        int j = size;
        int data =10;
        int arr1[] = new int [size];
        int arr2[] = new int [size+1];
        System.out.println("enter elements : ");
        for( int i = 0; i<j;i++)
        {
            arr1[i] = ins.nextInt();
        }
        for( int i =0;i<arr2.length;i++)
        {
            // if(i<)
            
            if(i == arr2.length -1)
            {
                arr2[i] = data;
            }
            else{
                arr2[i] = arr1[i];
            }
            System.out.println(arr2[i]);
        }
        ins.close();
    }
}
