package Dsa_Practice.Stack;

public class Missing_Pop {


//    public static class Stack(){
//        int top = -1;
//        int arr[] = new int[5];
//
//        void push(int data){
//            if(top == arr.length){
//                System.out.println("Stack overflow");
//            }else{
//                arr[top++] = data;
//             }
//            int pop()
//        }
//    }


    public static class stack{
        int top = -1;
        int[] arr = new int[5];

        void push (int data){
            if(top == arr.length -1){
                System.out.println("Stack overflow");
            }else{
                top++;
                arr[top] = data;
            }
        }

        void pop (){
            if(top == -1){
                System.out.println("Stack underflow");
            }else{
                System.out.println(arr[top]);
                top--;
            }
        }

    }

    public static void main(String[] args) {
        stack s = new stack();
        s.push(22);
        s.push(31);
        s.push(51);
        s.pop();
        s.pop();
        s.push(82);
        s.pop();
    }
}
