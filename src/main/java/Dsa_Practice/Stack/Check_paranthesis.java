package Dsa_Practice.Stack;


import java.util.Scanner;

public class Check_paranthesis{
    public static class stack {
            char[] arr;
            int top;

        stack(int size){
            arr = new char[size];
            top = -1;
        }

        public void push(char value ){
            if(top == arr.length-1){
                throw new RuntimeException("Stack overflow");
            }
            arr[++top] = value;
        }

        public char pop(){
            if(top == -1){
                throw new RuntimeException("Stack underflow");
            }
            return arr[top--];
        }

        public boolean isempty(){
            if(top == -1){
                return true;
            }else{
                return false;
            }
        }
    }

    public static boolean isbalanced(String expr){
        stack obj = new stack(100);

        for (char ch : expr.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '['){
                obj.push(ch);
            }else if(ch == ')' || ch == '}' || ch == ']'){
                if(obj.isempty()){
                    return false;
                }
                char top = obj.pop();
                if(!isMatching(top,ch)){
                    return false;
                }
            }
        }
        return obj.isempty();
    }

    public static boolean isMatching(char open , char close){
        return  (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression");
        String expr = sc.nextLine();

        if(isbalanced(expr)){
            System.out.println("paranthesis is balanced");
        }else{
            System.out.println("paranthesis is not balanced");
        }
    }
}
