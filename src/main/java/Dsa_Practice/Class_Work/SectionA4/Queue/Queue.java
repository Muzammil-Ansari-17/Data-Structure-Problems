/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Queue;

/**
 *
 * @author HAROON TRADERS
 */
public class Queue {
    int queuArr[];
    int front,rear;
    int MAX;
    int count=0;
    public Queue(int sizeOfQ) {
        queuArr = new int[sizeOfQ];
        front = rear = -1;
        MAX = sizeOfQ;
    }
    public void enqueue(int item){
        count++;
        if((rear + 1) % MAX == front){
            System.out.println("Queue is FULL");
            count--;
            return;
        }else{
        
            if(front == -1 && rear == -1){
                front = rear = 0;
            }else{
                rear = (rear + 1) % MAX;
            }
            
            queuArr[rear] = item;
        }
    } // end of NQ
    public void dequeue(){
        int val;
        if(front==-1){
            System.out.println("Queue is EMPTY");
            return;
        }else{
        
            val = queuArr[front];
            if(front == rear){
                front = rear =-1;
            }else if(front == MAX-1){
                front = 0; 
            }else{
                front++;
            }
        }
        System.out.print(val+" ");
    }
    
}
