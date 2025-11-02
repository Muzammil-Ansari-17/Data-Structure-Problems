package Dsa_Practice.Stack;

public class Stack_array {
        int[] stackarr;
        int top;

        Stack_array(int sizeofarray){
            this.stackarr = new int[sizeofarray];
            this.top = -1;
        }

        public void push(int data){
            if(isFull()){
                System.out.println("stack is overflow ");
                return;
            }else{
                stackarr[++top] = data;
            }
        }

        public void pop(){
            if(isEmpty()){
                System.out.println("stack is underflow");
                return;
            }else{
                System.out.println("pop  :"+stackarr[top--]);
            }
        }

        public void peek(){
            if(isFull()){
                System.out.println("Stack overflow");
                return;
            } else if (isEmpty()) {
                System.out.println("Stack underflow");
                return;
            }else{
                System.out.println("peek  :"+stackarr[top]);
            }

        }


        public boolean isFull(){
            if(top == stackarr.length){
                return true;
            }else{
                return false;
            }
        }

        public boolean isEmpty(){
            if(top == -1){
                return true;
            }else{
                return false;
            }
        }

    public static void main(String[] args) {
        Stack_array obj = new Stack_array(5);
        obj.push(44);
        obj.push(90);
        obj.push(66);
        obj.push(61);
        obj.pop();
        obj.peek();
        obj.pop();
    }
}
