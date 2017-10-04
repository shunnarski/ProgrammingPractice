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
public class LinearPachinko {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Map<Character, Integer> map = new HashMap();
        map.put('.', 100);
        map.put('_', 0);
        map.put('|', 50);
        while(true){
            char line[] = in.nextLine().toCharArray();
            int sumProb = 0;
            int average = 0;
            if(line[0] == '#'){
                break;
            }
            for(int i = 0; i < line.length; i++){
                char c = line[i];
                if(map.containsKey(c)){
                    sumProb += map.get(c);
                }
                else{
                    if(c == '/'){
                        for(int j = i; j >= -1; j--){
                            if(j < 0){
                                sumProb += 100;
                                break;
                            }
                            else if(line[j] == '.'){
                                sumProb += 100;
                                break;
                            }
                            else if(line[j] == '|'){
                                sumProb += 0;
                                break;
                            }
                            else if(line[j] == '\''){
                                sumProb += 0;
                                break;
                            }
                        }
                    }
                    else if(c == '\''){
                        for(int j = i; j >= line.length; j++){
                            if(j > line.length){
                                sumProb += 100;
                                break;
                            }
                            else if(line[j] == '.'){
                                sumProb += 100;
                                break;
                            }
                            else if(line[j] == '|'){
                                sumProb += 0;
                                break;
                            }
                            else if(line[j] == '/'){
                                sumProb += 0;
                                break;
                            }
                        }
                    }
                }
            }
            
            average = sumProb / line.length;
            System.out.println(average);
        }
        
        
    }
}
