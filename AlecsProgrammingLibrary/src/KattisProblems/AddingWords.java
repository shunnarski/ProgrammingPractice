/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
import java.io.*;
/**
 *
 * @author alecshunnarah
 */
public class AddingWords {
    static HashMap<String, Integer> name2Num = new HashMap();
    static HashMap<Integer, String> num2Name = new HashMap();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while(in.hasNext()){
            String line = in.nextLine() + " ";
            int firstSpace = line.indexOf(" ");
            String operation = line.substring(0, firstSpace);
            String data = line.substring(firstSpace + 1);
            if(operation.equals("def")){
                Scanner parser = new Scanner(data);
                String keyword = parser.next();
                int value = parser.nextInt();
                num2Name.remove(name2Num.get(keyword));
                name2Num.put(keyword, value);
                num2Name.put(value, keyword);
            }
            else if(operation.equals("calc")){
                String output = eval(data);
                System.out.println(data + output);
            }
            else{
                name2Num = new HashMap();
                num2Name = new HashMap();
            }
            
      }
        
    }
    
    // returns the name of the defined word after a calculation is made
    public static String eval(String exp){
        String expArray[] = exp.split(" ");
        int val = 0;
        if(name2Num.containsKey(expArray[0])){
            val = name2Num.get(expArray[0]);
        }
        else{
            return "unknown";
        }
        for(int i = 1; i < expArray.length - 1; i += 2){
            if(expArray[i].equals("+")){
                String term = expArray[i + 1];
                if(name2Num.containsKey(term)){
                    val += name2Num.get(term);
                }
                else{
                    return "unknown";
                }
            }
            else{
                String term = expArray[i+1];
                if(name2Num.containsKey(term)){
                    val -= name2Num.get(term);
                }
                else
                    return "unknown";
            }
        }
        
        if(num2Name.containsKey(val)){
            return num2Name.get(val);
        }
        else{
            return "unknown";
        }
    }
}
