/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
import java.io.*;
import java.lang.Math;
/**
 *
 * @author Alec Shunnarah
 */
public class A_Different_Problem {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String line = in.readLine();
  
        while(!line.equals("")){
            StringTokenizer st = new StringTokenizer(line);
            double first = Double.parseDouble(st.nextToken());
            double second = Double.parseDouble(st.nextToken());
            
            int answer = (int)Math.abs(first - second);
            System.out.println(answer);
            
            line = in.readLine();
        }
    }
}
