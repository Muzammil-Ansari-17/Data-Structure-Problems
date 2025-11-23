package Dsa_Practice.Queue;

public class Array_CircularQueue {
    public static class Queue{
        int[] arr;
        int rear;
        int front;
        int max;

        Queue(int sizeofQ){
            this.arr = new int[sizeofQ];
            this.front = rear = -1;
            this.max = sizeofQ;
        }

        public boolean isEmpty() {
            return front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % max == front;
        }

        public void enqueue(int item) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (isEmpty()) {
                front = rear = 0;   // pehla item aa raha hai
            } else {
                rear = (rear + 1) % max;  // circular movement
            }

            arr[rear] = item;
            System.out.println(item + " inserted");
        }

        public int dequeue(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val = arr[front];
            if(front == rear){
                front = rear = -1;
            }else{
                front = (front + 1) % max;
            }
            return val;
        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }else{
                int val = front;
                while (val != rear){
                    System.out.println(arr[val]);
                    val = (val + 1) % max;
                }
                System.out.println(arr[rear]);
            }
        }
    }

    public static void main(String[] args) {
            Queue obj = new Queue(5);
            obj.enqueue(22);
            obj.enqueue(45);
            obj.enqueue(21);
            obj.enqueue(52);
            obj.dequeue();
        System.out.println();
            obj.display();

    }
}
