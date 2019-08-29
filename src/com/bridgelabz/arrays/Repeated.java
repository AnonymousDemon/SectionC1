package com.bridgelabz.arrays;

import com.bridgelabz.utilityC.Utility;

public class Repeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = new int[100];
		int repeatedNumber;
		for (int i = 0; i < 99; i++) {
			arr[i] = i + 1;
		}
		arr[99] = (int) (Math.random() * 99 + 1);
		// printing array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		// finding repeated in array
		repeatedNumber = Utility.findRepeatedInArray(arr);
		int[][] rep = new int[1][1];
		rep[0][0] = repeatedNumber;
		System.out.println("Repeated Number is : " + rep[0][0]);
	}

}
