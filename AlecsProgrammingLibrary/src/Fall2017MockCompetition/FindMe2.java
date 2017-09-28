
//package Fall2017MockCompetition;
import java.util.*;
/**

 * @author alecshunnarah
 */
public class FindMe2 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; ++i){
            int x = in.nextInt();
            arr[i] = x;
        }
        sort(arr, 0, arr.length - 1);
        System.out.println(findK(arr, k));
            
        
        
    }
    static void merge(int[] arr, int left, int mid, int right) {
        // left size and right size of the array
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        //instantiate arrays with these sizes
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        // instantiate the left and right arrays
        for(int i = 0; i < L.length; ++i)
            L[i] = arr[left + i];
        for(int i = 0; i < R.length; ++i)
            R[i] = arr[mid + 1 + i];
        
        int i = 0; 
        int j = 0;
        
        int k = left;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }
            else{
                arr[k] = R[i];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }   

    }
    // implements merge sort
    static void sort(int[] arr, int left, int right) {
        if(left < right) {
            int m = (left + right) / 2;
            
            sort(arr, left, m);
            sort(arr, m+1, right);
            
            merge(arr, left, m, right);
        }
    }
    
    // find the kth element
    static int findK(int[] arr, int k){
        return arr[arr.length - k];
    }

}
