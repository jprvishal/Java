package com.sharma.datastructure.searching;

import com.sharma.datastructure.TestDataHelper;
import com.sharma.datastructure.sorting.ShellSort;

public class BinarySearch {
	
	public static int search(int[] searchList, int searchNumber) {
		if (searchList.length == 0) {
				return -1;
		}
		
		int start = 0;
		int end = searchList.length -1;

		while(start < end) {
			int mid = start + ((end - start) / 2);
			int midElement = searchList[mid];
			
			if (midElement == searchNumber){
				return mid;
			}
			
			if (midElement > searchNumber) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	
	public static void main(String[] args) {
        int searchNumber = 199;
        int[] arr = TestDataHelper.prepareIntArray();
        ShellSort shellSort = new ShellSort();
        long startTime = System.currentTimeMillis();
        arr = shellSort.sort(arr);

        // int[] arr = {10,15,17,80,99,115,250};


		int indexOfElement = BinarySearch.search(arr, searchNumber);

		if (indexOfElement > 0) {
			System.out.println("Element found at index " + indexOfElement);
		} else {
			System.out.println("Element not found in list");
		}
        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));
	}
}
