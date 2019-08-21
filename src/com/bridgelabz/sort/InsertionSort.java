package com.bridgelabz.sort;

import java.util.Scanner;

import com.bridgelabz.utilityC.sortUtility;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many number you want in array:");
		int num = scanner.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter number of array");
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		sortUtility.sort(arr);
       
  
        sortUtility.printArray(arr); 
        scanner.close();
	}

}
