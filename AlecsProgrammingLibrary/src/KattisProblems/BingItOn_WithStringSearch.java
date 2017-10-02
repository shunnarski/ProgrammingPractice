/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KattisProblems;

import java.util.*;

/**
 *
 * @author ass0009
 */
public class BingItOn_WithStringSearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList();

        // terrible efficiency considering we have 
        // four for loops
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            char line[] = in.next().toCharArray();
            int count = 0;
            for (String value : list) {
                if (!(line.length > value.length())) {
                    boolean contains = true;
                    char vals[] = value.toCharArray();
                    for (int j = 0; j < line.length; j++) {
                        if (line[j] != vals[j]) {
                            contains = false;
                            break;
                        }
                    }
                    if (contains) {
                        count++;
                    }
                }

            }
            System.out.println(count);
            list.add(new String(line));
        }
    }
}
