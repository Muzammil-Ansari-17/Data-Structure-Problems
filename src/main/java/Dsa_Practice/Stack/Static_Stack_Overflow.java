package Dsa_Practice.Stack;

public class Static_Stack_Overflow {

//  Buggy Version
//    class stack {
//        int top;
//        int[] arr = new int[5];
//
//        stack(){
//            top  = 0; ---> this.top = -1;
//        }
//        void push(int data){
//            if(top == arr.length){
//                System.out.println("Stack overflow");
//                return;
//            }else{
//                arr[top++]; ----> top++
//                arr[top] = data;
//            }
//        }
//    }

    //Corrected version

    public static class Stack{
        int top;
        int[] arr = new int[5];

        Stack(){
            this.top = -1;
        }
        public void push(int data){
            if(top == arr.length){
                System.out.println("stack is overflowed");
                return;
            }else{
                top++;
                arr[top] = data;
            }
        }
        public void display(){
            if(top == arr.length){
                System.out.println("stack overflow");
                return;
            }else{
                for (int i = 0; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
            Stack obj = new Stack();
            obj.push(22);
            obj.push(22);
            obj.push(22);
            obj.push(22);
            obj.push(22);
            obj.display();


    }
}
