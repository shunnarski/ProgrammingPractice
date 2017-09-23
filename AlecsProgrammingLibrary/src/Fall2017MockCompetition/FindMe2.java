
package Fall2017MockCompetition;
import java.util.*;
/**
 *
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
        int sortedArray[] = sortArray(arr);
        for(int i = 0; i < sortedArray.length; ++i){
            System.out.println(sortedArray[i]);
        }
            
        
        
    }
    static int[] sortArray(int[] arr) {
        for(int i = 0; i < arr.length; i++){
            for(int k = i; k > 0; i--){
                if(arr[k] < arr[k - 1]){
                   int temp = arr[k];
                   arr[k] = arr[k - 1];
                   arr[k - 1] = temp;
                }
                
            }
        }
        return arr;
    }
    
    static int findK(int[] arr, int k) {
        
        return 0;
    }

}
