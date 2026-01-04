package Dsa_Practice.Stack;

import java.util.Stack;

public class infix_to_postfix {

    public  static int precedence(char c){
        if(c == '+' || c == '-') return 1;
        if(c == '*' || c == '/') return 2;
        if(c == '^') return 3;
        return -1;
    }

    public static String infixToPostfix(String infix) {
        Stack<Character> st = new Stack<>();

        String postfix = "";

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if(c == ' ') {
                continue;
            }
//            1️⃣ Operand check
            if(Character.isLetterOrDigit(c)){
                postfix = postfix + c;
            }

//            2️⃣ Opening bracket (
            else if (c == '('){
                st.push(c);
            }

//            3️⃣ Closing bracket )
            else if(c == ')'){
                while (!st.isEmpty() && st.peek() != '(' ){
                    postfix += st.pop();
                }
                st.pop(); // remove '('

//             4️⃣ Operator case
            } else {
                while (!st.isEmpty() && precedence(st.peek()) >= precedence(c)){
                    postfix += st.pop();
                }
                st.push(c);
            }


        }

        // 5 Bache huay operators
        while (!st.isEmpty()){
            postfix += st.pop();
        }
        return postfix;


    }

    public static void main(String[] args) {

        String exp = "4 + 5 / 6 - 7 * 9 + 1";
        String result = infixToPostfix(exp);
        System.out.println(result);

    }
}
