import java.util.Scanner;
public class twodarray {
    public static void main(String[] args) {
        Scanner twod = new Scanner(System.in);
        System.out.println("enter the rows");
        int row = twod.nextInt();
        System.out.println("enter the columns");
        int column = twod.nextInt();
        int[][] arr = new int[row][column];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]= twod.nextInt();
            }
            // System.out.println();
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
        System.out.println();
        }
        twod.close();
    }
}
