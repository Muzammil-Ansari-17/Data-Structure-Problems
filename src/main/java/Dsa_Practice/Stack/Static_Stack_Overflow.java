package Dsa_Practice.Stack;

public class Static_Stack_Overflow{
    int top;
    int[] arr = new int[5];

    Static_Stack_Overflow(){
        top = -1;
    }

    void push(int data){
        if(top == arr.length){
            System.out.println("Stack overflow");
        }else{
            top++;
            arr[top] = data;
        }
    }

    public static void main(String[] args) {
            Static_Stack_Overflow st = new Static_Stack_Overflow();
            st.push(57);
            st.push(87);
            st.push(97);
            st.push(10);
            st.push(79);
    }
}
