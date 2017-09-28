/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GoogleCompetition;
import java.util.*;
/**
 *
 * @author Alec Shunnarah
 */
public class Pangram {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int ALPHCOUNT = 26;
        char line[] = in.nextLine().toLowerCase().toCharArray();
        HashSet<Character> alphabet = new HashSet<Character>();
        for(char c = 'a'; c <= 'z'; c++){
            alphabet.add(c);
        }
        HashSet<Character> checkSet = new HashSet<Character>();
        for(int i = 0; i < line.length; i++){
            if(alphabet.contains(line[i]))
                checkSet.add(line[i]);              
        }

        if(checkSet.size() >= ALPHCOUNT){
            System.out.println("Is a Pangram!");
          
        }
        else {
            System.out.println("Is not a Pangram.");
        }
    }
}
