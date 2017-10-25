/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Useful_Algorithms;

/**
 *
 * @author ass0009
 */
public class InsertionSort {
    public static void main(String[] args){
        int arr[] = {1, 6, 4, 7, 2, 10, 55, 3, 65, 3};
        Insertion_Sort(arr);
        for(int i : arr){
            System.out.print(i + " ");
        }
    }
    
    /*
    Strategy: 
    Start from beginning of the array. For each number as we move up the array, 
    shift every number than that number to the right of it. 
    */
    private static void Insertion_Sort(int[] A){
        for(int i = 0; i < A.length; i++){
            int temp = A[i];
            for(int j = i - 1; j >= 0; j--){
                if(temp < A[j]){
                    //swap
                    A[j + 1] = A[j];
                    A[j] = temp;
                }
            }
        }
    }
}
