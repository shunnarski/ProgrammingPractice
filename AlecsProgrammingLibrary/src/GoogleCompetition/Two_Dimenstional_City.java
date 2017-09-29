/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GoogleCompetition;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Two_Dimenstional_City {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        int totalArea = 0;
        String numbers[] = line.split(",");
        int buildHeights[] = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
           buildHeights[i] = Integer.parseInt(numbers[i]);
        }
        for(int i = 0; i < buildHeights.length - 1; i++){
            if(buildHeights[i] >= buildHeights[i + 1]){
                totalArea += buildHeights[i + 1];
            }
            else{
                totalArea += buildHeights[i];
            }
        }
        
        System.out.println(totalArea);
        
    }
}
