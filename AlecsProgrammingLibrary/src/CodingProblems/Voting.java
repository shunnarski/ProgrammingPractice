/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package CodingProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Voting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<char[]> voteSeq = new ArrayList<char[]>();
        // read inputs until # is entered
        while(true){
            char line[] = in.nextLine().toUpperCase().toCharArray();
            if(line[0] == '#'){
                 break;
            }
            voteSeq.add(line);
        }
        
        for(int i = 0; i < voteSeq.size(); i++){
            int yesCount = 0;
            int noCount = 0;
            int presentCount = 0;
            int absentCount = 0;
            char temp[] = voteSeq.get(i);
            for(int j = 0; j < temp.length; j++){
                switch(temp[j]) {
                    case 'Y':
                        yesCount++;
                        break;
                    case 'N':
                        noCount++;
                        break;
                    case 'P':
                        presentCount++;
                        break;
                    case 'A':
                        absentCount++;
                    default:
                        break;
                }
            }
            int totalCount = yesCount + noCount + presentCount;
            if(absentCount >= totalCount){
                System.out.println("need quorum");
            }
            else if(yesCount > noCount) {
                System.out.println("yes");
            }
            else if(noCount > yesCount) {
                System.out.println("no");
            }
            else if(yesCount == noCount) {
                System.out.println("tie");
            }

            
            
        }
    }
}
