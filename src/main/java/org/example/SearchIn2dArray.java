package org.example;

public class SearchIn2dArray extends TwodArrray {

    public void search() {

        System.out.println("Enter num to search :");
        int num = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (num == arr[i][j]) {
                    System.out.println("Found in :" + i + " " + j);
                    found = true;
                }
            }

            }
        if (!found) {
            System.out.print("Not Found ");
        }
    }
}


