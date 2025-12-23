package Dsa_Practice.Graph;

import java.util.ArrayList;

public class Adjacency_Weighted_List {
    public static class Edge{
        int source;
        int destination;
        int weight;

        public Edge(int s, int d, int w){
            this.destination = d;
            this.weight = w;
            this.source = s;
        }
    }
    public static void createGraph(ArrayList<Edge>[] graph){
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,4));
        graph[0].add(new Edge(0,2,6));
        graph[0].add(new Edge(0,3,6));

        graph[1].add(new Edge(1,0,7));
        graph[1].add(new Edge(1,3,10));

        graph[2].add(new Edge(2,0,10));
        graph[2].add(new Edge(2,3,6));
        graph[2].add(new Edge(2,4,8));
        graph[2].add(new Edge(2,5,4));

        graph[3].add(new Edge(3,0,2));
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,2,65));

        graph[4].add(new Edge(4,2,4));

        graph[5].add(new Edge(5,2,76));

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> [] graph = new ArrayList[v];

        createGraph(graph);
        System.out.println("source destination weight ");
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                Edge e = graph[i].get(j);
                System.out.println(" "+i+ "         "+ e.destination+"        " +e.weight);

            }
        }


    }
}
