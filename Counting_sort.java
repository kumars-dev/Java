public class Counting_sort {
    public static void main(String[] args) {
        int[] arr = new int[]{6,9,2,10,8,6,4,1,5,9,4,6,9,1};
        System.out.println("Original array");
        print(arr);
        countingsort(arr);
        System.out.println("sorted array");
        print(arr);
    }
    private static int maximum(int[] arr)
    {
        int n = arr.length;
        int max = 0;
        // OR int max = Integer.Min_Value;
        for(int i = 0;i<n;++i)
        {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    private static void countingsort(int[] arr)
    {
        int n = arr.length;
        int max = maximum(arr);
        int [] count = new int[max+1];
        for(int i=0;i<n;++i)
        {
            count[arr[i]]++;
            // returns the occurrences of arr elements.
        }

        // position
        int previous_index=0;
        for(int i=0;i<=max;++i)
        {
            while(count[i]-- > 0)
            {
                arr[previous_index++] = i;
            }
        }
    }

    // printing the elements
    private static void print(int[] arr)
    {
        int n = arr.length;
        for(int i=0;i<n;++i)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
