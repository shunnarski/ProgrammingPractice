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
        ArrayList<char[]> rps = new ArrayList<char[]>();
        ArrayList<String> output = new ArrayList<String>();
        int numberOfEs = 0;
        while(true){
            char line[] = in.nextLine().toUpperCase().toCharArray();
            //exits while loop
            if(line[0] == 'E'){
                numberOfEs++;              
            }
            else {
                numberOfEs = 0;
            }
            if(numberOfEs == 2){
                break;
            }
            rps.add(line);          
        }
        
        for(int i = 0; i < rps.size(); i += 2){
            char player1[] = rps.get(i);
            char player2[] = rps.get(i + 1);
            int player1Score = 0;
            int player2Score = 0;
            for(int j = 0; i < player1.length; j++){
                // bad way
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
    }
}
