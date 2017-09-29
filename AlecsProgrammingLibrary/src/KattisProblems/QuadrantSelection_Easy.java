/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class QuadrantSelection_Easy {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = in.nextInt();
        boolean firstPos = first > 0;
        boolean secondPos = second > 0;
        if(firstPos && secondPos){
            System.out.println("1");
        }
        else if(!firstPos && secondPos){
            System.out.println("2");
        }
        else if(!firstPos && !secondPos){
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
    }
}
