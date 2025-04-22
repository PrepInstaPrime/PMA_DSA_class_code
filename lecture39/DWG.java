import java.util.*;
class Pair{
    int dest;
    int weight;
    Pair(int val, int w){
        this.dest=val;
        this.weight=w;
    }
}
public class DWG {
    int vertices;
    ArrayList<ArrayList<Pair>> gw;
    DWG(int v){
        this.vertices=v;
        this.gw= new ArrayList<>();
        for(int i=0;i<v;i++){
            gw.add(new ArrayList<Pair>());
        }
    }
    public void addEdge(int src, int dest, int w){
        gw.get(src).add(new Pair(dest, w));
        gw.get(dest).add(new Pair(src, w)); // for undirected graph
    }
    public void display(){
        for(int i=0;i<vertices;i++){
            System.out.print(i+": [");
            for(Pair obj:gw.get(i)){
                System.out.print("("+obj.dest+","+obj.weight+")");
            }
            System.out.println("]");
        }
    }
    // BFS 
    public void BFS(int start){
        Queue<Integer> q= new LinkedList<>();
        boolean visited[]= new boolean[vertices];
        q.add(start);
        visited[start]=true;
        System.out.println("BFS Traversal:");
        while(!q.isEmpty()){
            int node= q.poll();
            System.out.print(node+" ");
            for(Pair obj: gw.get(node)){
                if(!visited[obj.dest]){
                    q.add(obj.dest);
                    visited[obj.dest]=true;
                }
            }
        }
        System.out.println();
    }
    // DFS
    public void DFS(int start){
        boolean visited[]= new boolean[vertices];
        System.out.println("DFS Traversal:");
        helperDFS(start, visited);
        System.out.println();

    }
    public void helperDFS(int start, boolean visited[]){
        visited[start] = true;
        System.out.print(start+" ");
        for(Pair obj:gw.get(start)){
            if(!visited[obj.dest]){
                helperDFS(obj.dest, visited);
            }
        }
    }
    public static void main(String[] args) {
        DWG graph = new DWG(6);
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 2);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 5, 3);
        graph.addEdge(3, 4, 1);
        graph.addEdge(5, 3, 2);
        graph.display();
        graph.BFS(0);
        graph.DFS(2);
    }
}
