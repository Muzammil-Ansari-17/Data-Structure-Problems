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
    public static void main(String[] args) {

    }
}


//    Stack using Array
    public static class StaticStack{
        int[] arr;
        int top;

        StaticStack(int size){
            this.arr = new int[size];
            this.top = -1;

        }
    public boolean StaticisEmpty(){
        if(top == -1){
            return true;
        }
        return false;
    }

    public boolean StaticisFull(){
        if(top == arr.length){
            
        }
    }
    public static StaticPush(int data){
        if()
    }

    static void main() {

    }
    }





