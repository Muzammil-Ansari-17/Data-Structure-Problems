package org.example;
//24F-CS-154
//Muzammil Ahmed
public class Some_Arthmetic {
    public static void main(String[] args) {
        int[] A = {25,14,12,74,58,74,98,84,15,25};
        int[] B = {87,11,10,81,67,94,74,82,15,87};
        double[] C = new double[10];
            System.out.println("  C");
        for (int i = 0; i < A.length; i++) {
            int max = Math.max(A[i],B[i]);
            int min = Math.min(A[i],B[i]);
            C[i] =  (max + (min / 100.0));

        }
        for (double x: C){
            System.out.println(x);
        }
    }
}

