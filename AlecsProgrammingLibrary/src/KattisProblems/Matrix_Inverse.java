/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
import java.io.*;
/**
 *
 * @author alecshunnarah
 */
public class Matrix_Inverse {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
            String things = br.readLine();
            String firstRow[] = things.split(" ");
            String otherThings = br.readLine();
            String secondRow[] = otherThings.split(" ");
            double a = Integer.parseInt(firstRow[0]);
            double b = Integer.parseInt(firstRow[1]);
            double c = Integer.parseInt(secondRow[0]);
            double d = Integer.parseInt(secondRow[1]);
            
            double detDenom = (a*d) - (b*c);
            double frac = 1 / detDenom;
            double temp = a;
            a = d * frac;
            d = temp * frac;
            b = (-b)*(frac);
            c = (-c)*(frac);
            System.out.println(a + " " + b);
            System.out.println(c + " " + d);
        
        
    }

}
