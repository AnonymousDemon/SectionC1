package com.bridgelabz.arrays;

import java.util.Scanner;

public class H {
	public void PrintHarmonic(double number) {
		System.out.print("Harmonic series of 1= ");
		double n=1;
		
		System.out.print(n+"+");
		for (int i = 2; i < number; i++)
		{
		
				System.out.print(n/i+"+" );
				
		}

		System.out.print(n/number);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		H a = new H();
		double number;
		System.out.println("Enter Number Uptil you want to Find Harmonic");
		number=scanner.nextDouble();
		a.PrintHarmonic(number);
		
	}

}
