/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.Stack;


public class StackStatic {
    int stackArr[];
    int top;

    public StackStatic(int sizeOfStack) {
        this.stackArr = new int[sizeOfStack];
        this.top = -1;
    }
    public void push(int item){
        top++;
        if(isFull()){
            System.out.println("Stack Overflow");
            top--;
            return;
        }else{
            stackArr[top] = item;
        }
    }
    public void pop(){
    
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return;
        }else{
            System.out.println("pop:  "+stackArr[top--]);
        }
    }
    public boolean isFull(){
        if(top==stackArr.length)
            return true;
        else
            return false;
    }

    public boolean isEmpty(){
        if(top==-1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        StackStatic obj = new StackStatic(5);
        obj.push(55);
        obj.push(67);
        obj.isEmpty();
        obj.pop();
        obj.pop();
    }
}
