package com.learn.sortingalgorithms.quickSort;

public class QuickSort {
    private int arr[];
    private int length;

    public static void main(String[] args) {
        int[] inputArr = {24,2,45,20,56,75,2,56,99,53};
        QuickSort q1 = new QuickSort();
        q1.sort(inputArr);
        q1.printArray(inputArr);

    }

    public void sort(int[] inputArr){
        if(inputArr == null || inputArr.length == 0){
            return;
        }
        this.arr = inputArr;
        this.length = inputArr.length;
        quickSort(0,length-1);

    }

    private void quickSort(int lowerIndex, int higherIndex){
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = arr[lowerIndex + (higherIndex-lowerIndex)/2];
        while (i<=j){
            while (arr[i] <pivot){
                i++;
            }
            while (arr[j] > pivot){
                j--;
            }
            if(i<=j){
                exchangeNumber(i,j);
                i++;
                j--;
            }

        }
        if(lowerIndex < j){
            quickSort(lowerIndex,j);
        }
        if(i< higherIndex){
            quickSort(i,higherIndex);
        }
    }

    private void exchangeNumber(int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}
