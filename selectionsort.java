import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args)
    {
        Scanner ms = new Scanner(System.in);
        System.out.println("enter your size of the array");
        int size = ms.nextInt();
        // initialize the array;
        int arr[] = new int[size];

        for(int i = 0;i<size;i++)
        {
            arr[i] = ms.nextInt();
        }
        System.out.println("data before applying selection sort");
        for(int print_data=0;print_data<size;print_data++)
        {
            System.out.print(arr[print_data] + " ");
        }
        System.out.println(" ");
        for(int i=0;i<size;i++)
        {
            // initialize min_index variable to store the minimum element and let the minimum element of the array be the first element.
            int min_index = i;
            for(int j=i+1;j<size;j++)
            // i^th element must be compared with the next element so we assigned j as the next element to i.
            {
                // compare the min_index element with j 
                if(arr[j] <= arr[min_index])
                {
                    min_index = j;
                    int temp = arr[min_index];
                    arr[min_index] = arr[i];
                    arr[i]= temp;
                }
            }
        }
        System.out.println("data after applying selection sort");
        for(int print_data=0;print_data<size;print_data++)
        {
            System.out.print(arr[print_data] + " ");
        }
        ms.close();
    }
}
