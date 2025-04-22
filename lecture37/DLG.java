import java.util.*;
public class DLG {
    int vertices;
    ArrayList<ArrayList<Integer> > listGraph;
    public DLG(int v){
        this.vertices=v;
        listGraph= new ArrayList<>();
        for(int i=0;i<v;i++){
            listGraph.add(new ArrayList<>());
        }
    }
    public void addEdge(int src, int dest){
        listGraph.get(src).add(dest);
    }
    public void read(){
        for(int i=0;i<vertices;i++){
            System.out.print(i+"-> [");
            for(int node:listGraph.get(i)){
                System.out.print(node+" ");
            }
            System.out.print(']');
            System.out.println();
        }
    }
    public void delete(int src, int dest){
        int idx= listGraph.get(src).indexOf(dest);
        if(idx!=-1){
            listGraph.get(src).remove(idx);
        }else{
            System.out.println("element not found");
        }
    }
    // BFS: breadth first search
    public void BFS(int start){
        // level order traversal 
        // it iterate breadth first 
        // this uses queue
        boolean visited[]= new boolean[vertices];
        Queue<Integer> q= new LinkedList<>();
        visited[start]=true;
        q.offer(start);
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.print(node+" ");
            for (int sub : listGraph.get(node)) {
                if (!visited[sub]) {
                    visited[sub] = true;
                    q.offer(sub);
                }
        }
        System.out.println();
    }
}
    // DFS 
    public void DFS(int start){
        boolean visited[]= new boolean [vertices];
        helperDFS(start,visited);
        
       
    }
    public void helperDFS(int start, boolean[]visited ){
            System.out.print(start+" ");
            for(int next: listGraph.get(start)){
                if(!visited[next]){
                    helperDFS(next, visited);
                }
            }   
    }
    public static void main(String[] args) {
        DLG graph= new DLG(6);
        graph.addEdge(0, 1);
        graph.addEdge(1,2 );
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.read();
        System.out.println("after deletion");
        graph.delete(1, 4);
        graph.read();
        graph.BFS(3);
        graph.DFS(0);
    }
}
