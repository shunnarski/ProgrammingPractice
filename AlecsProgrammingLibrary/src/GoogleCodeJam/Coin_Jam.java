/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleCodeJam;

import java.util.*;
import java.io.*;
import java.lang.Math;

/**
 *
 * @author alecshunnarah
 */
public class Coin_Jam {

    public static void main(String[] args) throws IOException {
        String fileName = "C-small-practice.in.txt";
        FileReader fr = new FileReader(fileName);
        FileWriter fw = new FileWriter("Coin-jam-small.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);

        String output = "";
        int N = br.read();
        int J = br.read();
        final int base2 = 2;
        final int base3 = 3;
        final int base4 = 4;
        final int base5 = 5;
        final int base6 = 6;
        final int base7 = 7;
        final int base8 = 8;
        final int base9 = 9;
        final int base10 = 10;
        HashSet<String> binarysViewed = new HashSet();
        int binariesFound = 0;
        
        while(binariesFound < J){
            int binary[] = new int[N];
            binary[0] = 1;
            binary[N - 1] = 1;
            while(arraySum(binary) < N){
                
            }
            
            
            
            // binary found
            binariesFound++;
        }

        String out = "Case #" + 1 + ": " + output;
        bw.write(out);
        bw.newLine();

        br.close();
        bw.close();

    }
    
    private static boolean isPrime(int num){
        int i = 2;
        if(num == 2){
            return true;
        }
        double sqrt = Math.sqrt(num);
        while(i <= sqrt){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        
        return true;
    }
    
    private static int arraySum(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        
        return sum;
    }
}
