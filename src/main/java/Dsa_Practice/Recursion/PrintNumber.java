package Dsa_Practice.Recursion;

public class PrintNumber {
    public void print(int n ){
        if(n == 0) return;
        System.out.println(n);
        print(n -1);
    }

    public static void main(String[] args) {
        PrintNumber obj = new PrintNumber();
        obj.print(10);
    }
}
