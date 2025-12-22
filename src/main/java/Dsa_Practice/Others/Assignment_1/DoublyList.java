package Dsa_Practice.Others.Assignment_1;

import java.util.Scanner;

public class DoublyList{
        DoublyNode head;
        DoublyNode tail;

        DoublyList(){
            head = null;
            tail = null;
        }

    public void insertItem(char input){
        DoublyNode newNode = new DoublyNode(input);
        if(head == null){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public boolean checkPalindrome(){
        if(head == null){
            return true;
        }
        DoublyNode left = head;
        DoublyNode right = tail;
        while(left != right && left.prev != right){
            if(right.data != left.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
            return true;
    }

    public static void main(String[] args) {
     DoublyList obj1 = new DoublyList();

        System.out.print("Enter Element : ");
        Scanner sc = new Scanner(System.in);
        String Element = sc.nextLine();

        for(char x: Element.toCharArray()){
            obj1.insertItem(x);
        }

        System.out.println(obj1.checkPalindrome() ? "Palindrome" : "Not Palindrome");
    }
}

