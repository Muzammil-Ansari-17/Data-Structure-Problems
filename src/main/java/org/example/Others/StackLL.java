package org.example.Others;

public class StackLL {
    Node top = null;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void push(int data){
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
        }else{
            newnode.next = top;
            top = newnode;
        }
    }
    public void pop(){
        if(top == null){
            System.out.println("stack underflow");
            return;
        }else{
            System.out.println(top.data);
            top = top.next;
        }
    }
    public void peek(){
        if(top == null){
            System.out.println("stack underflow");
            return;
        }else {
            System.out.println(top.data);
        }
    }

    public static void main(String[] args) {
        StackLL obj = new StackLL();
        obj.push(89);
        obj.push(10);
        obj.peek();
        obj.pop();
        obj.pop();
        obj.peek();
    }
}
