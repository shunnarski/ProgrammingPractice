/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;

import java.util.*;

/**
 *
 * @author alecshunnarah
 */
public class BingItOn_WithPrefixTree {

    static PrefixTree tree = new PrefixTree();

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        for (int i = 0; i < N; i++) {
            String line = in.next().toLowerCase();
            int count = 0;
            count = tree.wordCount(line.toCharArray());
            System.out.println(count);
            tree.add(line);
        }
    }

    //First instantiate a PrefixTree class
    public static class PrefixTree {

        private class PrefixTreeNode {

            private boolean endOfWord;
            private Map<Character, PrefixTreeNode> children;

            // constructor for creating a hashmap with key-value pairs for 
            // a character and its children PrefixTreeNodes
            public PrefixTreeNode() {
                children = new HashMap();
            }
        }

        // root of the prefix tree sequence
        private PrefixTreeNode head;

        public PrefixTree() {
            head = new PrefixTreeNode();
        }

        // adds each character to the prefix tree
        void add(String s) {
            PrefixTreeNode n = head;
            // iterative algorithm
            for (char c : s.toCharArray()) {
                if (!n.children.containsKey(c)) {
                    n.children.put(c, new PrefixTreeNode());
                }
                n = n.children.get(c);
            }
            n.endOfWord = true;
        }

        // searches through a prefix tree and comparing each letter. If a letter
        // in the string is not found when traversing through the prefix tree, 
        // return false
        boolean contains(String s) {
            PrefixTreeNode n = head;
            for (char c : s.toCharArray()) {
                if (!n.children.containsKey(c)) {
                    return false;
                }

                n = n.children.get(c);
            }
            return n.endOfWord;
        }
        
        int wordCount(char[] s){
            PrefixTreeNode n = head;
            int count = 0;
            for(char c: s){
                if(!n.children.containsKey(c)){
                    return 0;
                }
                n = n.children.get(c);
            }

            count = getNumOfEndWords(n);
            
            return count;
        }
        
        int getNumOfEndWords(PrefixTreeNode n){
            int count = 0;
            if(n.endOfWord){
                count++;
            }
            for(char c: n.children.keySet()){
                count += getNumOfEndWords(n.children.get(c));
            }
            return count;
        }

    }
}
