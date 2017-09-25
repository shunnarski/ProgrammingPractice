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
public class Gnome_Sequencing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList<int[]> integerList = new ArrayList<int[]>();
        
        // save data entered
        for(int i = 0; i < N; i++) {
            int intArr[] = new int[3];
            intArr[0] = in.nextInt();
            intArr[1] = in.nextInt();
            intArr[2] = in.nextInt();
            
            integerList.add(intArr);
        }
        
        System.out.println("Gnomes:");
        for(int i = 0; i < integerList.size(); i++){
            int temp[] = integerList.get(i);
            if(temp[0] >= temp[1] && temp[1] >= temp[2]){
                System.out.println("Ordered");
            }
            else if(temp[0] <= temp[1] && temp[1] <= temp[2]){
                System.out.println("Ordered");
            }
            else{
                System.out.println("Unordered");
            }
        }
    }
}
