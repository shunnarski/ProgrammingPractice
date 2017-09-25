/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package CodingProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Quicksum {
    
    public static void main(String[] args) {
        
        // instantiate alphabet values
        Hashtable<Character, Integer> alphaValues = new Hashtable<Character, Integer>();
        alphaValues.put(' ', 0);
        int j = 1;
        for(char c = 'A'; c <= 'Z'; c++){
            alphaValues.put(c, j);
            j++;
        }
        Scanner in = new Scanner(System.in);
        ArrayList<char[]> array = new ArrayList<char[]>();
        
        // take in input until # appears
        while(true){
            char line[] = in.nextLine().toUpperCase().trim().toCharArray();
            if(line[0] == '#'){
                break;
            }
            array.add(line);
        }
        
        for(int i = 0; i < array.size(); i++) {
            char temp[] = array.get(i);
            int quicksum = 0;
            for(int x = 0; x < temp.length; x++){
                quicksum += ((x + 1) * alphaValues.get(temp[x]));
            }
            
            System.out.println(quicksum);
        }
        
        
    }
}
