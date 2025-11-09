package Dsa_Practice.Queue;

public class ArrayQueue {
    public static class Queue{
        int[] arr;
        int size;
        int rear = -1;

        Queue(int size ){
            arr = new int[size];
            this.size = size;
        }
        public boolean isEmpty(){
            return rear == -1;
        }

        //enqueue
        public void add(int data){
            if( rear == size -1){
                System.out.println("Full Queue");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //Dequeue
        public int remove(){
            if(isEmpty()){
                System.out.println("queue is Empty");
                return -1;
            }else{
                int front = arr[0];

                for (int i = 0; i < rear ; i++) {
                    arr[i] = arr[i+1];
                }
                rear--;
                return front ;
            }
        }

        public void  peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return ;
            }else{
                System.out.println(arr[0]);
            }

        }

        public void display(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return;
            }
            for (int i = 0; i <= rear; i++) {
                System.out.println(arr[i]+ " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
          Queue q = new Queue(10);
          q.add(2);
          q.add(3);
          q.add(4);
          q.add(5);
          q.display();

          q.remove();
          q.display();

          q.remove();
          q.display();

          q.peek();
          System.out.println();

          q.add(7);
          q.add(9);
          q.display();

          q.remove();
          q.display();
    }
}
