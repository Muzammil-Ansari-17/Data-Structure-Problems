/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Graph;

/**
 *
 * @author HAROON TRADERS
 */
public class GraphAdjListMain {
 
        public static void main(String[] args) {
        //GraphAdjList graph = new GraphAdjList(5);
        DirectedWeightedAdjList graph = new DirectedWeightedAdjList(5);
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        
        graph.addEdge(0, 1,5);
        graph.addEdge(1, 2,2);
        graph.addEdge(1, 3,8);
        graph.addEdge(2, 4,4);
        graph.addEdge(4, 3,10);
        graph.addEdge(3, 0,7);
        
        graph.printGraph();
    }
}
