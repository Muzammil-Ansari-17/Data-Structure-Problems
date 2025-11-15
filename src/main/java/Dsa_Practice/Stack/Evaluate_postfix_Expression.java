package Dsa_Practice.Stack;

import java.util.Arrays;

public class Evaluate_postfix_Expression {
        public static class stack{
            int[] arr;
            int top;

            stack(int size){
                arr = new int[size];
                top = -1;
            }

            public void push(int data){
                if(isFull()){
                    System.out.println("Stack overflow");
                    return;
                }else{
                    top++;
                    arr[top] = data;
                }
            }
            public int pop(){
                if(isEmpty()){
                    System.out.println("Stack underflow");
                    return -1;
                }else{
                    return arr[top--];
                }
            }

            public boolean isEmpty(){
                if(top == -1){
                    return true;
                }else{
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

            public int evaluate(String exp){

                String[] value = exp.split(" ");
                stack st = new stack(20);

                for(String x: value){
                    if(x.equals("+") || x.equals("-") || x.equals("/") || x.equals("*")){

                        int b = st.pop();
                        int a = st.pop();

                        int result = 0;

                        switch(x){
                            case "+": result = a + b; break;
                            case "-": result = a - b; break;
                            case "*": result = a * b; break;
                            case "/": result = a / b; break;
                        }

                        st.push(result);
                    }else{
                       st.push(Integer.parseInt(x));
                    }
                }
                return st.pop();
            }
        }
    public static void main(String[] args) {
        stack obj = new stack(20);
        String input = "6 2 3 + - 3 8 2 / + *";
        int output = obj.evaluate(input);
        System.out.println("Output :"+output);
    }
}
