package org.example.Array;
//24F-CS-154
//Muzammil Ahmed

public class Dynamic_Array {
    int[] arr;
     int size;

    public Dynamic_Array(int capacity){
        this.arr = new int[capacity];
        this.size = 0;
    }
    public void insert(int item){
        if(size == arr.length){
            resize();
        }
        arr[size] = item;
        size++;
    }

    public void remove(int index){
        for (int i = index; i < size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[size -1 ] = 0;
        size--;
    }

    public int indexof(int value){
        for (int i = 0; i < size; i++) {
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public void update(int index, int value){
        arr[index] = value;
    }

    private void resize(){
        int newcapacity = arr.length*2;
        int[] newarr = new int[newcapacity];

        for (int i = 0; i < size; i++) {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }

    public void display(){
        for (int i = 0; i < size; i++){
            System.out.println(arr[i]);
        }

    }

    //24F-CS-154
    //Muzammil Ahmed
    public static class Main {
        public static void main(String[] args) {

            Dynamic_Array A = new Dynamic_Array(10);
            System.out.println("Inserting Array");
            A.insert(20);
            A.insert(30);
            A.insert(40);
            A.insert(50);
            A.insert(66);
            A.insert(43);
            A.insert(31);
            A.insert(59);
            A.insert(10);
            A.insert(51);
            A.display();

            System.out.println("Finding index");
            int find = A.indexof(30);
            System.out.println(find);

            System.out.println("remove value");
            A.remove(5);
            A.remove(3);
            A.remove(0);
            A.remove(8);
            A.display();

            System.out.println("Update value");
            A.update(2,55);
            A.update(4,81);
            A.display();

        }
    }
}


