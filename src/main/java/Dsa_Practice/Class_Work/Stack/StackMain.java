/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.Stack;

/**
 *
 * @author HAROON TRADERS
 */
public class StackMain {
    public static void main(String[] args) {
       // StackStatic ss = new StackStatic(5);
       
        StackDynamic ss = new StackDynamic();
        ss.push(5);
        ss.push(10);
        ss.push(15);
        ss.push(20);
        ss.push(25);
        ss.push(30);
        ss.push(35);
        ss.pop();
        ss.pop();
         ss.pop();
        ss.pop();
         ss.pop();
        ss.pop();
        ss.push(25);
        ss.push(320);
        ss.push(53);
         ss.pop();
        ss.pop();
        ss.push(350);
         ss.pop();
        ss.pop();
         ss.pop();
        ss.pop();
    }
}
