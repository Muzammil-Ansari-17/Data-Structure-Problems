package org.example.Others;

public class Array {
        private int arr[];
        private int count = 0 ;

        public Array(){
            arr = new int[5];
        }

     public  void insert(int item){
            if(count == arr.length){
                int[] temp = new int[count*2];
                for (int i = 0; i < count; i++) {
                    temp[i] = arr[i];
                }
                arr = temp;
            }
            arr[count++] = item;
     }

     public void remove(int index){
         for (int i = index ; i < count -1 ; i++) {
             arr[i] = arr[i +1];
         }
         arr[count -1 ] = 0;
         count--;
     }

     public void removebyvalue(int num){
         int index = -1;
            for (int i = 0; i < arr.length; i++) {
                 if(arr[i] == num){
                     index = i;
                     break;
                 }
         }
         if(index == -1 ){
             System.out.println("not found");
         }

         for (int i = index; i < count -1 ; i++) {
             arr[i] = arr[i+1];
         }
         arr[count -1] = 0;
         count--;
     }

    public int linearsearch(int search){
        for (int i = 0; i < count; i++) {
            if(arr[i] == search){
                return i;
            }
        }
        return -1;
    }
    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i]);
        }
    }

    public  void update (int index , int value){
            arr[index] = value;
    }

    public int[] bubblesort(int[] arr){
            int n = count;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n -1 -i; j++) {
             if(arr[j] > arr[j +1]){
                 int temp = arr[j];
                 arr[j] = arr[j+1];
                 arr[j+1] = temp;
             }
            }
        }
        return arr;
    }

    public int binary_search(int[] arr,int target){
            int low = 0;
            int high = count-1;
            while(low <= high){
                int mid = (low+high) / 2;

                if(arr[mid] == target){
                    return mid;
                } else if (arr[mid] < target) {
                    low = mid +1 ;
                }else{
                    high = mid -1;
                }
            }

        return -1;
    }


    public static void main(String[] args) {
        Array obj = new Array();
        obj.insert(55);
        obj.insert(45);
        obj.insert(41);
        obj.insert(28);
        obj.display();

        System.out.println("remove by index");
        obj.remove(2);
        obj.display();

        System.out.println("remove by value");
        obj.removebyvalue(55);
        obj.display();

        System.out.println("Searching");
        obj.linearsearch(45);

        System.out.println("update");
        obj.update(2,66);
        obj.display();

        System.out.println("bubble sort");
        int[] sortarr = obj.bubblesort(obj.arr);
        for (int i = 0; i < obj.count; i++) {
            System.out.println(sortarr[i]);
        }

        System.out.println("binary search");
        int pos = obj.binary_search(sortarr,55);
        for (int i = 0; i < obj.count ; i++) {
            System.out.println(pos != -1 ? "found at index"+pos:" not found");
            break;
        }
    }
}
