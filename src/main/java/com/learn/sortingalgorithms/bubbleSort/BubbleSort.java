package com.learn.sortingalgorithms.bubbleSort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] list = {4,1,7,3,8,5};
        BubbleSort b1 = new BubbleSort();
        b1.bubbleSort(list);
        b1.printArray(list);

    }
    public int[] bubbleSort(int[] list){
        for(int i = 0; i <list.length-1;i++){
            for(int j = 0; j< list.length-1-i;j++){
                if(list[j] > list[j+1]){
                    int temp = 0;
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }

        return list;
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
