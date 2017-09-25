/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Parity {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<char[]> stringArr = new ArrayList<char[]>();
        while(true) {
            char line[] = in.nextLine().toCharArray();
            if(line[0] == '#')
            { 
                break;
            }
            else{
                stringArr.add(line);
            }
                
            
            
        }
        
        
        for (int i = 0; i < stringArr.size(); i++)
        {
            char[] temp = stringArr.get(i);
            int count = 0;
           for (int j = 0; j < temp.length - 1; j++) 
           {
               
               if (temp[j] == '1')
               {
                   count ++;
               }
               }
           if (temp[temp.length - 1] == 'e')
           {
               if (count % 2 == 0)
               {
                   temp[temp.length-1] = '0';
               }
               else {
                   temp[temp.length - 1] = '1';
               }
           }
           if (temp[temp.length - 1] == 'o')
           {
               if (count % 2 == 0)
               {
                   temp[temp.length - 1] = '1';
                           
               }
               else {
                   temp[temp.length - 1] = '0';
               }
           }
            
        }
        
        for (int i = 0; i < stringArr.size(); i++)
        {
            System.out.println(stringArr.get(i));
        }
    }
}
