package com.learn.sortingalgorithms.mergeSort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1,7,2,4,9,34,8};
        MergeSort m1 = new MergeSort();
        m1.mergeSort(arr);
        m1.printArray(arr);


    }
     static void mergeSort(int[] arr){
        if(arr.length > 1){
            int mid = arr.length /2;
            int[] left = Arrays.copyOfRange(arr,0,mid);
            int[] right = Arrays.copyOfRange(arr,mid,arr.length);
            mergeSort(left);
            mergeSort(right);
            merge(arr,left,right);

        }
    }
     static void merge(int[] arr,int[] left, int[] right){
        int i = 0;
        int j =0;
        int k =0;
        while(i < left.length && j < right.length){
            if(left[i] <= right[j])
                arr[k++] = left[i++];
            else
                arr[k++] = right[j++];

        }
        while (i<left.length){
            arr[k++] = left[i++];

        }
        while ((j< right.length)){
            arr[k++] = right[j++];

        }

    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
