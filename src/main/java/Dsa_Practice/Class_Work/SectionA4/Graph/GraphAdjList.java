/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Graph;

import java.util.LinkedList;

/**
 *
 * @author HAROON TRADERS
 */
public class GraphAdjList {
    private int V;
    private int E;
    private int vertexCount;
    LinkedList<Integer>adj[];

    public GraphAdjList(int sizeOfList) {
        this.V = sizeOfList;
        this.E = vertexCount = 0;
        adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<>();
        }
                
    }
    
    public void addVertex(){
    
        if(V>vertexCount){
            vertexCount++;
        }else{
            System.out.println("Invalid Vertex");
        }
    }
    
    public void addEdge(int u, int v){
    
        adj[u].add(v);
        //adj[v].add(u);
        E++;
    }
    
    public void printGraph(){
        char c='A';
        System.out.println("Vertices:"+V);
        System.out.println("Edges:"+E);
        for (int i = 0; i < V; i++) {
            System.out.print(c++ +":");
            for (int x:adj[i]) {
                System.out.print("|"+x+"|-->");
            }
            System.out.println("NULL");
        }
    }
    
    
    
}
