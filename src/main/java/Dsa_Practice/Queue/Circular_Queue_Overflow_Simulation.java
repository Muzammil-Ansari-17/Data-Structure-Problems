//Scenario:
//A hospital waiting area can hold only 5 patients at a time. When it becomes full, new patients cannot
//enter until someone leaves. You are required to simulate this using a Circular Queue.

package Dsa_Practice.Queue;

public class Circular_Queue_Overflow_Simulation {
    public static class C_Queue{
        String[] arr;
        int front;
        int rear;
        int max = 5;

        C_Queue(){
            this.arr = new String[max];
            this.front = -1;
            this.rear = -1;
        }

        public boolean isEmpty(){
            return front= -1;
        }

        public boolean isFull(){
            return rear = (rear + 1) % max = front;
        }
        public void enque(String Patient_Name){

        }
    }

    public static void main(String[] args) {

    }
}
