//Scenario:
//A hospital waiting area can hold only 5 patients at a time. When it becomes full, new patients cannot
//enter until someone leaves. You are required to simulate this using a Circular Queue.

package Dsa_Practice.Queue;

public class Circular_Queue_Overflow_Simulation {
    public static class C_Queue {

        String[] arr;
        int front;
        int rear;
        int max = 5;

        C_Queue() {
            this.arr = new String[max];
            this.front = -1;
            this.rear = -1;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % max == front;
        }

        public void enqueue(String patient_Name) {
            if (isFull()) {
                System.out.println("Mr/Ms "+patient_Name+" waiting area is Full.");
                return;
            } else {
                if (isEmpty()) {
                    front = 0;
                }
                rear = (rear + 1) % max;
                arr[rear] = patient_Name;
            }
        }

        public void dequeue(){
            if(isEmpty()){
                System.out.println("Waiting area is Empty.");
                return;
            }
            String removed = arr[front];

            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1 ) % max;
            }
            System.out.println("\nPatient "+removed+ " left the waiting area.");
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Waiting area is Empty.");
                return;
            }else{
                System.out.println("\nPatient in waiting area are...");

                int i = front;
                while(true){
                    System.out.println(arr[i]+" ");
                    if(i == rear){
                        break;
                    }
                    i = (i + 1) % max;
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
            C_Queue queue = new C_Queue();
            queue.enqueue("Muzammil");
            queue.enqueue("Ahmed");
            queue.enqueue("Ali");
            queue.enqueue("Ibrahim");
            queue.enqueue("Ahmed");
            queue.display();
            queue.enqueue("Sara");
            queue.dequeue();
            queue.display();
    }
}
