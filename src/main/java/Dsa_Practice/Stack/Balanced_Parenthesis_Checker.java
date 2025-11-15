package Dsa_Practice.Stack;

public class Balanced_Parenthesis_Checker {
        public static class stack{
            char[] arr;
            int top;

            stack(int size){
                arr = new char[size];
                top = -1;
            }

            public void push(char value){
                if(isFull()){
                    System.out.println("Stack overflow");
                    return;
                }else{
                    top++;
                    arr[top] = value;
                }
            }

            public char pop(){
                if(isEmpty()){
                    System.out.println("Stack underflow");
                    return 0;
                }
                return arr[top--];
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
        }

        public boolean check_paren(String exp){
            stack st = new stack(100);

            for(char ch: exp.toCharArray()){
                if(ch == '[' || ch == '{' || ch == '('){
                    st.push(ch);
                }else if (ch == ']' || ch == '}' || ch == ')'){
                    if(st.isEmpty()){
                        return false;
                    }
                    char top = st.pop();
                    if(!isMatching(top ,ch)){
                        return false;
                    }
                }
            }
            return st.isEmpty();
        }

        public boolean isMatching(char open , char close){
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }

    public static void main(String[] args) {
            Balanced_Parenthesis_Checker obj = new Balanced_Parenthesis_Checker();
            boolean result = obj.check_paren("{(a+b) * [c/(d-e)]}");
            System.out.println("Balanced ?:"+result);
        }

}
