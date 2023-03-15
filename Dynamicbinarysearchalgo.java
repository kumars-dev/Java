import java.util.*;
public class Dynamicbinarysearchalgo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int j=0;j<size;j++)
        {
            System.out.print(arr[j] + " ");
        }
        // take the element to search 
        int k = sc.nextInt();
        // searching element from the above listed items
        int low = 0, high = size-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(arr[mid]<k)
            {
                low = mid + 1;
            }
            else if(arr[mid]>k)
            {
                high = mid -1;
            }
            else
            {
                System.out.print(arr[mid] + " value found at index: " + mid);
                break;
            }
        }
    }
    
}
