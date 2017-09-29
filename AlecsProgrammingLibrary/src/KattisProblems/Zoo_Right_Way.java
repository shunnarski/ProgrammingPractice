/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KattisProblems;
import java.util.*;
import java.io.*;
/**
 *  This is the correct way to solve the Unbearable Zoo problem
 * @author alecshunnarah
 */
public class Zoo_Right_Way {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = 0;
        final int last = 5;
        int count = 0;
        ArrayList<TreeMap<String, Integer>> zooList = new ArrayList();
        ArrayList<String> output = new ArrayList();
        while(true && count < last){
            int N = Integer.parseInt(br.readLine());
            if(N == 0) break;
            
            TreeMap<String, Integer> zoo = new TreeMap();
            test++;
            
            for(int i = 0; i < N; ++i){
                String[] L = br.readLine().split(" ");
                String line = L[L.length - 1].toLowerCase();
                if(!zoo.containsKey(line)){
                    zoo.put(line, 0);
                }
                zoo.put(line, zoo.get(line) + 1);
            }
            output.add("List " + (test) + ":");
            for(String value: zoo.keySet()){
                output.add(value + " | " + zoo.get(value));
            }
            count++;
        }
        
        for(String value : output){
            System.out.println(value);
        }
    }
}
