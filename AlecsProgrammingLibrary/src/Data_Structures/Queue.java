/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data_Structures;
import java.util.*;
/**
 *
 * @author Alec Shunnarah
 */
public class Queue<T> {
    private static class QueueNode<T> {
        private T data;
        private QueueNode<T> next;
        public QueueNode(T data) {
            this.data = data;
        }
    }
    
    QueueNode<T> first;
    QueueNode<T> last;
    
    public void add(T item) {
        QueueNode<T> q = new QueueNode<T>(item); // create new queue
        if(last != null){ // if last has been insantiated then...
            last.next = q; // set the next value of tha last value in queue to the new node
        }
        last = q; // set the last node in the sequence to q. last = last.next wouldn't work because if statement not work
        if(first == null){ // if first is null than first and last were null before the code above was executed
            first = last; // set first equal to last because at this point there's only one value in the queue
        }
    }
    
    public T peek() {
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }
    
    public T remove() {
        if(first == null) throw new NoSuchElementException();
        T q = first.data;
        first = first.next;
        if(first == null) last = null; // point of this? exception is thrown if this statement is true anyway
        return q;
    }
    
    public boolean isEmpty(){
        return first == null;
    }
    
}
