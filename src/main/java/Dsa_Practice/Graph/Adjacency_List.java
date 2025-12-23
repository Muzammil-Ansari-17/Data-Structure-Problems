import java.util.ArrayList;

public class Adjacency_List  {
        public static class Edge{
            int source;
            int destination;

            Edge(int s, int d){
               this.source = s;
               this.destination = d;
            }
        }
        public static void createGraph(ArrayList<Edge>[] graph){
            for (int i = 0; i < graph.length; i++) {
                    graph[i] = new ArrayList<Edge>();
            }

            graph[0].add(new Edge(0,1));
            graph[0].add(new Edge(0,2));
            graph[0].add(new Edge(0,3));

            graph[1].add(new Edge(1,0));
            graph[1].add(new Edge(1,3));

            graph[2].add(new Edge(2,0));
            graph[2].add(new Edge(2,3));
            graph[2].add(new Edge(2,4));
            graph[2].add(new Edge(2,5));

            graph[3].add(new Edge(3,0));
            graph[3].add(new Edge(3,1));
            graph[3].add(new Edge(3,2));

            graph[4].add(new Edge(4,2));

            graph[5].add(new Edge(5,2));
        }


    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph =  new ArrayList[v];
        createGraph(graph);

        for (int i = 0; i < graph[2].size(); i++) {
            Edge e = graph[2].get(i);
            System.out.println(e.destination+" ");
        }
    }
}
