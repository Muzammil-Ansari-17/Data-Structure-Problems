package org.example.Others;

import java.util.Stack;

public class postfix_prefix {

        // Method to return precedence of operators
        public static int precedence(char ch) {
            switch (ch) {
                case '^':
                    return 3;
                case '*':
                case '/':
                    return 2;
                case '+':
                case '-':
                    return 1;
                default:
                    return -1;
            }
        }

        // Method to convert infix expression to postfix
        public static String infixToPostfix(String expression) {
            StringBuilder result = new StringBuilder();
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < expression.length(); i++) {
                char ch = expression.charAt(i);

                // If operand, add to result
                if (Character.isLetterOrDigit(ch)) {
                    result.append(ch);
                }
                // If '(', push to stack
                else if (ch == '(') {
                    stack.push(ch);
                }
                // If ')', pop until '('
                else if (ch == ')') {
                    while (!stack.isEmpty() && stack.peek() != '(') {
                        result.append(stack.pop());
                    }
                    stack.pop(); // remove '('
                }
                // If operator
                else if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '^') {
                    while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(ch)) {
                        if (ch == '^' && stack.peek() == '^') break; // Right associative
                        result.append(stack.pop());
                    }
                    stack.push(ch);
                }
            }

            // Pop remaining operators
            while (!stack.isEmpty()) {
                result.append(stack.pop());
            }

            return result.toString();
        }

        // Driver code
        public static void main(String[] args) {
            String infix = "(H/K)L+M(N+O)*P^Q";
            String postfix = infixToPostfix(infix);
            System.out.println("Infix Expression:   " + infix);
            System.out.println("Postfix Expression: " + postfix);
        }
    }


