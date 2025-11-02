package Dsa_Practice.Recursion;

public class Fibonacci_number {
    public int fibonacci(int num){
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1 ) + fibonacci( num  - 2 );
    }
     public static void main(String[] args) {
            Fibonacci_number obj = new Fibonacci_number();
            int i = 25;
            for (int j = 0; j < i ; j++) {
                System.out.print(obj.fibonacci(j)+ " ");
         }
    }
}
