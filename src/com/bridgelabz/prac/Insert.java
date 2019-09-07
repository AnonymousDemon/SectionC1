package com.bridgelabz.prac;

import java.util.Scanner;

import com.bridgelabz.utilityC.sortUtility;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[],n;
		Scanner scanner = new Scanner(System.in) ;
		System.out.println("How many numbers u want");
		n = scanner.nextInt();
		System.out.println("enter the numbers");
		int[] integers = new int[n];
		
		
		sortUtility.sort(integers);;
	}

}
