import java.util.*;
import java.io.*;
// Insertion sorting 
public class insertionsort {
public static void main(String[] args) {
    int A[] ={9,6,7,5,2,8};
    for(int i=1;i<=A.length-1;i++)
    {
        int current_Element = A[i];
        // for(int j=i-1;j>=0;j--)
        // {
        //     if(current_Element<A[j])
        //     {
        //         int temp = A[j];
        //         A[j] = A[j+1];
        //         A[j+1] = temp;
        //     }
        // }

        /* ************************* Reducing the variable temp for memory optimization ************************ */
        int j = i-1;
        while(j>=0 && A[j]>current_Element)
        {
            A[j+1] = A[j];
            j=j-1;
        }
            A[j+1] = current_Element;
    }
    for(int i=0;i<=A.length-1;i++)
    {
        System.out.print(A[i]);
    }
}
    
}
