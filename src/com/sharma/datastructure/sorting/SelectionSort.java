package com.sharma.datastructure.sorting;

import com.sharma.datastructure.TestDataHelper;

public class SelectionSort {

    public void selectionSort() {
        //move lowest or highest element to the right position
        //int a[]={0,101,-3,10,5,2,1,12,3,0,0,1,21,8,3,-1,-2};
        int[] a = TestDataHelper.prepareIntArray();
        int tempIndex=0;
        int maxelement=a.length;

        long startTime = System.currentTimeMillis();
        for(int index=0;index < maxelement;index++){
            tempIndex=index;
            for(int nextIndex=index+1;nextIndex < maxelement;nextIndex++){
                if(a[index] > a[nextIndex]){
                    if(a[tempIndex] >= a[nextIndex]){
                        tempIndex=nextIndex;
                    }
                }
            }
            System.out.println("Swap TemIndex: " + tempIndex + " Index:"+index + "tempIndex value:"+a[tempIndex] + "Index value" + a[index]);
            int temp = a[tempIndex];
            a[tempIndex]=a[index];
            a[index]=temp;

        }

        //Loop for printing
        for(int i=0;i<maxelement; i++){
            System.out.print(a[i] + ",");
        }
        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));

    }


    public int[] sort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++ ) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }
        }

        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {

        SelectionSort selectionSort = new SelectionSort();
        //int[] arr = {5,4,2,1,3,10,25,19,35,0,100,95,59,65,78,87,28,11,101,320,450,1000,900,800,700,750,600,500,580,110,8,15,875};
        int[] arr = TestDataHelper.prepareIntArray();
        System.out.println("Original Array :-");
        print(arr);

        long startTime = System.currentTimeMillis();
        int[] result = selectionSort.sort(arr);
        System.out.println("\nSorted Array :-");
        print(result);
        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));
        System.out.println("\n\n");
        selectionSort.selectionSort();
    }
}
