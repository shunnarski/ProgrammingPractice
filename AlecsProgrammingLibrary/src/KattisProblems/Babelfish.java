/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;

import java.util.*;
import java.io.*;

/**
 *
 * @author Alec Shunnarah
 */
public class Babelfish {

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> dict = new HashMap();

        String line = in.readLine();
        while (!line.equals("")) {
            StringTokenizer st = new StringTokenizer(line);

            String englishWord = st.nextToken();
            String foreignWord = st.nextToken();

            dict.put(foreignWord, englishWord);
            line = in.readLine();
        }

        while (in.ready()) {
            String word = in.readLine();
            if (!dict.containsKey(word)) {
                System.out.println("eh");
            } else {
                System.out.println(dict.get(word));
            }
        }
    }
}
