package org.example.Others;

public class Stack_Arr {
    int[] arr;
    int top ;

    Stack_Arr(int sizeofarr){
        this.arr = new int[sizeofarr];
        this.top = -1;
    }

    public void push(int data){
        if(isfull()){
            System.out.println("stack is overflow");
            return;
        }else{
            arr[top++] = data;

        }
    }
    public void pop(){
        if(isempty()){
            System.out.println("stack is underflow");
            return;
        }else{
            System.out.println(arr[top]);
            top--;
        }
    }

    public boolean isempty(){
        if(top == -1){
            return true;
        }else{
            return false;
        }
    }
    public boolean isfull(){
        if(top == arr.length){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {

    }
}
