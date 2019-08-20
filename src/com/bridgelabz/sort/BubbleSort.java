package com.bridgelabz.sort;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter how many number you want in array:");
		int num = scanner.nextInt();
		int[] arr = new int[num];
		int n = arr.length;
		System.out.println("Enter number of array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Array is taken");
		System.out.println("Unsorted array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}

		// for bubble sort

		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					// swap arr[j+1] and arr[i]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
		System.out.println("Sorted Array");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]);
		}
		scanner.close();
	}

}
