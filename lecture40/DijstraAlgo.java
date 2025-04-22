import java.util.*;
class Pair{
    int dest;
    int weight;
    Pair(int val, int w){
        this.dest=val;
        this.weight=w;
    }
}
public class DijstraAlgo {
    int vertices;
    ArrayList<ArrayList<Pair>> gw;
    DijstraAlgo(int v){
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
    public void algo(int src, int dest){
        boolean visited[]=new boolean[vertices];
        int distance[]=new int[vertices];
        Arrays.fill(distance,Integer.MAX_VALUE);
        distance[src]=0;
        PriorityQueue<Pair> pq= new PriorityQueue<>((a,b)->a.weight-b.weight);
        pq.add(new Pair(src, 0));
        visited[src]=true;
        while(!pq.isEmpty()){
            Pair current= pq.poll();
            int node=current.dest;
            for(Pair obj:gw.get(node)){
                int newNode= obj.dest;
                int w= obj.weight;
                if(!visited[newNode]&&distance[node]+w<distance[newNode]){
                    distance[newNode]=distance[node]+w;
                    pq.add(new Pair(newNode, w));
                }
            }

        }
        System.out.println("The distance between "+src+" and "+dest+" is: "+distance[dest]);
    }
    public static void main(String[] args) {
        DijstraAlgo graph = new DijstraAlgo(6);
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
        graph.algo(0, 4);
    }
}
