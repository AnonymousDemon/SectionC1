package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class Harmonic2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int range;
		System.out.println("Enter range for harmonic series");
		
		range = scanner.nextInt();
		double[][] arr = new double[1][range];
		double temp;
		
		for (int i = 1; i <= range; i++) {
			temp = Utility.harmonicSeries(i);
			arr[0][i-1] = temp;
			
		}
		// printing two dim array
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		scanner.close();
	}

}
