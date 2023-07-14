package com.learn.sortingalgorithms.insertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr =  {45,1,67,2,9,12};
        InsertionSort I1 = new InsertionSort();
        I1.sort(arr);
        I1.printArray(arr);


    }
    void sort(int arr[]){
        int temp = 0;
        int j =0;
        for(int i =1;i<arr.length;i++){
            temp = arr[i];
            j = i -1;
            while(j >= 0 && arr[j] > temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
