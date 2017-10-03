/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package Useful_Algorithms;

/**
 * When traversing through a graph, depth-first-search is particularly useful
 * if we need to visit each element in the graph. We need to implicate that a node
 * has been visited by using a boolean value property
 * @author Alec Shunnarah
 */
public class DFS {
    private class Node{
        private Node[] adjacent;
        private String value;
        private boolean visited;
    }
    private Node n = new Node();
    
    void search(Node root){
        if(root == null) return;
        System.out.println(root.value);
        root.visited = true;
        for(Node n : root.adjacent){
            if(n.visited == false){
                search(n);
            }
        }
    }
}
