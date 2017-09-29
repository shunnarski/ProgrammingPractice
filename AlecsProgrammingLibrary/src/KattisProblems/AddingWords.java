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
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> name2Num = new HashMap();
        HashMap<Integer, String> num2Name = new HashMap();
        ArrayList<String> output = new ArrayList();
        while(in.hasNext()){
            String line[] = in.nextLine().split(" ");
            // if def is written define a variable and add to HashMaps
            if(line[0].equals("def")){
                String varName = line[1];
                int varVal = Integer.parseInt(line[2]);
                name2Num.put(varName, varVal);
                num2Name.put(varVal, varName);
            }
            // add something to output if calc appears
            else if(line[0].equals("calc")){
                String out = line[1] + " ";
                boolean varStated = true;
                int calc = name2Num.get(line[1]);
                for(int i = 2; i < line.length; i += 2){
                    switch(line[i]){
                        case "+":
                            if(name2Num.containsKey(line[i + 1])){
                                calc += name2Num.get(line[i + 1]);
                                out += line[i] + " " + line[i + 1] + " ";
                            }
                            else{
                               varStated = false;
                               out += line[i] + " " + line[i + 1] + " ";
                            }
                            break;
                        case "-":
                            if(name2Num.containsKey(line[i + 1])){
                                calc -= name2Num.get(line[i + 1]);
                                out += line[i] + " " + line[i + 1] + " ";
                            }
                            else {
                                varStated = false;
                                out += line[i] + " " + line[i + 1] + " ";
                            }
                            break;
                        case "=":
                            if(!num2Name.containsKey(calc) || !varStated){
                                out += line[i] + " unknown";
                            }
                            else{
                                out += line[i] + " " + num2Name.get(calc);
                            }
                            break;
                    }
                }
                output.add(out);
            }
            else{
                name2Num.clear();
                num2Name.clear();
            }            
        }
        
        for(String value: output){
            System.out.println(value);
        }
    }
}
