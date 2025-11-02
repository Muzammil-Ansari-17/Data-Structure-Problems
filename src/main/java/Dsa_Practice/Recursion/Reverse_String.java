package Dsa_Practice.Recursion;

public class Reverse_String {
    public String reverse(String n){
        if(n.isEmpty()){
            return n;
        }
        return reverse(n.substring(1)) + n.charAt(0);
    }

    public static void main(String[] args) {
        Reverse_String obj = new Reverse_String();
        System.out.print(obj.reverse("Muzammil"));
    }
}
