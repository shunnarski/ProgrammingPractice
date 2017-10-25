/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodingProblems;
import java.util.*;
import java.io.*;

// pretty much, develop a graph and use either dfs or bfs to traverse the graph
// and record the steps taken to reach the finish line
public class Solve_Maze {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String dim[] = br.readLine().split("");       
        int X = Integer.parseInt(dim[0]);
        int Y = Integer.parseInt(dim[2]);
        MazeNode start = new MazeNode();
        MazeNode root = new MazeNode();
        char maze[][] = new char[Y][X];
        for(int i = 0; i < Y; i++){
            char row[] = br.readLine().toCharArray();
            root.setValue(row[0]);
            for(int j = 0; j < row.length; j++){
                MazeNode next = new MazeNode();
                char c = row[j];              
                if(c == 'S'){
                    start.setValue(c);
                    start.row = i;
                    start.column = j;
                }
                else {
                    next.setValue(c);
                    next.row = i;
                    next.column = j;
                    root.setRight(next);
                    root = root.getRight();
                }
                maze[i][j] = row[j];              
            }
            
        }
        
        
        // print the maze
        System.out.println();
        for(int i = 0; i < Y; i++){
            for(int j = 0; j < X; j++){
                char c = maze[i][j];
                
            }
            System.out.println();
        }
        
        
        
    }
    
    public static class MazeNode{
        private MazeNode up = null;
        private MazeNode left = null;
        private MazeNode right = null;
        private MazeNode down = null;
        private char value;
        public int row;
        public int column;
        private boolean isStart = false;
        private boolean isEnd = false;
        private boolean isWalk = false;
        
        
        public void setUp(MazeNode up){
            this.up = up;
            up.down = this;
        }
        
        public MazeNode getUp(){
            return this.up;
        }
        
        public void setDown(MazeNode down){
            this.down = down;
            down.up = this;
        }
        
        public MazeNode getDown(){
            return this.down;
        }
        
        public void setRight(MazeNode right){
            this.right = right;
            right.left = this;
        }
        
        public MazeNode getRight(){
            return this.right;
        }
        
        public void setLeft(MazeNode left){
            this.left = left;
            left.right = this;
        }
        
        public MazeNode getLeft(){
            return this.left;
        }
        
        public void setValue(char c){
            this.value = c;
            setBools(c);
        }
        
        public char getValue(){
            return value;
        }
        
        private void setBools(char c){
            switch(c){
                case 'S':
                    isStart = true;
                    isWalk = true;
                    break;
                case '.':
                    isWalk = true;
                    break;
                case 'F':
                    isEnd = true;
                    isWalk = true;
                    break;
                default:
                    break;
                    
            }
        }
        
    }
    
}
