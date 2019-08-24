package com.bridgelabz.arrays;

import java.util.Scanner;

import com.bridgelabz.utilityC.Utility;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int m=scanner.nextInt(),sum=0;
		if(Utility.isPrime(m)==true) {
			System.out.println(m);
		}
		else
		{
			System.out.println("not prime");

		}
	}

}
