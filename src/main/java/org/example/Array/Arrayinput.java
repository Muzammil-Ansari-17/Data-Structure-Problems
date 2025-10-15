package org.example.Array;

class Arrayinput {

    private int[] myarr;
    private int count = 0;

    public Arrayinput(){
        myarr = new int[5];
    }

    public void insert(int item){

        if(count == myarr.length ){
            int[] temp= new int[count*2];
            for (int i = 0; i < count; i++) {
                temp[i] = myarr[i];
            }
            myarr = temp;
        }
        myarr[count++] = item;

    }


    public void display(){
        for (int i = 0; i < count; i++) {
            System.out.println(myarr[i]);
        }
    }


    public static class Array_Search_By_Index extends Array_Size_by_User {
        int num;
        public void search_num(){
            System.out.println("enter num to search :");
            num = sc.nextInt();
        }


        public void search(){
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == num){
                    System.out.println("Number is found in "+i+" index.");
                }else {
                    System.out.println("Not Found!");
                }
            }
        }
    }
}

