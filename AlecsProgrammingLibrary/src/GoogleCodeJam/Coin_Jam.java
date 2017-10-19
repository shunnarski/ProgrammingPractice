/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GoogleCodeJam;
import java.util.*;
import java.io.*;
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
        
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String output = "";
            int N = br.read();
            int J = br.read();
            
                      
            String out = "Case #" + (i+1) + ": " + output;
        }
        
        br.close();
        bw.close();
        
    }
}
