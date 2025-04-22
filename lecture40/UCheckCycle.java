import java.util.*;
public class UCheckCycle {
    int vertices;
    ArrayList<ArrayList<Integer>> graph;
    UCheckCycle(int v){
        this.vertices=v;
        this.graph= new ArrayList<>();
        for(int i=0;i<v;i++){
            graph.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest){
        graph.get(src).add(dest);
        graph.get(dest).add(src);
    }
    public boolean checkCycle(){
        boolean visited[]= new boolean[vertices];
        for(int i=0;i<vertices;i++){
           if(!visited[i]){
             if(dfs(i,-1,visited)){
                 return true;
             }
           }
        }
        return false;
    }
    public boolean dfs(int node, int parent,boolean visited[] ){
        visited[node]=true;
        for(int newNode:graph.get(node)){
            if(!visited[newNode]){
                if(dfs(newNode, node, visited)){
                    return true;
                }
            }else if(newNode!=parent){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        UCheckCycle g= new UCheckCycle(6);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 5);
        System.out.println("Graph is cyclic: "+ g.checkCycle());
    }
}
