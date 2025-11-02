package Dsa_Practice.Stack;

import java.util.Stack;

public class Palindrome {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node top = head;
    public void push(int data){
        Node newnode = new Node(data);
        if(top == null){
            top = newnode;
        }else{
            Node current = top;
            while(current.next != null){
                current = current.next;
            }
            current.next = newnode;

        }
    }
    public void pop(){
        if(top == null){
            System.out.println("list not exist");
            return;
        }else{
            System.out.println(top.data);
            top = top.next;
        }
    }
    public boolean check_Palindrome(){
        Stack<Integer> stack = new Stack<>();
        Node current = top;
        while(current != null){
            stack.push(current.data);
            current = current.next;
        }
        current = top;
        while(current != null){
            if(current.data != stack.pop()){
                System.out.println("list is not palindrome");
                return false;
            }
            current = current.next;
        }
        System.out.println("Number is palindrome");
        return true;
    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.push(1);
        obj.push(2);
        obj.push(2);
        obj.check_Palindrome();
    }
}
