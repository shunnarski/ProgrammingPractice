// Creating the bubble sort algorithm from scratch
package Useful_Algorithms;

/**
 *
 * @author ass0009
 */
public class BubbleSort {
    public static void main(String[] args){
        int arr[] = {1, 6, 4, 7, 2, 10, 55, 3, 65, 3};
        Bubble_Sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }    
    /*
    Strategy:
    Compare two values from left to right of the array and bubble up the 
    largest number in the array to the right side of the array.
    Repeat this step n number of times to place the kth largest value in 
    the n-k+1 index.
    */
    private static void Bubble_Sort(int[] inArray){
        for(int i = inArray.length; i > 0; i--){
            for(int j = 0; j < (i - 1); j++){
                if(inArray[j] > inArray[j + 1]){
                    // swap
                    int temp = inArray[j + 1];
                    inArray[j + 1] = inArray[j];
                    inArray[j] = temp;
                }
            }
        }
    }
}
