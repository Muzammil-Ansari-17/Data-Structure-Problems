/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Stack;

/**
 *
 * @author HAROON TRADERS
 */
public class BalanceParenthesis {
    public static void main(String[] args) {

    String st = "[{(a+b+)}]}";
    StackCheckBalanceParenthesis spb = new StackCheckBalanceParenthesis(st.length());
    int balance = spb.checkParenthesis(st);
    if(balance==1)
        System.out.println("Paranthesis in Expression is/are valid:    "+st);
    else
        System.out.println("Parenthesis in Expression is/are Invalid:  "+st);
        
    












//        int opn=0;
//        int cl=0;
//        String st = "{[(a+b}]";
//        for (int i = 0; i < st.length(); i++) {
//            if(st.charAt(i)=='[' || st.charAt(i)=='{' || st.charAt(i)=='(')
//                opn++;
//            if(st.charAt(i)==']' || st.charAt(i)=='}' || st.charAt(i)==')')
//                cl++;
//        }
//        if(opn==cl)
//            System.out.println("paranthesis are equal in number");
//        else
//            System.out.println("Parenthesis are not equal");
    }
}
