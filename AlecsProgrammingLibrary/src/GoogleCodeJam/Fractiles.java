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
 * @author ass0009
 */
public class Fractiles {
    public static void main(String[] args) throws IOException {
        String FILENAME = "D-small-practice.in";
        FileReader fr = new FileReader(FILENAME);
        FileWriter fw = new FileWriter("D-small-out.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++){
            String output = "";
            String line[] = br.readLine().split(" ");
            
            int K = Integer.parseInt(line[0]);
            int C = Integer.parseInt(line[1]);
            int S = Integer.parseInt(line[2]);
            // K: number of tiles
            // C: complexity of artwork
            // S: # of tiles we can clean
            if(K > Math.pow(S, C)){
                output = "IMPOSSIBLE";
            }
            else{
                output = "POSSIBLE";
            }
            
            String out = "Case #" + (i+1) + ": " + output;
            bw.write(out);
            bw.newLine();
            System.out.println(out);
        }
        
        
        br.close();
        bw.close();
    }
}
