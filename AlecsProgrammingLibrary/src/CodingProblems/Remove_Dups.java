/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import Data_Structures.LinkedListNode;
import java.util.*;

/**
 *
 * *
 * Removes duplicates from an unsorted linked list
 * @author ass0009
 */
public class Remove_Dups {
    
    // using a buffer (HashSet) to store values
    static void RemoveDups(LinkedListNode n){
        HashSet<Integer> hs = new HashSet<Integer>();
        LinkedListNode previous = null;
        while(n != null){
            if(hs.contains(n.data)){
                previous.next  = n.next;           
            }
            else {
                hs.add(n.data);
                previous = n;
            }
            n = n.next;
        }
    }
    
    // using the runner method and using two pointers to run through the array
    static void RemoveDups2(LinkedListNode n) {
        LinkedListNode prev = n.prev;
        LinkedListNode next = n.next;
        while(n != null) {
            
        }
    }
    
    public static void main(String[] args){
        LinkedListNode node = new LinkedListNode(4, null, null);
        node.last = new LinkedListNode(5, null, node);
        node.last = new LinkedListNode(5, null, node.last);
        node.last = new LinkedListNode(0, null, node.last);
        node.last = new LinkedListNode(1, null, node.last);
        node.last = new LinkedListNode(0, null, node.last);
        
        RemoveDups(node);
        node.print(node);    
    }
}

