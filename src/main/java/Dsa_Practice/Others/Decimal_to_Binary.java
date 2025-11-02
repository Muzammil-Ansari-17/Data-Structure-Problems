package Dsa_Practice.Others;

public class Decimal_to_Binary {

        public static void main(String[] args) {
            int n = 10;  // you can change this number
            String binary = "";

            while (n > 0) {
                binary = (n % 2) + binary;  // store remainder in front
                n = n / 2;  // divide by 2
            }

            System.out.println("Binary: " + binary);
        }
}

