
package Data_Structures;
import java.util.*;
/**
 * Prefix trees are used to iterate through string characters
 * and find matches that are words by traversing through a string, 
 * starting at the first character of a string, thus the word's root.
 * 
 * Prefix tree's contain a node for each character with two properties:
 *  endOfWord: a boolean value that determines if the end of a word has been reached
 *  children: a hashmap containing a list of children of that character's tree.
 * @author ass0009
 */
public class PrefixTree {
    public static class PrefixTreeNode {
        private boolean endOfWord;
        private Map<Character, PrefixTreeNode> children;
        
        public PrefixTreeNode(){
            children = new HashMap();
        }
    }
    
    private PrefixTreeNode head;
    
    public PrefixTree() {
        head = new PrefixTreeNode();
    }
    
    void add(String s){
        PrefixTreeNode n = head;
        for(char c : s.toCharArray()){
            if(!n.children.containsKey(c)){
                n.children.put(c, new PrefixTreeNode());
            }
            n = n.children.get(c);
        }
        n.endOfWord = true;
    }
    
    boolean contains(String s){
        PrefixTreeNode n = head;
        for(char c : s.toCharArray()){
            if(!n.children.containsKey(c)){
                return false;
            }
            n = n.children.get(n);
        }
        return n.endOfWord;        
    }
}
