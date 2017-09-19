/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;

/**
 *
 * @author Alec Shunnarah
 */
public class LinkedListNode {

    public LinkedListNode next, prev, last;
    public int data;

    public LinkedListNode(int data, LinkedListNode next, LinkedListNode prev) {
        this.data = data;
        setNext(next);
        setPrevious(prev);
    }

    public LinkedListNode(int data) {
        this.data = data;
    }

    public LinkedListNode() {
    }

    public void setNext(LinkedListNode n) {
        next = n;
        if (this == null) {
            last = n;
        }
        if (n != null && n.prev != this) {
            n.setPrevious(this);
        }
    }

    public void setPrevious(LinkedListNode p) {
        prev = p;
        if (p != null && p.next != this) {
            p.setNext(this);
        }
    }

    public LinkedListNode clone() {
        LinkedListNode next2 = null;
        if (next != null) {
            next2 = next.clone();
        }
        LinkedListNode head2 = new LinkedListNode(data, next2, null);
        return head2;

    }

    public void print() {
        LinkedListNode n = this;
        //print linked list before function
        while (n != null) {
            System.out.println(n.data);
            n = n.next;
        }
    }

}
