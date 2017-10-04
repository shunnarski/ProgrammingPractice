/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ACMCodingProblems;
import java.util.*;

/**
 *
 * @author ass0009
 */
public class Refrigerator_Magnets {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            String line = in.nextLine().toUpperCase();
            if(line.equals("END")){
                break;
            }
            boolean isFridge = true;
            Set<Character> charSet = new HashSet();
            
            String words[] = line.split(" ");
            for(String s: words){
                char letters[] = s.toCharArray();
                for(char l: letters){
                    if(charSet.contains(l)){
                        isFridge = false;
                    }
                    else{
                        charSet.add(l);
                    }
                }
            }
            
            if(isFridge){
                System.out.println(line);
            }
        }
    }
}
