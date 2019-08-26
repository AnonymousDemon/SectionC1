package com.bridgelabz.arrays;

import java.util.Scanner;

public class HarmonicNo {

	static String harmonic(int n) {
		int h = 1;
		String x =null;
		for (int i = 2; i <= n; i++) {
		 x = h +""+ 1 / i;
		}
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		/*
		 * try and catch to not terminate at wrong input
		 */
		try {
			System.out.println("enter harmonic no to find");
			int n = s.nextInt();
			System.out.println(harmonic(n));

		} catch (Exception e) {
			System.out.println("enter integer");
			
		}
		s.close();
	}

}
