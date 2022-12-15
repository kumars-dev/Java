import java.util.Scanner;
public class transpose {
    public static void main(String[] args) {
        Scanner transpose = new Scanner(System.in);
        System.out.println("enter the rows for array");
        int row = transpose.nextInt();
        System.out.println("enter the columns for array");
        int column = transpose.nextInt();
        // declaring array
        int[][] arr = new int[row][column];
        // input by users.
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.println(i + " "+ j + "=" + (arr[i][j] = transpose.nextInt()));
                // ;
            }
        }

        // output of transpose matrix

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
// main transpose logic is there;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<i;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println();
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        transpose.close();
    }
}
