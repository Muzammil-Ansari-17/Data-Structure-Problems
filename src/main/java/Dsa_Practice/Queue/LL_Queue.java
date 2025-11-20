package Dsa_Practice.Queue;

public class LL_Queue {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        Node rear,front;

        //        enqueue
        public  void enqueue(int data) {
            Node newnode = new Node(data);
            if (rear == null) {
                rear = front = newnode;
                return;
            } else {
                rear.next = newnode;
                rear = newnode;
            }
        }

        public int dequeue() {

            if (front == null) {
                System.out.println("Queue underflow");
                return -1;
            } else {
                int val = front.data;
                front = front.next;
                if (front == null) {
                    rear = null;
                }
                return val;
            }

        }

        public  void dispay(){
            if(front == null && rear == null){
                System.out.println("Queue is underflow ");
                return;
            }else{
                Node current = front;
                while(current != null){
                    System.out.println(current.data);
                    current = current.next;
                }
            }
        }

    public static void main(String[] args) {
                LL_Queue obj = new LL_Queue();
                obj.enqueue(55);
                obj.enqueue(85);
                obj.dispay();
        System.out.println();
                obj.enqueue(15);
                obj.enqueue(45);
                obj.enqueue(75);
                obj.dispay();
        System.out.println();
                obj.dequeue();
                obj.dispay();
        System.out.println();
                obj.dequeue();
                obj.dispay();


    }
}
