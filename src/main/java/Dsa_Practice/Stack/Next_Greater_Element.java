package Dsa_Practice.Stack;

public class Next_Greater_Element {
    public static class stack{
        int[] arr = {4, 5, 2, 25};
        int top;

        stack(){
            top = -1;
        }

        public void push(int value){
            if(isFull()){
                System.out.println("Stack overflow");
                return;
            }else{
                top++;
                arr[top] = value;
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return 0;
            }
            return arr[top--];
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Stack underflow");
                return -1;
            }else{
                return arr[top];
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
            if(top == arr.length -1 ){
                return true;
            }else{
                return false;
            }
        }
        public void N_G_E(){

            int[] indexStack = new int[arr.length];
            int idxTop = -1;

            for (int i = 0; i < arr.length; i++) {
                while (idxTop != -1 && arr[i] > arr[indexStack[idxTop]]) {
                    int idx = indexStack[idxTop--];
                    System.out.println(arr[idx] + " → " + arr[i]);
                }
                indexStack[++idxTop] = i;
            }


            while (idxTop != -1) {
                int idx = indexStack[idxTop--];
                System.out.println(arr[idx] + " → -1");
            }
        }


    }

    public static void main(String[] args) {
            stack st = new stack();
            st.N_G_E();




    }
}
