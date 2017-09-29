/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class Unbearable_Zoo {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        final int L = 5;
        ArrayList<String[]> lists = new ArrayList<String[]>();
        Hashtable<String, Integer> animals = new Hashtable<String, Integer>();
        ArrayList<ArrayList<String>> animalList = new ArrayList<ArrayList<String>>();
        
        // instantiate lists of animals
        for(int i = 0; i < L; i++){
            int N = in.nextInt();
            String list[] = new String[N];
            if(N == 0){
               break;
            }
            for(int j = 0; j < N + 1; j++){
                String line = in.nextLine().toLowerCase();
                if(!line.isEmpty()){
                    list[j - 1] = line;
                }
            }
            lists.add(list);
        }
        
        // create list of animals
        for(int i = 0; i < lists.size(); i++){
            String temp[] = lists.get(i);
            ArrayList<String> anmName = new ArrayList<String>();
            for(int j = 0; j < temp.length; j++){              
                String names[] = temp[j].split(" ");
                String name = names[names.length - 1];
                if(!animals.containsKey(name)){
                    animals.put(name, 1);
                    anmName.add(name);
                }
                else{
                    int count = animals.get(name) + 1;
                    animals.replace(name, count);
                    
                }
            }
            animalList.add(anmName);
        }
        
        printList(animalList, animals);
        
    }
    
    static void printList(ArrayList<ArrayList<String>> animalList, Hashtable<String, Integer> animals){
        for(int i = 0; i < animalList.size(); i++){
            System.out.println("List " + (i + 1) + ":");
            ArrayList<String> temp = animalList.get(i);
            Collections.sort(temp);
            for(int j = 0; j < temp.size(); j++){
                System.out.println(temp.get(j) + " | " + animals.get(temp.get(j)));
            }
        }
    }
    
  
}

//class MyTuple{
//    private String animalName;
//    private int animalCount;
//    public MyTuple(String animal, int count){
//        this.animalName = animal;
//        this.animalCount = count;
//    }
//    
//    public String getFirst(){
//        return animalName;
//    }
//    
//    public int getSecond(){
//        return animalCount;
//    }
//    
//    public void increaseCount(){
//        animalCount++;
//    }
//}
