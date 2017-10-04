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
public class Missing_Pages {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
       while(true){
           int N = in.nextInt();
           if(N == 0){
               break;
           }
           int P = in.nextInt();
           int numOfPages = N / 4;
           int pageNumF = 1;
           int pageNumB = N;
           ArrayList<Integer> set = new ArrayList<Integer>();
           for(int i = 0; i < numOfPages; i++){
               final int front = pageNumF;
               int back = pageNumB - 1;
               if(P == front){
                   set.add(front + 1);
                   set.add(back);
                   set.add(back + 1);
               }
               else if(P == front + 1){
                   set.add(front);
                   set.add(back);
                   set.add(back + 1);
               }
               else if(P == back){
                   set.add(front);
                   set.add(front + 1);
                   set.add(back + 1);
               }
               else if(P == back + 1){
                   set.add(front);
                   set.add(front + 1);
                   set.add(back);
               }
               pageNumF += 2;
               pageNumB -= 2;
           }
           
           String output = " ";
           for(int value: set){
               output += value + " ";
           }
           
           System.out.println(output.trim());
           
      
           
       }
    }
}
