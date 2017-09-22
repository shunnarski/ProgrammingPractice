/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Fall2017MockCompetition;
import java.util.*;
/**
 *
 * @author ass0009
 */
public class AddTheNumbers2 {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int answer = 0;
        for(int i = 0; i < N; i++){
            int x = in.nextInt();
            answer = answer + x;
        }
        
        System.out.println(answer);
    }
}
