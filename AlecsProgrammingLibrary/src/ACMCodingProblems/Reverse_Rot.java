/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ACMCodingProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Reverse_Rot {
    
    public static void main(String[] args) {
      
        Scanner in = new Scanner(System.in);      
        Hashtable<Integer, Character> letters = new Hashtable();   
        Hashtable<Character, Integer> keys = new Hashtable();
        createLetterSeq(letters, keys);
        ArrayList<MyTuple> tupleArray = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        
        while(true){ 
            // gonna read the next string
            String line = in.nextLine().toUpperCase().trim();
            String substrings[] = line.split(" ");
            String revAmount = substrings[0];
            String text = substrings[1];
            if(revAmount.toCharArray()[0] == '0')  {
                break;
            } 
            if((Integer)Integer.parseInt(revAmount) instanceof Integer){
                
                char chars[] = text.trim().toUpperCase().toCharArray();
            
                Stack<Character> s = new Stack<Character>();
                for(int i = 0; i < chars.length; i++){
                    s.push(chars[i]);
                }
                MyTuple tuple = new MyTuple(Integer.parseInt(revAmount), s);
                tupleArray.add(tuple);
            }
     
                                      
        }
        
        for(MyTuple value: tupleArray){
            Stack<Character> s = value.getSecond();
            int i = 0;
            char line[] = new char[s.size()];
            while(!s.empty()){
                line[i] = s.pop();
                i++;
            }
            for(int j = 0; j < line.length; j++){
                int reverseKey = keys.get(line[j]) + value.getFirst();
                if(reverseKey > 28){
                    reverseKey -= 28;
                }
                line[j] = letters.get(reverseKey);
            }
            output.add(new String(line));
                        
        }
        
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
            
    }
    
    // create letter sequence
    public static void createLetterSeq(Hashtable<Integer, Character> letters, Hashtable<Character, Integer> keys){
                //instantiate letter va
         // creating letter sequence
        int index = 1;
        for(char c = 'A'; c <= 'Z'; c++){
            letters.put(index, c);
            keys.put(c, index);
            index++;
        }
        letters.put(index, '_');
        keys.put('_', index);
        index++;
        letters.put(index, '.');
        keys.put('.', index);

    }
}

//instantiate tuple class to keep up with information
class MyTuple {
    private Integer reverseAmount;
    private Stack<Character> stack;
    
    public MyTuple(Integer reverseAmount, Stack<Character> text) {
        this.reverseAmount = reverseAmount;
        this.stack = text;
    }
    
    public Integer getFirst(){
        return reverseAmount;
    }
    
    public Stack<Character> getSecond(){
        return stack;
    }
}
