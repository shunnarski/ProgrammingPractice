/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package KattisProblems;
import java.util.*;
import java.io.*;
/**
 *
 * @author alecshunnarah
 */
public class Union_Find {
    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        String line = in.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        
        UnionFind union = new UnionFind(N);
        for(int i = 0; i < Q; i++){
            String inp = in.readLine();
            StringTokenizer stringTok = new StringTokenizer(inp);
            String op = stringTok.nextToken();
            int a = Integer.parseInt(stringTok.nextToken());
            int b = Integer.parseInt(stringTok.nextToken());
            if(op.equals("?")){
                if(union.isUnion(a, b)){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
            if(op.equals("=")){
                union.union(a, b);
            }
        }
    } 
}


 class UnionFind {
    private int[] parent;
    
    public UnionFind(int N){
        parent = new int[N];
        for(int i = 0; i < N; i++) parent[i] = i;
    }
    
    public int find(int a){
        if(parent[a] == a) return a;
        parent[a] = find(parent[a]);
        return parent[a];
    }
    
    public void union(int a, int b){
        parent[find(a)] = find(b);
    }
    
    public boolean isUnion(int a, int b){
        if(parent[a] == parent[b]){
            return true;
        }
        else{
            return false;
        }
    }
}