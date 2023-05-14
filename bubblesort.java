/**
 * bubblesort
 */
import java.util.Scanner;
public class bubblesort {
    public static void bubble_sort(int[] arr)
    {
        int len = arr.length;
        for(int i=0;i<len-1;i++)
        {
            for(int j=0;j<len-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j+1];
                    arr[j+1] =arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of the array");
        int size = sc.nextInt();
        int array[] = new int[size];
        // input
        for(int i=0;i<size;i++)
        {
            array[i] = sc.nextInt();
        }
        System.out.println("array element before bubble sort");
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i] + " ");
        }
        System.out.println("***********************************");
        System.out.println("array element after bubble sort");
        bubble_sort(array);
        for(int i=0;i<size;i++)
        {
            System.out.println(array[i]);
        }
    }
}