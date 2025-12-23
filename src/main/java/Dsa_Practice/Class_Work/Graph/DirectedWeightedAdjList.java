///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package Dsa_Practice.Class_Work.Graph;
//
//import java.util.LinkedList;
//
///**
// *
// * @author HAROON TRADERS
// */
//public class DirectedWeightedAdjList {
//    private int V;
//    private int E;
//    private int vertexCount;
//    LinkedList<Edge>adj[];
//
//    public DirectedWeightedAdjList(int sizeOflist) {
//        this.V = sizeOflist;
//        this.E = vertexCount = 0;
//        adj = new LinkedList[V];
//        for (int i = 0; i < V; i++) {
//            adj[i] = new LinkedList<>();
//        }
//
//    }
//    public void addVertex(){
//
//        if(V>vertexCount){
//            vertexCount++;
//        }else{
//            System.out.println("Invalid Vertex");
//        }
//    }
//
//    public void addEdge(int u, int v, int w){
//
//        Edge edge = new Edge(u, v, w);
//        adj[u].add(edge);
//        E++;
//    }
//    public void printGraph(){
//        char c='A';
//        System.out.println("Vertices:   "+V);
//        System.out.println("Edges:   "+E);
//        for (int i = 0; i < V; i++) {
//            System.out.print(c++ +"-->");
//            for (Edge x:adj[i]) {
//                System.out.print("|"+x.getDest()+"|"+x.getWi()+"|-->");
//            }
//            System.out.println("NULL");
//        }
//
//    }
//
//
//}
