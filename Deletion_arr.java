public class Deletion_arr {

    public static void main(String[] args) {
        int position = 2,i;
        int [] a = new int[]{10,20,30,40};
        int [] b= new int[3];
        for(i=0;i<3;i++)
        {
            if(i<position)
            {
                b[i] = a[i];
            }
            else if(i==position)
            {
                b[i] = a[i+1]; // b[2] = a[3] means value of a[3] is moved at b[2];
            }
            else
            {
                // b[i] = a[i+1];
                break;
            }
        }
        System.out.println("array are:");
        for(i=0;i<3;i++)
        {
            System.out.println(b[i]);
        }
    }
}