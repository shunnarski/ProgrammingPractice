/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import java.util.*;
/**
 * 
 * NOT FINISHED!!!!!
 * Design a stack which, in addition to push and pop, has a function min 
 * which returns the minimum element? push, pop, and min should all operate in O(1) time
 * @author ass0009
 */
public class StackMin {
    private int min;
    private static class StackNode{
        private int data;
        private StackNode next;
        public StackNode(int data){
            this.data = data;
        }
    }
    
    private StackNode top;
    
    // pushes a value to the top
    public void push(int value){
        StackNode t = new StackNode(value);
        setMin(value);
        t.next = top;
        top = t;
    }
    
    // pops out the top value in the stack
    public int pop() {
        if(top == null) throw new EmptyStackException();
        top.next = top;
        return top.data;
    }
    
    // gets the minimum value in the stack
    public int getMin() {
        return min;
    }
    
    // this would only work if we never popped items.
    private void setMin(int value){
        if(min > value){
            min = value;
        }
    }
}
