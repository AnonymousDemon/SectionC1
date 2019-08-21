package com.bridgelabz.sort;

import com.bridgelabz.utilityC.sortUtility;

public class Insertionsort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] arr ={"Atlanta","New York","Dallas","Omaha","San Francisco"};
		String sortedArray[] = sortUtility.sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++){
		System.out.println(sortedArray[i]);
	}
	}
}
