/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Useful_Algorithms;
import java.util.*;
/**
 * Breadth-first-search can be used if we need to find the shortest path
 * to a value in a graph from the root value.
 * @author Alec Shunnarah
 */
public class BFS {
   private class Node{
       private Node[] adjacent;
       private String value;
       private boolean visited;
       
   }
   
   // implements a queue to keep track of visited nodes through the graph
   void search(Node root){
       Queue<Node> q = new LinkedList();
       root.visited = true;
       q.add(root);
       
       while(!q.isEmpty()){
           Node r = q.remove();
           System.out.println(r.value);
           for(Node n : r.adjacent){
               if(n.visited == false){                   
                  n.visited = true;
                  q.add(n);
               }
           }
       }
   }
}
