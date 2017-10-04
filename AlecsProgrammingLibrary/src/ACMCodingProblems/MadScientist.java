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
public class MadScientist {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            int k = in.nextInt();
            if (k == 0) {
                break;
            }
            int val = 0;
            String output = "";
            for (int i = 1; i < k + 1; i++) {
                int x = in.nextInt();

                for (int j = 0; j < (x - val); j++) {
                    output += i + " ";
                }
                val = x;

            }
            System.out.println(output.trim());

        }
    }
}
