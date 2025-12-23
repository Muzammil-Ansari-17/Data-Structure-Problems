package Dsa_Practice.Graph;

import java.util.ArrayList;

public class Adjacency_List  {
    public static class edge{
        int source;
        int dest;

        edge(int s, int d){
            this.source = s;
            this.dest = d;
        }
    }
    public static void createGraph(ArrayList<edge>Graph[]){
        for (int i = 0; i < Graph.length; i++) {
            Graph[i] = new ArrayList<edge>();
        }
        Graph[0].add(new edge(0,2));

        Graph[1].add(new edge(1,2));
        Graph[1].add(new edge(1,3));

        Graph[2].add(new edge(2,0));
        Graph[2].add(new edge(2,1));
        Graph[2].add(new edge(2,3));

        Graph[3].add(new edge(3,1));
        Graph[3].add(new edge(3,2));
    }
    public static void main(String[] args) {
            int V = 4;

        ArrayList<edge> Graph[] = new ArrayList<>(V);
    }
}
