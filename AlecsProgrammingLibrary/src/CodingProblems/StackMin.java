/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import java.util.*;
import Data_Structures.LinkedListNode;
/**
 * 
 * NOT FINISHED!!!!!
 * Design a stack which, in addition to push and pop, has a function min 
 * which returns the minimum element? push, pop, and min should all operate in O(1) time
 * @author ass0009
 */
public class StackMin {
    private static class StackNode{
        private int data;
        private StackNode next;
        public StackNode(int data){
            this.data = data;
        }
    }
    private StackNode mintop;
    private StackNode top;
    
    // pushes a value to the top
    public void push(int value){
        StackNode t = new StackNode(value);
        // checks to see if the pushed value is larger than the top 
        if(isSmaller(mintop.data, value)){
            
        }
        t.next = top;
        top = t;
    }
    
    // pops out the top value in the stack
    public int pop() {
        if(top == null) throw new EmptyStackException();
        int value = top.data;
        top = top.next;
        return value;
    }
    
    // gets the minimum value in the stack
    public int getMin() {
        return mintop.data;
    }
    
    public boolean isSmaller(int ts, int val){
        if(val < ts){
            return true;
        }
        else {
            return false;
        }
    }
    
    
}
