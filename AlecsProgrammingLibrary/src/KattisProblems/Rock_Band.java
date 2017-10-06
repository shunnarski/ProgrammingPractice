/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KattisProblems;
import java.util.*;
/**
 *
 * @author ass0009
 */
public class Rock_Band {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int M = in.nextInt();
        int S = in.nextInt();
        
        ArrayList<int[]> array = new ArrayList();
        
        // produce the arrays
        for(int i = 0; i < M; i++){
            int[] arr = new int[S];
            for(int j = 0; j < S; j++){
                arr[j] = in.nextInt();
            }
            array.add(arr);
        }
        
        int maxIndex = 0;
        int firstVals[] = new int[M];
        
        for(int i = 0; i < array.size(); i++){
            firstVals[i] = array.get(i)[0];
        }
        for(int i = 0; i < array.size(); i++){
            int temp[] = array.get(i);
            int m = temp.length / 2;
            int firstH[] = new int[m];
            boolean contained = false;
            for(int k = 0; k < m; k++){
                firstH[k] = temp[k];
            }
            for(int k = 0; k < firstVals.length; k++){
                for(int j = 1; j <= firstH.length; j++){
                    if(firstH[j - 1] == firstVals[k] && firstH[0] != firstVals[k]){
                        if((j - 1) > maxIndex){
                            maxIndex = j;
                        }
                        contained = true;
                    }
                }
            }
            
            if(!contained){
                int secondSize = temp.length - m;
                int secondH[] = new int[secondSize];
                for(int k = 0; k < secondSize; k++){
                    secondH[k] = temp[k + m];
                }
                for(int k = 0; k < firstVals.length; k++){
                    for(int j = 1; j <= secondH.length; j++){
                        if(secondH[j - 1] == firstVals[k]){
                            if((j - 1) > maxIndex){
                                maxIndex = j + m - 1;
                            }
                        }
                    }
                }
            }
        }
        int[] outputArr = new int[maxIndex + 1];
        String output = "";
        for(int i = 0; i < maxIndex + 1; i++){
            int temp[] = array.get(0);
            outputArr[i] = temp[i];
        }
        
        // actually write the sorting algorithm for practice
        // insertion sort
        for(int i = 1; i < outputArr.length; i++){
            int key = outputArr[i];
            int j = i - 1;
            while(j >= 0 && outputArr[j] > key){
                outputArr[j+1] = outputArr[j];
                j = j - 1;
            }
            outputArr[j+1] = key;
        }
        
        System.out.println(outputArr.length);
        
        for(int i = 0; i < outputArr.length; i++){
            output += outputArr[i] + " ";
        }
        System.out.println(output.trim());
    }
}
