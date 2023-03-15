public class Binary_searchalgo {
    public static void main(String[] args)
    {
        int []array = new int []{1,3,3,5,9,12,22,38,45};
        int k = 22;
        int n = array.length;
        int low =0;
        int high = n-1;
        while(low<=high)
        {
            int mid = low + (high-low)/2;
            if(array[mid]<k)
            {
                low = mid + 1;
            }
            else if(array[mid]>k)
            {
                high = mid - 1;
            }
            else 
            {
                System.out.print("element " + k + " found at index : "+ mid);
                break;
            }
        }
    }
}
