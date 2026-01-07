package Dsa_Practice.Graph;

import java.util.ArrayList;

public class directed_Adjacency_List {
    public static class Edge{
        int destination;
        int source;

        public Edge(int s , int d){
            this.source = s;
            this.destination = d;
        }
    }
    public static void directed_graph(ArrayList<Edge>[] graph, int s,int d){
        graph[s].add(new Edge(s,d));
    }

    public static void creategraph(ArrayList<Edge>[] graph){

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        directed_graph(graph,0,2);
        directed_graph(graph,0,3);

        directed_graph(graph,1,0);

        directed_graph(graph,2,1);

        directed_graph(graph,3,4);

        directed_graph(graph,4,0);
    }
    public static void main(String[] args) {
        int v = 5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        for (int i = 0; i < graph.length ; i++) {
            System.out.print(i+" -> ");
            for (Edge e: graph[i]){
                System.out.print(e.destination+" ");
            }
            System.out.println();
        }
    }
}
