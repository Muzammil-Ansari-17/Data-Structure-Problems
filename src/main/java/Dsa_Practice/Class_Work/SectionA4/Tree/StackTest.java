/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Tree;

/**
 *
 * @author HAROON TRADERS
 */
public class StackTest {
    public void print(int n){
        if(n==10)
            return;
        System.out.println(n);
        print(n+1);
    }
    public static void main(String[] args) {
        StackTest st = new StackTest();
        st.print(1);
    }
}
