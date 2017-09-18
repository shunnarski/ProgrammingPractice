/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import java.util.*;

/**
 *
 * *
 * Removes duplicates from an unsorted linked list
 * @author ass0009
 */
public class Remove_Dups {
    
    void RemoveDups(Node n){
        LinkedList<Node> LinkedList = new LinkedList<Node>();
        HashSet hs = new HashSet();
        
    }
    
    public static void main(String[] args){
        
    }
}

class Node {
    Node next = null;
    Node prev = null;
    int data;
    
    public Node(Node next, Node prev, int data){
        this.next = next;
        this.prev = prev;
        this.data = data;  
    }
    
    
}
