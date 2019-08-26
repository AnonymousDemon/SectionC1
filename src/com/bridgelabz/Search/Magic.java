package com.bridgelabz.Search;

import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		Utility.magicNumber(range);
		
		scanner.close();
	}

}
