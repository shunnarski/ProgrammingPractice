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
public class IveBeenEverywhereMan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            Set<String> set = new HashSet();
            for(int j = 0; j < N; j++){
                String line = in.next();
                set.add(line);
            }
            System.out.println(set.size());
        }
    }
}
