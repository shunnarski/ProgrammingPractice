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
public class Mirror_Mirror_On_The_Wall {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Stack<Character>> array = new ArrayList<Stack<Character>>();
        HashSet<Character> symmetricLetters = new HashSet<Character>();
        Hashtable<Character, Character> mirrored = new Hashtable<Character, Character>();
        ArrayList<String> output = new ArrayList<String>();
        symmetricLetters.add('i');
        symmetricLetters.add('o');
        symmetricLetters.add('v');
        symmetricLetters.add('w');
        symmetricLetters.add('x');
       
        mirrored.put('d', 'b');
        mirrored.put('b', 'd');
        mirrored.put('p', 'q');
        mirrored.put('q', 'p');
        
        while(true) {
            char line[] = in.nextLine().toCharArray();
            if(line[0] == '#') {
                break;
            }
            Stack<Character> s = new Stack<Character>();
            for(int i = 0; i < line.length; i++){
                s.push(line[i]);
            }
            array.add(s);
        }   
        
        for(int i = 0; i < array.size(); i++){
            boolean isInvalid = false;
            Stack<Character> temp = array.get(i);
            char tempList[] = new char[temp.size()];
            
            for(int j = 0; j < tempList.length; j++){
                char c = temp.pop();
                if(symmetricLetters.contains(c)){
                    tempList[j] = c;
                }
                else if(mirrored.containsKey(c)){
                    tempList[j] = mirrored.get(c);
                }
                else {
                    isInvalid = true;
                }                
            }
            if(isInvalid){
                output.add("INVALID");
            }
            else {
                output.add(new String(tempList));
            }
        }
        
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
        
    }
}
