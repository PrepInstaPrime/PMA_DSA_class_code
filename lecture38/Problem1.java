import java.util.*;
public class Problem1 {
    int vertices;
    ArrayList<ArrayList<Integer>> graph;
    public Problem1(int v){
        this.vertices=v;
        this.graph= new ArrayList<>();
        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest){
        graph.get(src).add(dest);
    }
    // normal printing 
    public void printGraph(){
        for(int i=0;i<=vertices;i++){
            for(int v:graph.get(i)){
                if(v%2==0){
                    System.out.print(v +" ");
                }
            }
        }
        System.out.println();
    }
    // BFS for printing odd nodes
    public void BFS(int start){
        Queue<Integer> q= new LinkedList<>();
        boolean visited[]= new boolean[vertices+1];
        q.add(start);
        visited[start]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            if(node%2==1){
                System.out.print(node+" ");
            }
            for(int v:graph.get(node)){
                if(!visited[v]){
                    q.add(v);
                    visited[v]=true;
                }
            }
        }
        System.out.println();
    }
    public void outDegree(){
        for(int i=0;i<=vertices;i++){
            System.out.println(i +" has " + graph.get(i).size()+" degree");
        }
    }
    public static void main(String[] args) {
        Problem1 g= new Problem1(7);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 5);
        g.addEdge(2, 6);
        g.addEdge(6, 7);
        g.printGraph();
        System.out.println("BFS implementation");
        g.BFS(0);
        g.outDegree();

    }
}
