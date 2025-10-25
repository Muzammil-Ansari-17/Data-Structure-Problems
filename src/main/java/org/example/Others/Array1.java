package org.example.Others;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        double[] temperature = new double[7];
        Scanner sc = new  Scanner(System.in);
        String[] days = {"Monday, Tuesday, Wednesday, Thursday , Friday, Saturday,Sunday"};


        for (int i = 0; i < days.length; i++) {
            System.out.println(days[i] + " ");
            temperature[i] = sc.nextDouble();
        }

    }
}
