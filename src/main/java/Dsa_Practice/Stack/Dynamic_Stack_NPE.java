package Dsa_Practice.Stack;

public class Dynamic_Stack_NPE {

    class Node{
            int data;
            Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }


    class StackLL{
        Node top;

        void push(int data){
            Node newnode = new Node(data);
            if(top == null){
                top = newnode;
            }else{
                newnode.next = top;
                top = newnode;
            }
        }
        void pop(){
            if(top == null ){
                System.out.println("Stack underflow");
                return;
            }else{
                System.out.println("Popped :" +top.data);
                top = top.next;
            }
        }
    }

    public static void main(String[] args) {

    }
}
