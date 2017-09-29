/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KattisProblems;
import java.util.*;
/**
 *
 * @author alecshunnarah
 */
public class BingItOn {
    static PrefixTree tree = new PrefixTree();
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        for(int i = 0; i < N; i++){
            String line = in.next();
            int count = 0;
            if(tree.contains(line)){
                count++;
            }
            System.out.println(count);
            tree.add(line);
        }
    }
    
    
    //First instantiate a PrefixTree class
    public static class PrefixTree{

        private class PrefixTreeNode{
            private boolean endOfWord;
            private Map<Character, PrefixTreeNode> children;
            
            // constructor for creating a hashmap with key-value pairs for 
            // a character and its children PrefixTreeNodes
            public PrefixTreeNode(){
                children = new HashMap();
            }
        }
        
        // root of the prefix tree sequence
        private PrefixTreeNode head;
        
        public PrefixTree(){
            head = new PrefixTreeNode();
        }
        
        // adds each character to the prefix tree
        void add(String s){
            PrefixTreeNode n = head;
            // iterative algorithm
            for(char c : s.toCharArray()){
                if(!n.children.containsKey(c)){
                    n.children.put(c, new PrefixTreeNode());
                }
                n = n.children.get(c);
            }
            n.endOfWord = true;
        }
        
        // searches through a prefix tree and comparing each letter. If a letter
        // in the string is not found when traversing through the prefix tree, 
        // return false
        boolean contains(String s){
            PrefixTreeNode n = head;
            for(char c: s.toCharArray()){
                if(!n.children.containsKey(c)){
                    return false;
                }
                n = n.children.get(c);
            }
            return n.endOfWord;
        }
    }
}
