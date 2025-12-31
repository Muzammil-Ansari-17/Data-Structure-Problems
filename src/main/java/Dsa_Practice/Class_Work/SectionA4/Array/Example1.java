/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dsa_Practice.Class_Work.SectionA4.Array;


public class Example1 {

    public static void main(String[] args) {
        int A[] = {25,14,12,74,38,74,98,84,15,24};
        int B[] = {87,11,10,81,67,94,74,82,15,87};
        double C[] = new double[10];
        
        for (int i = 0; i < 10; i++) {
            if(A[i]<B[i])
                C[i] = (double)A[i] / 100 + B[i];
            else
                C[i] = (double)B[i] / 100 + A[i];
        }
        System.out.println("A       B       C");
        for (int i = 0; i < 10; i++) {
            System.out.println(A[i]+"       "+B[i]+"        "+C[i]);
        }
    }
}
