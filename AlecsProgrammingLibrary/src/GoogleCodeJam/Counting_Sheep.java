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
public class Counting_Sheep {
    public static void main(String[] args) throws IOException {
        String fileName = "A-large-practice.in.txt";
        String line = null;
        
        try{            
            FileReader in = new FileReader(fileName);
            FileWriter out = new FileWriter("A_large_out.txt");
            BufferedReader br = new BufferedReader(in);
            BufferedWriter bw = new BufferedWriter(out);          
            int T = Integer.parseInt(br.readLine());
            for(int i = 0; i < T; i++){
                HashSet<Character> set = new HashSet();
                int N = Integer.parseInt(br.readLine());
                   
                int index = 1;
                String output = "";
                while(true){
                    
                    int value = N*index;
                    String numbers = value + "";
                    char numArray[] = numbers.toCharArray();
                    for(int j = 0; j < numArray.length; j++){
                        if(!set.contains(numArray[j])){
                            set.add(numArray[j]);
                        }
                    }
                    if(N == 0){
                        output = "INSOMNIA";
                        break;
                    } 
                    if(set.size() == 10){
                        output = value + "";
                        break;
                    }
                               
                    index++;
                }

                String o = "Case #" + (i+1) + ": " + output;
                System.out.println(o);
                bw.write(o);
                bw.newLine();
            }
        
            bw.close();
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("Unable to open file: " + fileName);
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        
    }
}
