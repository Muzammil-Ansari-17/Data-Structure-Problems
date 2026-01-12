package Dsa_Practice.Graph;

public class AdjacencyMatrix {

    public static void undirectedGraph(int[][] graph,int s,int d, int weight){
        graph[s][d] = weight;
        graph[d][s] = weight;
    }

    public static void createGraph(int[][] graph){
        undirectedGraph(graph, 0, 1,20);
        undirectedGraph(graph, 5, 2,90);

        undirectedGraph(graph, 1, 3,50);
        undirectedGraph(graph, 2, 4,40);

        undirectedGraph(graph, 2, 4,30);
        undirectedGraph(graph, 3, 2,71);
    }
    public static void main(String[] args) {
        int v = 6 ;

        int[][] graph = new int[v][v];

        createGraph(graph);

        for (int i = 0; i < v; i++) {
            System.out.print(i+" ->  ");
            for (int j = 0; j < v; j++) {
                System.out.print(graph[i][j]+ "  ");
            }
            System.out.println();
        }
    }
}
