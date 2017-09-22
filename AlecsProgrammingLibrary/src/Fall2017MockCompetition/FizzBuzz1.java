/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Fall2017MockCompetition;
import java.util.Scanner;
/**
 *
 * @author ass0009
 */
public class FizzBuzz1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= N; ++i){
            boolean fizzbuzz = i % 3 == 0 && i % 5 == 0;
            boolean fizz = i % 3 == 0;
            boolean buzz = i % 5 == 0;
            if(fizzbuzz) {
               System.out.println("FizzBuzz");
            }
            if(fizz && !fizzbuzz && !buzz){
                System.out.println("Fizz");
            }
            if(buzz && !fizzbuzz && !fizz) {
                System.out.println("Buzz");
            }
            if(!fizzbuzz && !fizz && !buzz){
                System.out.println(i);
            }
        }
    }
}
