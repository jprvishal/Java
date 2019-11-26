package com.sharma.algorithm.search;

public class BinarySearchTest {

    public static void main(String[] args) {
        int[] arr = {2,9,7,11,15,4,8};
        int searchValue = 11;

        BinarySearch binarySearch = new BinarySearch();
        int index = binarySearch.search(arr, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " is at index " + index + " in given array.");
        } else {
            System.out.println(searchValue + " is not present in the given arrary.");
        }

        index = binarySearch.searchIterative(arr, searchValue);
        if (index >= 0) {
            System.out.println(searchValue + " is at index " + index + " in given array.");
        } else {
            System.out.println(searchValue + " is not present in the given arrary.");
        }
    }
}
