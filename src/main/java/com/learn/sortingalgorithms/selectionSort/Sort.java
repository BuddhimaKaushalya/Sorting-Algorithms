package com.learn.sortingalgorithms.selectionSort;

public class Sort {
    public static void main(String[] cat){
        int[] arr = {7,4,2,5,3};
        Sort s1 = new Sort();
        s1.sorting(arr);
        printArray(arr);
    }

    static void sorting(int arr[]){
        for(int i = 0; i < arr.length-1;i++){
            int index = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }

            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    static void printArray(int arr[]){
        int n =arr.length;
        for(int i =0; i<n;i++){
            System.out.println(arr[i] );
        }
    }
}
