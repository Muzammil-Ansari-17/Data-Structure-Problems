package Dsa_Practice.Others.Practice;

public class Stack {

//    StackUsingLinklist
    Node top;
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        if(top == null) {
            return true;
        }
        return false;
    }

    public void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            top = newNode;
        }else{
            newNode.next = top;
            top = newNode;
        }
    }

    public void pop(){
        if(isEmpty()){
            return;
        }else{
            top = top.next;
        }
    }

    public void peek(){
        if(isEmpty()){
            return;
        }
            System.out.print(top.data);

    }

//    Stack using Array


    public static void main(String[] args) {

    }
}
