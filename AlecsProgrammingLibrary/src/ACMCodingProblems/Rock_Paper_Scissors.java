/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package ACMCodingProblems;
import java.util.*;
/**
 *
 * @author ass0009
 */
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<char[]> rps = new ArrayList<>();
        ArrayList<String> output = new ArrayList<>();
        int numberOfEs = 0;
        // if there are two E's in input, break
        while(true){
            if(numberOfEs == 2){
                break;
            }      
            char line[] = in.nextLine().toUpperCase().toCharArray();        
            //exits while loop
            if(line[0] == 'E'){
                numberOfEs++;              
            }     
            else{
                rps.add(line);          
            }
        }
        
        for(int i = 0; i < rps.size(); i += 2){
            char player1[] = rps.get(i);
            char player2[] = rps.get(i + 1);
            int player1Score = 0;
            int player2Score = 0;
            for(int j = 0; j < player1.length; j++){
                // bad way
                
                // surely there's a better way to do this.
                /* Maybe use a hashtable? But if we use a hashtable 
                it will need a unique identifier for the key, where in this
                case there would be two for each instance, same goes
                for maps, they need a unique identifier. Well there are different 
                types of maps, maybe one could work*/
                if(player1[j] == 'R' && player2[j] == 'S'){
                    player1Score++;
                }
                if(player1[j] == 'S' && player2[j] == 'R'){
                    player2Score++;
                }
                if(player1[j] == 'P' && player2[j] == 'R'){
                    player1Score++;
                }
                if(player1[j] == 'R' && player2[j] == 'P'){
                    player2Score++;
                }
                if(player1[j] == 'S' && player2[j] == 'P'){
                    player1Score++;
                }
                if(player1[j] == 'P' && player2[j] == 'S'){
                    player2Score++;
                }
            }
            output.add("P1: " + player1Score);
            output.add("P2: " + player2Score);
        }
        for(int i = 0; i < output.size(); i++){
            System.out.println(output.get(i));
        }
    }
}
