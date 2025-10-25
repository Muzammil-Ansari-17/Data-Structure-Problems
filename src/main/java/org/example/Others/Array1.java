package org.example.Others;

import java.util.Scanner;

public class Array1 {

    public static void main(String[] args) {

        double[] temp = new double[7];
        Scanner sc = new  Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday" , "Friday", "Saturday", "Sunday"};


        for (int i = 0; i < days.length; i++) {
            System.out.print(days[i] + " ");
            temp[i] = sc.nextDouble();
        }

        double maxtemp = temp[0];
        double mintemp = temp[0];
        int maxdayindex = 0;
        int mindayindex = 0;

        for (int i = 0; i < temp.length; i++) {
            if(temp[i] > maxtemp){
                maxtemp = temp[i];
                maxdayindex = i;
            }
            if(temp[i] < mintemp){
                mintemp = temp[i];
                mindayindex = i;
            }
        }
        System.out.println("Highest temp was on "+days[maxdayindex]+ " :"+maxtemp);
        System.out.println("Minnimum temp was on "+days[mindayindex]+ " :"+mintemp);

    }
}
