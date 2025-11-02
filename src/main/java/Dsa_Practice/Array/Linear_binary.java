package Dsa_Practice.Array;
import java.util.Scanner;
//24F-CS-154
//Muzammil Ahmed
public class Linear_binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of Array :");
        int size = sc.nextInt();


        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter elements of Array" + i + " :");
            arr[i] = sc.nextInt();
        }

        System.out.println();

        System.out.println("Enter target value :");
        int target = sc.nextInt();

        System.out.println();

        System.out.println("Linear Search ");
        linearSearch(arr, target);

        System.out.println("Sorted array");
        for (int x : sort(arr)) {
            System.out.println(x);
        }


        System.out.println("Binary Search ");
        binarysearch(arr, target);

        int[] sizes = {1000, 10000, 100000, 1000000};

        System.out.println("n\t\t\t\t\t\tLinear Search (ns)\tBinary Search (ns)");
        System.out.println("----------------------------------------------------");

        for (int n : sizes) {
            int[] testarr = new int[n];
            for (int i = 0; i < n; i++) {
                testarr[i] = i;
            }
            int testtarget = n - 1;


            long Lstart = System.nanoTime();
            linearSearch(testarr, testtarget);
            long Lend = System.nanoTime();
            long Ltime = Lend - Lstart;


            long Bstart = System.nanoTime();
            binarysearch(testarr, testtarget);
            long Bend = System.nanoTime();
            long Btime = Bend - Bstart;


            System.out.println(n + "\t\t\t\t\t\t" + Ltime + "\t\t\t\t\t\t" + Btime);
        }
    }

    public static void linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(target+" at index :"+i);
                return;
            }
        }
    }

    public static int[] sort(int[] arr){
        for (int i = 0; i < arr.length -1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void binarysearch(int[]arr, int target){
        sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low+high) / 2;
            if(arr[mid] == target){
                System.out.println(target+" found at index "+mid);
                return;
            } else if (arr[mid] < target) {
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        System.out.println("Not found");
    }
}
