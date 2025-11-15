package Dsa_Practice.Stack;

public class Reverse_String {
    public static class stack{
        char[] arr;
        int top;

        stack(int size){
            arr = new char[size];
            top = -1;
        }

        public void push (char data){
            if(isFull()){
                System.out.println("Stack overflow");
                return;
            }else{
                top++;
                arr[top] = data;
            }
        }

        public char pop(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return 0;
            }else{
                return arr[top--];
            }
        }

        public boolean isEmpty(){
            if(top == -1){
                return true;
            }else {
                return false;
            }
        }

        public boolean isFull(){
            if(top == arr.length -1){
                return true;
            }else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        String input = "Stack";
        stack st = new stack(10);

        for(char x: input.toCharArray()){
            st.push(x);
        }

        StringBuilder reversed = new StringBuilder();

        while(!st.isEmpty()){
            reversed.append(st.pop());
        }

        System.out.println("Input :"+input);
        System.out.println("Output :"+reversed.toString());

    }
}
