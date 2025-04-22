public class DMG {
    int graph[][];
    int vertices;
    public DMG(int mv){
        vertices=mv;
        graph=new int [mv+1][mv+1];
    }
    public void insert(int src, int dest){
        graph[src][dest]=1;
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
            if(graph[i][v]==1){
                inDegree++;
            }
        }
        return inDegree;
    }
    public static void main(String[] args) {
        DMG g=new DMG(5);
        g.insert(1, 2);
        g.insert(1, 3);
        g.insert(2, 4);
        g.insert(3, 4);
        g.insert(4, 5);
        g.read();
        System.out.println("After deleting edge (1,2)");
        g.delete(1, 2);
        g.read();
    }
}
