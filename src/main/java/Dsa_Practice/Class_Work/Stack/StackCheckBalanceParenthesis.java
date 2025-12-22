/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Stack;

/**
 *
 * @author HAROON TRADERS
 */
public class StackCheckBalanceParenthesis {
    char stackArr[];
    int top;

    public StackCheckBalanceParenthesis(int sizeOfStack) {
        stackArr = new char[sizeOfStack];
        this.top = -1;
        
    }
    public void push(char data){
        if(top==stackArr.length-1){
            System.out.println("Stack Overflow");
            return;
        }else{
        
            stackArr[++top] = data;
        }
    }
    public char pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return '0';
        }else{
            return stackArr[top--];
        }
    }
    
    public int checkParenthesis(String exp){
        int check=0;
        for (int i = 0; i < exp.length(); i++) {
            if(exp.charAt(i)=='[' || exp.charAt(i)=='{' || exp.charAt(i)=='(')
            {
                push(exp.charAt(i));
            }
            if(exp.charAt(i)==']' || exp.charAt(i)=='}' || exp.charAt(i)==')')
            {
                if(top==-1){
                    System.out.println("Right Parenthesis are More than Left");
                    return 0;
                }else{
                
                    char popFromStack = pop();
                    check = checkBalance(popFromStack, exp.charAt(i));
                }
            }
        }
    return check;
    }
    
    public int checkBalance(char a, char b){
        if(a=='[' && b==']')
            return 1;
        if(a=='{' && b=='}')
            return 1;
        if(a=='(' && b==')')
            return 1;
        return 0;
    }
    
}
