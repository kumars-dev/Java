import java.util.Scanner;
public class maxarray {
    public static void main(String[] args) {
        Scanner max = new Scanner(System.in);
        System.out.println("enter size of the element : ");
        int size = max.nextInt();
        System.out.println("enter the elements in array");
        int input[] = new int[size];
        int j = size;
        int maxele=0;
// input the elements of array
        for (int i = 0 ; i<j;i++)
        {
            input[i] = max.nextInt();
        }
// output of the array in ascending order;
        for(int k = 0; k<j;k++)
        {
            if(maxele<input[k])
            {
                maxele = input[k];
            }
        }
        System.out.println("max element in the array is : "+maxele);
    }
}
