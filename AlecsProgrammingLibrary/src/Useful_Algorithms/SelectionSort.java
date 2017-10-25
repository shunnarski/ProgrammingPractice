//Writing a Selection Sort algorithm from scratch
package Useful_Algorithms;

/**
 *
 * @author ass0009
 */
public class SelectionSort {
    public static void main(String[] args){
        int arr[] = {1, 6, 4, 7, 2, 10, 55, 3, 65, 3};
        Selection_Sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    /* 
    Strategy: 
    Start from the beginning and go through the array to find the smallest value
    in the array. Then move up to the i+1th array and go through that sub array to fin dth esmallest value.
    Each time the smallest value is found, swap it with the ith position. 
    */
    private static void Selection_Sort(int[] A){
        for(int i = 0; i < A.length; i++){
            int smallest = A[i];
            int temp = i;
            for(int j = i; j < A.length; j++){
                if(smallest > A[j]){
                    smallest = A[j];
                    temp = j;
                }
            }
            A[temp] = A[i];
            A[i] = smallest;
            
        }
    }
}
