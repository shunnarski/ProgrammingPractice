/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package GoogleCompetition;
import java.util.*;

/**
 *
 * @author ass0009
 */
public class AddingArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //split the input by its commas
        String input1 = in.nextLine();
        String vectorArr1[];
        vectorArr1 = input1.split(",");
        String input2 = in.nextLine();
        String vectorArr2[];
        vectorArr2 = input2.split(",");
        
        int numbers1[] = new int[vectorArr1.length];
        int numbers2[] = new int[vectorArr2.length];
        int output[] = new int[vectorArr2.length];
        for(int i = 0; i < vectorArr1.length; i++){
            numbers1[i] = Integer.parseInt(vectorArr1[i]);
            numbers2[i] = Integer.parseInt(vectorArr2[i]);
        }
        for(int i = 0; i < numbers1.length; i++){
            output[i] = numbers1[i] + numbers2[i];
        }
        String out = "";
        for(int i = 0; i < output.length; i++){
            if(i == output.length - 1){
               out += output[i];
            }
            else {
               out += output[i] + ",";

            }
        }
        
        System.out.println(out);
        
    }
}
