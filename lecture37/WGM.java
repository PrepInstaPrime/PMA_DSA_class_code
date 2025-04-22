public class WGM {
    int graph[][];
    int vertices;
    public WGM(int mv){
        vertices=mv;
        graph=new int [mv+1][mv+1];
    }
    public void insert(int src, int dest, int weight){
        graph[src][dest]=weight;
    }
    public void delete(int src, int dest){
        graph[src][dest]=0;
    }
    public void read(){
        for(int i=0;i<=vertices;i++){
            for(int j=0;j<=vertices;j++){
                System.out.print(graph[i][j]+" ");
            }
            System.out.println();
        }
    }
    public int inDegree(int v){
        int inDegree=0;
        for(int i=0;i<=vertices;i++){
            if(graph[i][v]!=0){
                inDegree++;
            }
        }
        return inDegree;
    }
    public static void main(String[] args) {
        WGM g=new WGM(5);
        g.insert(1, 2, 10);
        g.insert(1, 3, 4);
        g.insert(2, 4, 5);
        g.insert(3, 4, 8);
        g.insert(4, 5, 20);
        g.read();
        System.out.println("Degree of 4 ->"+ g.inDegree(4));
        System.out.println("After deleting edge (1,2)");
        g.delete(1, 2);
        g.read();
    }
}
