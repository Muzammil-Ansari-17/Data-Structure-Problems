/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.PriorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *
 * @author HAROON TRADERS
 */
public class PriorityQueueMain {
    public static void main(String[] args) {
        
        Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        q.add(100);
        q.add(120);
        q.add(300);
        q.add(400);
        q.add(40);
        
        System.out.println(q);
        System.out.println("After calling poll method");
        while(!q.isEmpty()){
        
            System.out.print(q.poll()+" ");
        }
        
    }
}
