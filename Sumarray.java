import java.util.Scanner;
public class Sumarray
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int size = input.nextInt();
        int arr[]= new int[size];
        int sum = 0;
        System.out.println("enter the elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = input.nextInt();
        }
        System.out.println("output is : ");
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        System.out.println("total of all element is : " + sum);
        input.close();
    }
}