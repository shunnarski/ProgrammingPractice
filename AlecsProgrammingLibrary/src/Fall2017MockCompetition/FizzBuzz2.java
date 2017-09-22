/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Fall2017MockCompetition;
import java.util.*;
/**
 *
 * @author ass0009
 */
public class FizzBuzz2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int k = in.nextInt();
        Tuple tupleArray[] = new Tuple[k];
       // Hashtable<Integer, Integer, String> map = new Hashtable<Integer,Integer, String>();

        for(int i = 0; i < k; ++i){
            int x = in.nextInt();
            String text = in.nextLine();
            
            tupleArray[i] = new Tuple(x, text.trim());
        }

        for(int i = 1; i <= N; ++i){
         
            String word = "";
            for(int j = 0; j < tupleArray.length; ++j){
                if(i % tupleArray[j].getFirst() == 0){
                    word = word + tupleArray[j].getLast();
                }
            }
            if(word != ""){
                System.out.println(word);
            }
            else {
                System.out.println(i);
            }
        }
        
    } 
}

class Tuple {
    private int value1;
    private String value2;
    public Tuple(int value1, String value2){
        this.value1 = value1;
        this.value2 = value2;
    }
    
    public int getFirst(){
        return value1;
    }
    public String getLast() {
        return value2;
    }
}
