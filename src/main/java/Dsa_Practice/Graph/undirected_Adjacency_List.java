package Dsa_Practice.Graph;

import java.util.ArrayList;

public class undirected_Adjacency_List {
    public static class Edge{
        int source;
        int destination;

        public Edge(int s, int d){
            this.source = s;
            this.destination = d;
        }
    }

    public static void undirectedGraph(ArrayList<Edge>[] graph, int s, int d){
        graph[s].add(new Edge(s,d));
        graph[d].add(new Edge(d,s));
    }
    public static void creategraph(ArrayList<Edge>[] graph){

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        undirectedGraph(graph,0,2);
        undirectedGraph(graph,0,3);

        undirectedGraph(graph,1,0);

        undirectedGraph(graph,2,1);

        undirectedGraph(graph,3,4);
    }
    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);

        for (int i = 0; i < graph.length; i++) {
            System.out.print(i+" -> ");
            for (Edge e: graph[i]){
                System.out.print(e.destination+ " ");
            }
            System.out.println();
        }

    }
}
