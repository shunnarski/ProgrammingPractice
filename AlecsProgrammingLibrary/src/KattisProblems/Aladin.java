/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KattisProblems;
import java.util.*;
/**
 *
 * @author ass0009
 */
public class Aladin {
  public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      short Q = in.nextShort();
      int boxes[] = new int[N];

      for(short i = 0; i < Q; ++i){
          byte op = in.nextByte();

          // set the stones
          if(op == 1){
              int L  = in.nextInt();
              int R = in.nextInt();
              int A = in.nextInt();
              int B = in.nextInt();
              
              for(int j = L - 1; j < R; j++){
                  boxes[j] = ((((j + 1) - L) + 1) * A) % B;
              }
              
          }
          // output the total number of stones in the boxes of a given range
          else{
              int L = in.nextInt();
              int R = in.nextInt();
              int count = 0;
              for(int j = L - 1; j < R; ++j){
                  count += boxes[j];
              }
              
              System.out.println(count);
          }
      }
  }  
}
