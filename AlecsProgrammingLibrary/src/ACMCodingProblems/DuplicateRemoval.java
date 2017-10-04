/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ACMCodingProblems;
import java.util.*;
import java.io.*;
/**
 *
 * @author ass0009
 */
public class DuplicateRemoval {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        
        while(true){
            int N = in.nextInt();
            if(N == 0){
                break;
            }
            ArrayList<Integer> noDuplicates = new ArrayList();
            for(int i = 0; i < N; i++){
               int x = in.nextInt();
               if(noDuplicates.isEmpty()){
                   noDuplicates.add(x);
               }
               if(noDuplicates.get(noDuplicates.size() - 1) != x){
                   noDuplicates.add(x);
               }
            }
            String output = "";
            for(int i = 0; i < noDuplicates.size(); ++i){
                output += noDuplicates.get(i) + " ";
            }
            output += "$";
            
            System.out.println(output);
        }
    }
}
