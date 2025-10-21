package org.example.Stack;

public class StackLL {
    Node head;
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
        if(head == null){
            head = newnode;
            return;
        }else{
            newnode.next = head;
            head = newnode;
        }
    }

    public void pop(){
        int top = -1;

        if(top == )

    }



    public static void main(String[] args) {
    StackLL obj = new StackLL();
    obj.push(10);
    obj.push(22);
    obj.push(24);
    obj.pop();
    obj.pop();


    }
}
