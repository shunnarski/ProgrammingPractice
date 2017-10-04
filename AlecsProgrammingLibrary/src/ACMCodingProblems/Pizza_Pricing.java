/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ACMCodingProblems;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author ass0009
 */
public class Pizza_Pricing {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int count = 1;

        while(true){
            int N = in.nextInt();
            if(N == 0){
                break;
            }
            int bestSize = 0;
            double bestValue = 0;
            for(int i = 0; i < N; i++){
                int D = in.nextInt();
                int P = in.nextInt();
                double rad = D/2;
                double area = Math.PI * Math.pow(rad, 2);
                double value = P/area;
                if(bestValue == 0){
                    bestValue = value;
                    bestSize = D;
                }
                if(value < bestValue){
                    bestValue = value;
                    bestSize = D;
                }
            }
            System.out.println("Menu " + count + ": " + bestSize);
            
            count++;
        }
    }
}
