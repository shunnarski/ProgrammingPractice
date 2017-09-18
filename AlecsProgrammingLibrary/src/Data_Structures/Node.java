/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;

/**
 *
 * @author ass0009
 */
public class Node {
    Node next = null;
    int data;
    
    public Node(int d){ 
        data = d;
    }
    
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
            
        }
        n.next = end;
    }
    
    Node deleteNode(Node head, int d){
        Node n = head;
        
        if(n.data == 0){
            return head.next;
        }
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }
}
