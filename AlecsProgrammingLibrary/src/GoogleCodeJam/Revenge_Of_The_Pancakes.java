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
public class Revenge_Of_The_Pancakes {
    public static void main(String[] args) throws IOException {
        String fileName = "B-large-practice.in.txt";
        FileReader fr = new FileReader(fileName);
        FileWriter fw = new FileWriter("Pancakes_large.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        HashMap<Character, Character> map = new HashMap();
        map.put('+', '-');
        map.put('-', '+');
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++){
            char pancakes[] = br.readLine().toCharArray();
            int flips = 0;
            
            while(true){
               boolean allHappy = true;
               for(char c: pancakes){
                   if(c == '-'){
                       allHappy = false;
                       break;
                   }
               }
               if(allHappy){
                   break;
               }
               int index = 0;
               
               if(pancakes[0] == '-'){
                    // find index of farthest '-' side
                    for(int j = pancakes.length - 1; j > -1; j--){
                        if(pancakes[j] == '-'){
                            index = j + 1;
                            break;
                        }
                    }
               }
               else{
                   // find index of farthest '+' from left
                    for(int j = 0; j < pancakes.length; j++){
                        if(pancakes[j] == '-'){
                            index = j;
                            break;
                        }
                    }                   
               }
               Stack<Character> stack = new Stack();               
                    for(int j = 0; j < index; j++){                  
                        stack.push(map.get(pancakes[j]));
                    }
                    for(int j = 0; j < index; j++){
                        pancakes[j] = stack.pop();
                    }
               flips++;
            }
            String out = "Case #" + (i+1) + ": " + flips;
            System.out.println(out);
            bw.write(out);
            bw.newLine();
            
        }
        br.close();
        bw.close();
        
    }
}
