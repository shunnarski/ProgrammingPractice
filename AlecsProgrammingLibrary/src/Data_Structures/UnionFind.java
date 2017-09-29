
package Data_Structures;
/**
 * Union find is used to find elements contained
 * in multiple disjoint sets
 * @author ass0009
 */
public class UnionFind {
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
}
