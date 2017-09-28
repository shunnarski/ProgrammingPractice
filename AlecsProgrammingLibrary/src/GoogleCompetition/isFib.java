/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GoogleCompetition;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Alec Shunnarah
 */
public class isFib {
    public static void main(String[] args){
        
        // get input
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i < N; ++i){
           arr[i] = in.nextInt();
        }
        
        ArrayList<Integer> fibSeq = new ArrayList<Integer>();
        fibSeq.add(0);
        fibSeq.add(1);
        for(int i = 0; i < 20; i++){
            int x = fibSeq.get(i) + fibSeq.get(i + 1);            
            fibSeq.add(x);

        }
        for(int i = 0; i < arr.length; i++){
            boolean contained = false;
            for(int j = 0; j < fibSeq.size(); j++){
                if(arr[i] == fibSeq.get(j)){
                 contained = true;                       
                }
            }
            if(contained){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
        
    }
}
