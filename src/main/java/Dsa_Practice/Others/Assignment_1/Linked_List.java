//  Task 1: Linked List
//  a) Suppose that we have the List class whose object named obj1 represent the linked list given in
//        Figure, what will happen if we try to copy the linked list represented by obj1 into another object
//  named obj2 using the syntax (1.5 Mark)
//  obj2 = obj1;
//  How to solve that problem?
//  Note: No need to create the program just highlights the problem and provide solutions.
//        b) Create a program that takes a string from user, stores each of its characters in a doubly linked list
//  and check whether that string is palindrome or not. You should write the function insertItem as
//  well that takes a single character and stores it at the front.
//  Your implementation should consist of
//  i. A class named DoublyNode whose single object defines a single node in doubly linked list
//        (0.5 Mark)
//  ii. class named DoublyList whose single object defines a doubly linked list. (0.5 Mark)
//  iii. A constructor of DoublyList (0.5 Mark)
//  iv. A member function of DoublyList named insertItem that takes a character as input and
//  tores it in doubly linked list. (0.5 Mark)
//  v. A member function of DoublyList named checkPalindrome that returns true if string stored
//  is palindrome and return false if not palindrome. (0.5 Mark
package Dsa_Practice.Others.Assignment_1;

public class Linked_List {
    Node head;
   public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void print(){
       Node current = head;
           while(current != null){
               System.out.print(" -> " +current.data);
               current = current.next;
           }
        System.out.println(" Null");

    }
    public static void main() {
        Linked_List obj1 = new Linked_List();
            obj1.add(1);
            obj1.add(2);
            obj1.add(3);
            obj1.add(4);
            obj1.print();
        Linked_List obj2 = new Linked_List();
            obj2.add(5);
            obj2.add(6);
            obj2.add(7);
            obj2.add(8);
            obj2.print();

            obj2 = obj1;
            obj2.print();

            obj1.print();

    }
}
