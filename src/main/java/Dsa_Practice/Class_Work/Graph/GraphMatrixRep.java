/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Graph;

import javax.swing.JOptionPane;

/**
 *
 * @author HAROON TRADERS
 */
public class GraphMatrixRep {
    private int V; //total number of vertices
    private int E; //it will count number of edges
    private int adj[][];
    private int vertexCount;

    public GraphMatrixRep(int sizeOfMatrix) {
        this.V = sizeOfMatrix;
        this.E = 0;
        this.vertexCount=0;
        adj = new int[V][V];
    }
    
    public void addVertex(){
        if(V > vertexCount){
            vertexCount++;
        }else{
            JOptionPane.showMessageDialog(null, "Invalid Vertex");
        }
    }
    
    public void addEdges(int u, int v, int w){
        adj[u][v] = w;
        //adj[v][u] = 1;
        E++;
    }
    public void printGraph(){
        
        char c='A';
        System.out.println("Number of Vertices: "+V);
        System.out.println("Number of Edges: "+E);
        System.out.println("****** Undirected Graph"+V);
        System.out.println("  A  B  C  D  E");
        for(int arr[]:adj){
            System.out.print(c++ +" ");
            for(int x:arr){
                System.out.print(x+"  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
