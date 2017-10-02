/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
/**
 *
 * @author Alec Shunnarah
 */
public class BeeKeeper {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Set<Character> vowels = new HashSet();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('y');

        while(true){
            Map<Integer, String> map = new HashMap();
            
            int highestCount = 0;
            
            int N = in.nextInt();
            if(N == 0){
                break;
            }
            for(int i = 0; i < N; i++){
                int tempCount = 0;
                char[] line = in.next().toLowerCase().toCharArray();
                for(int j = 0; j < line.length - 1; j++){
                    if(vowels.contains(line[j])){
                        if(line[j] == line[j + 1]){
                            tempCount++;
                        }
                    }
                }
                map.put(tempCount, new String(line));
                if(tempCount >= highestCount){
                    highestCount = tempCount;
                }
            }
            System.out.println(map.get(highestCount));
        }
    }
}

