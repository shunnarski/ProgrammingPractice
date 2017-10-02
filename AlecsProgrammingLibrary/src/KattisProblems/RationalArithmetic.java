/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
import java.lang.Math;
/**
 *
 * @author Alec Shunnarah
 */
public class RationalArithmetic {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        String num = in.nextLine();
        int N = Integer.parseInt(num);
        for(int i = 0; i < N; i++){
            String line = in.nextLine();
            String[] operations = line.split(" ");
            int a = Integer.parseInt(operations[0]);
            int b = Integer.parseInt(operations[1]);
            int c = Integer.parseInt(operations[3]);
            int d = Integer.parseInt(operations[4]);
            
            switch(operations[2]){
                case "+":
                    addFrac(a, b, c, d);
                    break;
                case "-":
                    subFrac(a, b, c, d);
                    break;
                case "*":
                    multFrac(a, b, c, d);
                    break;
                case "/":
                    divFrac(a, b, c, d);
                    break;
            }
        }
    }
    
    static void addFrac(int a, int b, int c, int d){
        int num;
        int denom;
        denom = b*d;
        a = a*d; 
        c = c*b;
        num = a + c;
        reduce(num, denom);
    }
    
    static void subFrac(int a, int b, int c, int d){
        int num;
        int denom;
        denom = b*d;
        a = a*d; 
        c = c*b;
        num = a - c;
        reduce(num, denom);
    }
    
    static void multFrac(int a, int b, int c, int d){
        int num;
        int denom;
        
        denom = b*d;
        num = a*c;
        reduce(num, denom);
    }
    
    static void divFrac(int a, int b, int c, int d){
        int num;
        int denom;
        
        num = a*d;
        denom = b*c;
        reduce(num, denom);
    
    }
    
    static void reduce(int num, int denom){
        int gcm = Math.abs(gcm(num, denom));
        System.out.println((num / gcm) + " / " + (denom / gcm)); 
    }
    
    static int gcm(int num, int denom){
        return denom == 0 ? num : gcm(denom, num % denom);
    }
}
