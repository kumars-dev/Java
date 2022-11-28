import java.util.Scanner;
public class Revarray {
    public static void main(String[] args) {
        Scanner rev = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int input = rev.nextInt();
        int counter = input-1;
        int element [] = new int[input];
        System.out.println("enter the elements: ");
        for(int i = 0;i<input;i++)
        {
            element[i]= rev.nextInt();
        }
        for(int i = 0;i<counter;i++)
        {
            int temp = element[i];
            element[i] = element[counter];
            element[counter] = temp;
            counter--;
        }

        for(int i=0;i<input;i++)
        {
            System.out.println("element at " + i +" = "+ element[i]);
        }
        rev.close();
    }
}
