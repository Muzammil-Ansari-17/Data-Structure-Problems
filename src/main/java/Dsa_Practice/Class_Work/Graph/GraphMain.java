/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Graph;

/**
 *
 * @author HAROON TRADERS
 */
public class GraphMain {
 
    public static void main(String[] args) {
        GraphMatrixRep graph = new GraphMatrixRep(5);
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        graph.addVertex();
        
        graph.addEdges(0, 1,4);
        graph.addEdges(1, 2,2);
        graph.addEdges(2, 4,8);
        graph.addEdges(1, 3,1);
        graph.addEdges(4, 3,10);
        graph.addEdges(3, 0,5);
        
        graph.printGraph();
    }
}
