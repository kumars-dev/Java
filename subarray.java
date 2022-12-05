import java.util.Scanner;
public class subarray {
    public static void main(String[] args) {
        Scanner subarr = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = subarr.nextInt();
        int arr[] = new int[n];
        
        // entering the values for array;
        for(int i=0;i<n;i++)
        {
            arr[i] = subarr.nextInt();
        }

        // logic:
        
       for(int startin=0;startin<n;startin++) 
       {
        for(int endin = startin;endin<n;endin++)
        {
            for(int m = startin;m<=endin;m++)
            {
                System.out.print(arr[m] + " ");
            }
            System.out.println();
        }
       }
    }
}
