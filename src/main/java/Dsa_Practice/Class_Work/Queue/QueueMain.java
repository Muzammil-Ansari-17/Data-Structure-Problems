/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Queue;

/**
 *
 * @author HAROON TRADERS
 */
public class QueueMain {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enqueue(-1);
        q.enqueue(10);
        q.enqueue(15);
        q.enqueue(20);
        q.dequeue();
        q.enqueue(30);
        q.dequeue();
        q.enqueue(309);
        q.enqueue(310);
        q.enqueue(310);
//        for (int i = 0; i < q.count; i++) {
//            System.out.print(q.dequeue()+" ");
//        }
        System.out.println("");
        
        
    }
}
