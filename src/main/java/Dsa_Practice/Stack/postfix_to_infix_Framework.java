package Dsa_Practice.Stack;

import java.util.Stack;

public class postfix_to_infix_Framework {

    // Function to check if a character is operator
    static boolean isOperator(char c) {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    // Function to convert Postfix to Infix
    static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            // If operand, push to stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(String.valueOf(c));
            }
            // If operator, pop two elements and combine
            else if (isOperator(c)) {
                String op2 = stack.pop();
                String op1 = stack.pop();
                String exp = "(" + op1 + c + op2 + ")";
                stack.push(exp);
            }
        }

        // Final expression on stack is the infix form
        return stack.pop();
    }

    public static void main(String[] args) {
        String postfix = "AB+C*"; // Example: (A+B)*C
        System.out.println("Postfix: " + postfix);
        System.out.println("Infix: " + postfixToInfix(postfix));
    }
}
