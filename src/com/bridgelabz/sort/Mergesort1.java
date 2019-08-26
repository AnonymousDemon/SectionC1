package com.bridgelabz.sort;

import com.bridgelabz.utilityC.sortUtility;

public class Mergesort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] strArr = { "rishi", "vicky", "wasim", "naufil", "abhishek" };
		System.out.println("Unsorted Array");
		sortUtility.printArray2(strArr);
		System.out.println();

		sortUtility.mergeSort(strArr, 0, strArr.length - 1);
		
		System.out.println("Sorted Array using Merge sort");
		sortUtility.printArray2(strArr);


}
}
