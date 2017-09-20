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
public class Stack<T> {
    // instantiate a class called StackNode that is essentially a node to be used
    // in a stack data structure
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        public StackNode(T data){
            this.data = data;
        }
    }    
   private StackNode<T> top;
   
   public void push(T value){
       StackNode<T> t = new StackNode<T>(value);
       t.next = top;
       top = t;
   }
   
   public T pop() {
       if(top == null) throw new EmptyStackException();
       T value = top.data;
       top = top.next;       
       return value;
   }
   
   public boolean isEmpty(){
       return top == null;
   }
   
   public T peek() {
       if(top == null) throw new EmptyStackException();
       return top.data;
   }  
}

