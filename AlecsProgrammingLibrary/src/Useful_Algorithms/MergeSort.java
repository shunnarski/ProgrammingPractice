/*
    This algorithm is particularly useful for very large data sets because 
    it sorts an unsorted collection in O(NlogN) time best, average, and worst case,
    which is the inherent complexity of sorting, thus its the fastest algorithm
    to use for an unsorted collection. 
*/
package Useful_Algorithms;
import java.util.*;
/**
 *
 * @author Alec Shunnarah
 */
public class MergeSort {
       // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int left, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - left + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int [n1];
        int R[] = new int [n2];
 
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i)
            L[i] = arr[left + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[m + 1 + j];
 
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = left;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int left, int r)
    {
        if (left < r)
        {
            // Find the middle point
            int m = (left+r)/2;
 
            // Sort first and second halves
            sort(arr, left, m);
            sort(arr , m+1, r);
 
            // Merge the sorted halves
            merge(arr, left, m, r);
        }
    }
}
