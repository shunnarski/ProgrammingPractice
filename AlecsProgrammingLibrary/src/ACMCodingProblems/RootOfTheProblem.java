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
public class RootOfTheProblem {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        while(true){
            int B = in.nextInt();
            int N = in.nextInt();
            if(B == 0 && N == 0){
                break;
            }
            double Nfrac = 1 / (double)N;
            double decVal = Math.pow(B, Nfrac);
            double floor = Math.floor(decVal);
            double ceiling = Math.ceil(decVal);
            
            if((Math.abs(Math.pow(floor, N) - B)) < (Math.abs(Math.pow(ceiling, N) - B))){
                System.out.println((int)floor);
            }
            else if((Math.abs(floor - B)) > (Math.abs(ceiling - B))){
                System.out.println((int)ceiling);
            }
            else{
                System.out.println((int)floor);
            }
            
        }
        
    }
}
